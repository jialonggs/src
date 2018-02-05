package com.jialong.jlmanager.controller;

import com.alibaba.fastjson.JSONObject;
import com.jialong.jlmanager.bean.RequestBean;
import com.jialong.jlmanager.model.*;
import com.jialong.jlmanager.model.responseModel.CollectmouldListResp;
import com.jialong.jlmanager.model.responseModel.PkGuidIdResp;
import com.jialong.jlmanager.service.impl.CollectionServiceIF;
import com.jialong.jlmanager.service.impl.PartServiceIF;
import com.jialong.jlmanager.util.DateFormatUtil;
import com.jialong.jlmanager.util.PageBean;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import java.util.*;

@RestController
public class CollectionController {
    @Autowired
    CollectionServiceIF collectionService;
    @Autowired
    PartServiceIF partService;



    /**
     * 获取收模列表
     * @param requestBean
     * @return
     */
    @RequestMapping(value = "/collection/list", method = RequestMethod.POST )
    @ResponseBody
    public ResponseDataEntity  getCollectionList(@RequestBody RequestBean requestBean) {
        ResponseDataEntity responseDataEntity = new ResponseDataEntity();
        DocCollectmouldEntity collect = new DocCollectmouldEntity();
        collect.setAdduser(requestBean.getUserId());
        // 进行分页查询
        PageInfoEntity pageInfoEntity = JSONObject.parseObject(requestBean.getPageInfo(),PageInfoEntity.class);
        PageBean<DocCollectmouldEntity> pageData = collectionService.getCollection(collect,pageInfoEntity);
        if(null == pageData) {
            responseDataEntity.setCode(2);
            responseDataEntity.setMsg("查询出错");
            return responseDataEntity;
        }
        List<DocCollectmouldEntity> collectmouldEntities = pageData.getItems();
        if(collectmouldEntities != null && collectmouldEntities.size() > 0 ) { //非空
            List<CollectmouldListResp> respsList = new ArrayList<CollectmouldListResp>();
            for(DocCollectmouldEntity docCollectmouldEntity : collectmouldEntities){
                CollectPartinfoEntity partinfoEntity = new CollectPartinfoEntity();
                partinfoEntity.setCollectmouldId(docCollectmouldEntity.getPkGuid());
                // 获取模具信息
                List<CollectPartinfoEntity> collectPartinfoEntities = partService.getParts(partinfoEntity);
                CollectmouldListResp resp = new CollectmouldListResp();
                resp.setMouldNums(0);
                if(null != collectPartinfoEntities) {
                    resp.setMouldNums(collectPartinfoEntities.size());
                }
                resp.setAddUser(docCollectmouldEntity.getAdduser());
                resp.setBatch(docCollectmouldEntity.getBatch());
                resp.setClientCompanyName(docCollectmouldEntity.getClientcompany());
                resp.setPkGuid(docCollectmouldEntity.getPkGuid());
                // 对时间进行格式化
                resp.setCreateTime(DateFormatUtil.stringToString(docCollectmouldEntity.getCreatetime(),DateFormatUtil.YYYY_MM_DD));
                respsList.add(resp);
            }
            responseDataEntity.setCode(0);
            //设置分页信息
            pageInfoEntity.setTotalnum(pageData.getPageInfo().getTotal());
            responseDataEntity.setPageInfoEntity(pageInfoEntity);
            responseDataEntity.setData(respsList);
        } else {
            responseDataEntity.setCode(3);
            responseDataEntity.setMsg("数据查询为空");
        }
        return responseDataEntity;
    }

    /**
     * 添加收模基础信息
     * @param requestBean
     * @return
     */
    @RequestMapping(value = "/add/collection", method = RequestMethod.POST)
    @ResponseBody
    public ResponseDataEntity  addCollection(@RequestBody RequestBean requestBean) {
        ResponseDataEntity responseDataEntity = new ResponseDataEntity();
        try {
            DocCollectmouldEntity docCollectmouldEntity =  JSONObject.parseObject(requestBean.getData(),DocCollectmouldEntity.class);
            docCollectmouldEntity.setAdduser(requestBean.getUserId());
            long time = Long.parseLong(docCollectmouldEntity.getCreatetime());
            String receiveTime = DateFormatUtil.longToString(time, DateFormatUtil.YYYY_MM_DD_HH_MM);
            docCollectmouldEntity.setCreatetime(receiveTime);
            // 生成主键
            String uuid = UUID.randomUUID().toString();
            docCollectmouldEntity.setPkGuid(uuid);
            // 执行添加
            collectionService.addNewCollection(docCollectmouldEntity);
            // 设置返回变量
            PkGuidIdResp resp = new PkGuidIdResp();
            resp.setPkGuid(uuid);
            responseDataEntity.setCode(0);
            responseDataEntity.setData(resp);
            return  responseDataEntity;
        } catch (Exception e) {
            e.printStackTrace();
            responseDataEntity.setCode(2);
            responseDataEntity.setMsg("添加失败");
            return  responseDataEntity;
        }
    }

    /**
     * 更新基础数据
     * @param requestBean
     * @return
     */
    @RequestMapping(value = "/update/collection", method = RequestMethod.POST)
    @ResponseBody
    public ResponseDataEntity updateCollectionInfo(@RequestBody RequestBean requestBean) {
        ResponseDataEntity responseDataEntity = new ResponseDataEntity();
        DocCollectmouldEntity docCollectmouldEntity =  JSONObject.parseObject(requestBean.getData(),DocCollectmouldEntity.class);
        try {
            collectionService.updateCollection(docCollectmouldEntity);
            responseDataEntity.setCode(0);
        }catch (Exception e) {
            e.printStackTrace();
            responseDataEntity.setCode(2);
            responseDataEntity.setMsg("修改失败");
        }
        return  responseDataEntity;
    }

    /**
     * 添加收模模具的信息
     * @param requestBean
     * @return
     */
    @RequestMapping(value="/add/mouldinfo", method = RequestMethod.POST)
    @ResponseBody
    public ResponseDataEntity uploadCollection(@RequestBody RequestBean requestBean) {
        ResponseDataEntity responseDataEntity = new ResponseDataEntity();
        CollectPartinfoEntity collectPartinfoEntity =  JSONObject.parseObject(requestBean.getData(),CollectPartinfoEntity.class);
        collectPartinfoEntity.setAdduser(requestBean.getUserId());
        String uuid = UUID.randomUUID().toString();
        collectPartinfoEntity.setPkGuid(uuid);
        // 设置返回变量
        PkGuidIdResp resp = new PkGuidIdResp();
        resp.setPkGuid(uuid);
        try {
            partService.addMouldPartInfo(collectPartinfoEntity);
            responseDataEntity.setCode(0);
            responseDataEntity.setData(resp);
            return  responseDataEntity;
        }catch (Exception e) {
            e.printStackTrace();
            responseDataEntity.setCode(2);
            responseDataEntity.setMsg("添加失败");
            return  responseDataEntity;
        }
    }

    /**
     * 更新模具具体信息
     * @param requestBean
     * @return
     */
    @RequestMapping(value="/update/mouldinfo", method = RequestMethod.POST)
    @ResponseBody
    public ResponseDataEntity updatePartInfo(@RequestBody RequestBean requestBean) {
        ResponseDataEntity responseDataEntity = new ResponseDataEntity();
        CollectPartinfoEntity collectPartinfoEntity =  JSONObject.parseObject(requestBean.getData(),CollectPartinfoEntity.class);
        try {
            partService.updateCollectPart(collectPartinfoEntity);
            responseDataEntity.setCode(0);
        }catch (Exception e) {
            e.printStackTrace();
            responseDataEntity.setCode(2);
            responseDataEntity.setMsg("更改失败");
        }
        return  responseDataEntity;
    }

    /**
     * 获取所有模具信息
     * @param requestBean
     * @return
     */
    @RequestMapping(value = "/collection/getparts", method = RequestMethod.POST)
    @ResponseBody
    public ResponseDataEntity getColletAllPartsInfo(@RequestBody RequestBean requestBean) {
        ResponseDataEntity responseDataEntity = new ResponseDataEntity();
        String colletionId = requestBean.getData();
        if( null == colletionId || colletionId == ""){
            responseDataEntity.setCode(2);
            responseDataEntity.setMsg("参数不全");
        }
        CollectPartinfoEntity collectPartinfoEntity = new CollectPartinfoEntity();
        collectPartinfoEntity.setCollectmouldId(colletionId);
        List<CollectPartinfoEntity> list = partService.getParts(collectPartinfoEntity);
        if(null != list && list.size() > 0){
//            for(CollectPartinfoEntity item : list) {
//                String picUrl = item.getPicurl();
//                // 获取第一个图片
//                String[] url = SplitUrlUtil.getAllUrl(picUrl,"\\|");
//                item.setPicurl(url.toString());
//            }
            responseDataEntity.setCode(0);
            responseDataEntity.setData(list);
            return responseDataEntity;
        } else {
            responseDataEntity.setCode(3);
            responseDataEntity.setData("模具信息为空");
            return responseDataEntity;
        }
    }

    /**
     * 获取收模单基础信息
     * @param requestBean
     * @return
     */
    @RequestMapping(value = "/collection/baseinfo", method = RequestMethod.POST)
    @ResponseBody
    public ResponseDataEntity getCollectionInfo(@RequestBody RequestBean requestBean) {
        ResponseDataEntity responseDataEntity = new ResponseDataEntity();
        String docCollectionId = requestBean.getData();
        if( null == docCollectionId || docCollectionId == ""){
            responseDataEntity.setCode(2);
            responseDataEntity.setMsg("参数不全");
        }
        // 根据ID 获取
        DocCollectmouldEntity docCollectmouldEntity = collectionService.getCollectionDetail(docCollectionId);
        if(null != docCollectmouldEntity ){
            responseDataEntity.setCode(0);
            responseDataEntity.setData(docCollectmouldEntity);
            return responseDataEntity;
        } else {
            responseDataEntity.setCode(3);
            responseDataEntity.setMsg("获取数据为空");
            return  responseDataEntity;
        }
    }

    /**
     * 删除模具信息
     * @param requestBean
     * @return
     */
    @RequestMapping(value = "/collection/delpart", method = RequestMethod.POST)
    @ResponseBody
    public ResponseDataEntity delPartInfo(@RequestBody RequestBean requestBean) {
        ResponseDataEntity responseDataEntity = new ResponseDataEntity();
        String collectionPartId = requestBean.getData();
        if( null == collectionPartId || collectionPartId == ""){
            responseDataEntity.setCode(2);
            responseDataEntity.setMsg("参数不全");
            return responseDataEntity;
        }
        CollectPartinfoEntity collectPartinfoEntity = partService.getByPkGuid(collectionPartId);
        if(null == collectPartinfoEntity) {
            responseDataEntity.setCode(3);
            responseDataEntity.setMsg("未找到删除目标");
            return responseDataEntity;
        }
        collectPartinfoEntity.setIsdelete(true);
        partService.updateCollectPart(collectPartinfoEntity);
        responseDataEntity.setCode(0);
        return responseDataEntity;

    }


    /**
     * 添加拆模记录
     * @param requestBean
     * @return
     */
    @RequestMapping(value = "/collection/split", method = RequestMethod.POST)
    @ResponseBody
    public ResponseDataEntity addCaiMoInfo(@RequestBody RequestBean requestBean) {
        ResponseDataEntity responseDataEntity = new ResponseDataEntity();
        CollectSpitinfoEntity collectSpitinfoEntity = JSONObject.parseObject(requestBean.getData(), CollectSpitinfoEntity.class);
        String uuId = UUID.randomUUID().toString();
        collectSpitinfoEntity.setPkGuid(uuId);
        String userId = requestBean.getUserId();
        collectSpitinfoEntity.setAdduser(userId);
        try {
            long time = Long.parseLong(collectSpitinfoEntity.getSpittime());
            String splitTime = DateFormatUtil.longToString(time, DateFormatUtil.YYYY_MM_DD_HH_MM);
            collectSpitinfoEntity.setSpittime(splitTime);
            collectionService.addCollectionSplitInfo(collectSpitinfoEntity);
            responseDataEntity.setCode(0);
            responseDataEntity.setData(uuId);
            return responseDataEntity;
        } catch (Exception e) {
            e.printStackTrace();
            responseDataEntity.setCode(2);
            responseDataEntity.setMsg("添加失败");
            return responseDataEntity;
        }

    }

    /**
     * 获取拆模集合
     * @param requestBean
     * @return
     */
    @RequestMapping(value = "/collection/getsplitlist", method = RequestMethod.POST)
    @ResponseBody
    public ResponseDataEntity getAllSplitList (@RequestBody RequestBean requestBean) {
        ResponseDataEntity responseDataEntity = new ResponseDataEntity();
        CollectSpitinfoEntity collect = new CollectSpitinfoEntity();
        collect.setAdduser(requestBean.getUserId());
        PageInfoEntity pageInfoEntity = JSONObject.parseObject(requestBean.getPageInfo(),PageInfoEntity.class);
        PageBean<CollectSpitinfoEntity> pageData = collectionService.getCollectSplitList(collect,pageInfoEntity);
        if(null == pageData) {
            responseDataEntity.setCode(2);
            responseDataEntity.setMsg("查询出错");
            return responseDataEntity;
        }
        List<CollectSpitinfoEntity> collectSpites = pageData.getItems();
        if(collectSpites != null && collectSpites.size() > 0 ) { //非空
            pageInfoEntity.setTotalnum(pageData.getPageInfo().getTotal());
            responseDataEntity.setPageInfoEntity(pageInfoEntity);
            responseDataEntity.setCode(0);
            responseDataEntity.setData(collectSpites);
            responseDataEntity.setPageInfoEntity(pageInfoEntity);
        } else {
            responseDataEntity.setCode(3);
            responseDataEntity.setMsg("数据查询为空");
        }
        return responseDataEntity;
    }


    /**
     * 查看详情
     * @param requestBean
     * @return
     */
    @RequestMapping(value = "/collection/getsplitinfos", method = RequestMethod.POST)
    @ResponseBody
    public ResponseDataEntity getSplitInfos(@RequestBody RequestBean requestBean) {
        ResponseDataEntity responseDataEntity = new ResponseDataEntity();
        String pkGuid = requestBean.getData();
        CollectSpitinfoEntity collectSpitinfoEntity = new CollectSpitinfoEntity();
        collectSpitinfoEntity.setPkGuid(pkGuid);
        collectSpitinfoEntity = collectionService.getCollectSplitInfo(collectSpitinfoEntity);
        if( null != collectSpitinfoEntity){
            responseDataEntity.setCode(0);
            responseDataEntity.setData(collectSpitinfoEntity);
        } else {
            responseDataEntity.setCode(2);
            responseDataEntity.setMsg("查询是失败");
        }
        return  responseDataEntity;
    }

    /**
     * 更新拆模记录
     * @param requestBean
     * @return
     */
    @RequestMapping(value = "/collection/updtesplitinfos", method = RequestMethod.POST)
    @ResponseBody
    public ResponseDataEntity toUpdateSplitInfo(@RequestBody RequestBean requestBean) {
        ResponseDataEntity responseDataEntity = new ResponseDataEntity();
        CollectSpitinfoEntity collectSpitinfoEntity = JSONObject.parseObject(requestBean.getData(),CollectSpitinfoEntity.class);
        try {
            collectionService.updateCollectSplitInfo(collectSpitinfoEntity);
            responseDataEntity.setCode(0);
        } catch (Exception e) {
            e.printStackTrace();
            responseDataEntity.setCode(2);
            responseDataEntity.setMsg("添加失败");

        }
        return responseDataEntity;
    }


}

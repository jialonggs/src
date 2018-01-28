package com.jialong.jlmanager.controller;

import com.alibaba.fastjson.JSONObject;
import com.jialong.jlmanager.bean.RequestBean;
import com.jialong.jlmanager.model.CollectPartinfoEntity;
import com.jialong.jlmanager.model.DocCollectmouldEntity;
import com.jialong.jlmanager.model.ResponseDataEntity;
import com.jialong.jlmanager.model.responseModel.CollectmouldListResp;
import com.jialong.jlmanager.model.responseModel.PkGuidIdResp;
import com.jialong.jlmanager.service.impl.CollectionServiceIF;
import com.jialong.jlmanager.service.impl.PartServiceIF;
import com.jialong.jlmanager.util.DateFormatUtil;
import com.jialong.jlmanager.util.SplitUrlUtil;
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
        List<DocCollectmouldEntity> collectmouldEntities = collectionService.getCollection(collect);
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
            responseDataEntity.setCode(2);
            responseDataEntity.setMsg("添加失败");
            return  responseDataEntity;
        }


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
            for(CollectPartinfoEntity item : list) {
                String picUrl = item.getPicurl();
                // 获取第一个图片
                String url = SplitUrlUtil.getFirstUrl(picUrl,"\\|");
                item.setPicurl(url);
            }
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

//    @RequestMapping(value = "/api/collection/detail", method = { RequestMethod.POST, RequestMethod.GET })
//    @ResponseBody
//    public String getCollectionDetail(@RequestBody RequestBean requestBean) {
//
//
//        JSONObject jsonObject=JSONObject.parseObject(requestBean.getData());
//        String pkguid=jsonObject.getString("pkGuid");
//        CollectPartinfoEntity partinfoEntity=new CollectPartinfoEntity();
//        partinfoEntity.setCollectmouldId(pkguid);
//        List<CollectPartinfoEntity> collectPartinfoEntities=partService.getParts(partinfoEntity);
//
//        DocCollectmouldEntity collectmouldEntity=collectionService.getCollectionDetail(pkguid);
//        JSONObject collectResultObject= (JSONObject) JSONObject.toJSON(collectmouldEntity);
//        String parts=JSONArray.toJSONString(collectPartinfoEntities);
//        collectResultObject.put("modulesList",parts);
//        ResultBean resultBean=new ResultBean();
//        resultBean.setSuccess(1);
//        resultBean.setData(collectResultObject.toJSONString());
//        return JSONObject.toJSONString(resultBean);
//    }



}

package com.jialong.jlmanager.controller;

import com.alibaba.fastjson.JSONArray;
import com.alibaba.fastjson.JSONObject;
import com.jialong.jlmanager.bean.RequestBean;
import com.jialong.jlmanager.bean.ResultBean;
import com.jialong.jlmanager.file.FileUtil;
import com.jialong.jlmanager.model.CollectPartinfoEntity;
import com.jialong.jlmanager.model.DocCollectmouldEntity;
import com.jialong.jlmanager.model.ResponseDataEntity;
import com.jialong.jlmanager.model.responseModel.CollectmouldListResp;
import com.jialong.jlmanager.service.impl.CollectionServiceIF;
import com.jialong.jlmanager.service.impl.PartServiceIF;
import com.jialong.jlmanager.util.DateFormatUtil;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.multipart.MultipartFile;
import org.springframework.web.multipart.MultipartHttpServletRequest;

import javax.servlet.http.HttpServletRequest;
import java.util.*;

@RestController
public class CollectionController {
    @Autowired
    CollectionServiceIF collectionService;
    @Autowired
    PartServiceIF partService;

    //收模上传
    @RequestMapping(value="/api/collection/insert", method = RequestMethod.POST)
    @ResponseBody
    public String uploadCollection(HttpServletRequest request) {
        MultipartHttpServletRequest params=((MultipartHttpServletRequest) request);
        List<MultipartFile> files = ((MultipartHttpServletRequest) request).getFiles("file");
        params.getParameter("name");
        //业务数据
        String data = params.getParameter("Data");
        String userId=params.getParameter("UserId");
        JSONObject collectionJson=JSONObject.parseObject(data);
        DocCollectmouldEntity docCollectmouldEntity=JSONObject.parseObject(data,DocCollectmouldEntity.class);
        Map<String,String> filesMap=new HashMap<>();
        for (int i = 0; i < files.size(); ++i) {
            MultipartFile file = files.get(i);
            String contentType = file.getContentType();
            String fileName = file.getOriginalFilename();

        /*System.out.println("fileName-->" + fileName);
        System.out.println("getContentType-->" + contentType);*/
            String filePath = request.getSession().getServletContext().getRealPath("upload/");
            //随机生成文件名称
            String ranFileName= UUID.randomUUID().toString().replace("-","");
            try {
                FileUtil.uploadFile(file.getBytes(), filePath, ranFileName);
                if(filesMap.get(fileName)!=null){
                    filesMap.put(fileName,"upload/"+ranFileName);
                }else {
                    filesMap.put(fileName,filesMap.get(fileName)+",upload/"+ranFileName);
                }
            } catch (Exception e) {
                // TODO: handle exception
            }
        }
        JSONArray modules=collectionJson.getJSONArray("modulesList");
        List<CollectPartinfoEntity> parts=new ArrayList<>();
        for(int i=0;i<modules.size();i++){
            CollectPartinfoEntity part=JSONObject.parseObject(modules.getString(i),CollectPartinfoEntity.class);
            part.setAdduser(userId);
            String filename=modules.getJSONObject(i).getString("fileName");
            part.setPicurl(filesMap.get(filename));
            parts.add(part);
        }
        collectionService.insertCollection(docCollectmouldEntity,parts);
        ResultBean resultBean=new ResultBean();
        resultBean.setSuccess(1);
        resultBean.setData("");
        return JSONObject.toJSONString(resultBean);
    }

    /**
     * 获取收模列表
     * @param requestBean
     * @return
     */
    @RequestMapping(value = "/api/collection/list", method = RequestMethod.POST )
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

    @RequestMapping(value = "/api/collection/detail", method = { RequestMethod.POST, RequestMethod.GET })
    @ResponseBody
    public String getCollectionDetail(@RequestBody RequestBean requestBean) {


        JSONObject jsonObject=JSONObject.parseObject(requestBean.getData());
        String pkguid=jsonObject.getString("pkGuid");
        CollectPartinfoEntity partinfoEntity=new CollectPartinfoEntity();
        partinfoEntity.setCollectmouldId(pkguid);
        List<CollectPartinfoEntity> collectPartinfoEntities=partService.getParts(partinfoEntity);

        DocCollectmouldEntity collectmouldEntity=collectionService.getCollectionDetail(pkguid);
        JSONObject collectResultObject= (JSONObject) JSONObject.toJSON(collectmouldEntity);
        String parts=JSONArray.toJSONString(collectPartinfoEntities);
        collectResultObject.put("modulesList",parts);
        ResultBean resultBean=new ResultBean();
        resultBean.setSuccess(1);
        resultBean.setData(collectResultObject.toJSONString());
        return JSONObject.toJSONString(resultBean);
    }

}

package com.jialong.jlmanager.controller;


import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONArray;
import com.alibaba.fastjson.JSONObject;
import com.jialong.jlmanager.bean.RequestBean;
import com.jialong.jlmanager.bean.ResultBean;
import com.jialong.jlmanager.file.FileUtil;
import com.jialong.jlmanager.model.CollectPartinfoEntity;
import com.jialong.jlmanager.model.DocCollectmouldEntity;
import com.jialong.jlmanager.service.CollectionService;
import com.jialong.jlmanager.service.PartService;
import com.jialong.jlmanager.service.impl.CollectionServiceIF;
import com.jialong.jlmanager.service.impl.PartServiceIF;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
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
        String data=params.getParameter("Data");
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

    @RequestMapping(value = "/api/collection/list", method = RequestMethod.POST )
    @ResponseBody
    public String getCollectionList(@RequestBody RequestBean requestBean) {
        JSONObject jsonObject=JSONObject.parseObject(requestBean.getData());
        DocCollectmouldEntity collect=new DocCollectmouldEntity();
        collect.setAdduser(requestBean.getUserId());
        List<DocCollectmouldEntity> collectmouldEntities=collectionService.getCollection(collect);
        JSONArray jsonArray=new JSONArray();
        for(DocCollectmouldEntity collectmouldEntity:collectmouldEntities){
            JSONObject collectObject=new JSONObject();
            jsonObject.put("clientcompany",collectmouldEntity.getClientcompany());
            CollectPartinfoEntity partinfoEntity=new CollectPartinfoEntity();
            partinfoEntity.setCollectmouldId(collectmouldEntity.getPkGuid());
            List<CollectPartinfoEntity> collectPartinfoEntities=partService.getParts(partinfoEntity);
            jsonObject.put("number",collectPartinfoEntities.size());
            jsonObject.put("batch",collectmouldEntity.getBatch());
            jsonObject.put("addTime",collectmouldEntity.getCreatetime());
            jsonArray.add(jsonObject);
        }
        JSONObject resultDataObject=new JSONObject();
        resultDataObject.put("collectionList",jsonArray);
        ResultBean resultBean=new ResultBean();
        resultBean.setSuccess(1);
        resultBean.setData(resultDataObject.toJSONString());
        return JSONObject.toJSONString(resultBean);
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

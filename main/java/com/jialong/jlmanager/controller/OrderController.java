package com.jialong.jlmanager.controller;


import com.alibaba.fastjson.JSONArray;
import com.alibaba.fastjson.JSONObject;
import com.jialong.jlmanager.bean.RequestBean;
import com.jialong.jlmanager.bean.ResultBean;
import com.jialong.jlmanager.file.FileUtil;
import com.jialong.jlmanager.model.CollectPartinfoEntity;
import com.jialong.jlmanager.model.DocCollectmouldEntity;
import com.jialong.jlmanager.model.ProcessingorderEntity;
import com.jialong.jlmanager.model.ProjectEntity;
import com.jialong.jlmanager.service.impl.OrderServiceIF;
import com.jialong.jlmanager.service.impl.ProjectServiceIF;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.multipart.MultipartFile;
import org.springframework.web.multipart.MultipartHttpServletRequest;

import javax.servlet.http.HttpServletRequest;
import java.util.*;

@Controller
public class OrderController {
    @Autowired
    OrderServiceIF orderservice;


    //收模上传

    @RequestMapping(value = "/api/order/insert", method = { RequestMethod.POST, RequestMethod.GET })
    @ResponseBody
    public  String insertOrder(HttpServletRequest request) {
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
           ProcessingorderEntity processingorderEntity=JSONObject.parseObject(data,ProcessingorderEntity.class);
            orderservice.createOrder(processingorderEntity);
            ResultBean resultBean=new ResultBean();
            resultBean.setSuccess(1);
            resultBean.setData("");
            return JSONObject.toJSONString(resultBean);
    }

    @RequestMapping(value = "/api/order/detail", method = { RequestMethod.POST, RequestMethod.GET })
    @ResponseBody
    public String insertProjectList(@RequestBody RequestBean requestBean) {
        ProcessingorderEntity processingorderEntity=new ProcessingorderEntity();
        processingorderEntity.setPkGuid(JSONObject.parseObject(requestBean.getData()).getString("pkGuid"));

        ProcessingorderEntity processingorderDetail=orderservice.getOrderDetail(processingorderEntity);
        String result=JSONObject.toJSONString(processingorderDetail);
        ResultBean resultBean=new ResultBean();
        resultBean.setSuccess(1);
        resultBean.setData(result);
        return JSONObject.toJSONString(resultBean);
    }

    @RequestMapping(value = "/api/order/list", method = { RequestMethod.POST, RequestMethod.GET })
    @ResponseBody
    public String getProjectDetail(@RequestBody RequestBean requestBean) {
        ProcessingorderEntity processingorderEntity=new ProcessingorderEntity();
        processingorderEntity.setProjectId(JSONObject.parseObject(requestBean.getData()).getString("projectId"));
        String result=JSONArray.toJSONString(orderservice.getOrderList(processingorderEntity));
        ResultBean resultBean=new ResultBean();
        resultBean.setSuccess(1);
        resultBean.setData(result);
        return JSONObject.toJSONString(resultBean);
    }

}

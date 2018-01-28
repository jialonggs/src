package com.jialong.jlmanager.controller;


import com.alibaba.fastjson.JSONArray;
import com.alibaba.fastjson.JSONObject;
import com.jialong.jlmanager.bean.RequestBean;
import com.jialong.jlmanager.bean.ResultBean;
import com.jialong.jlmanager.file.FileUtil;
import com.jialong.jlmanager.model.*;
import com.jialong.jlmanager.service.impl.CollectionServiceIF;
import com.jialong.jlmanager.service.impl.PartServiceIF;
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
public class ProjectController {
//    @Autowired
//    ProjectServiceIF projectService;
//
//
//    //收模上传
//
//    @RequestMapping(value = "/api/project/list", method = { RequestMethod.POST, RequestMethod.GET })
//    @ResponseBody
//    public String getProjectList(@RequestBody RequestBean requestBean) {
//
//        JSONObject resultDataObject=new JSONObject();
//        ProjectEntity projectEntity=new ProjectEntity();
//        projectEntity.setAdduser(requestBean.getUserId());
//        projectEntity.setPkGuid(JSONObject.parseObject(requestBean.getData()).getString("pkGuid"));
//
//        List<ProjectEntity> projectEntityList=projectService.getProjectList(projectEntity);
//
//        resultDataObject.put("projectList",JSONArray.toJSONString(projectEntityList));
//        ResultBean resultBean=new ResultBean();
//        resultBean.setSuccess(1);
//        resultBean.setData(resultDataObject.toJSONString());
//        return JSONObject.toJSONString(resultBean);
//    }
//
//    @RequestMapping(value = "/api/project/insert", method = { RequestMethod.POST, RequestMethod.GET })
//    @ResponseBody
//    public String insertProjectList(@RequestBody RequestBean requestBean) {
//        ProjectEntity projectEntity=JSONObject.parseObject(requestBean.getData(),ProjectEntity.class);
//        projectService.createProject(projectEntity);
//        ResultBean resultBean=new ResultBean();
//        resultBean.setSuccess(1);
//        resultBean.setData("");
//        return JSONObject.toJSONString(resultBean);
//    }
//
//    @RequestMapping(value = "/api/project/detail", method = { RequestMethod.POST, RequestMethod.GET })
//    @ResponseBody
//    public String getProjectDetail(@RequestBody RequestBean requestBean) {
//        ProjectEntity projectEntity=new ProjectEntity();
//        projectEntity.setPkGuid(JSONObject.parseObject(requestBean.getData()).getString("pkGuid"));
//        String result=JSONObject.toJSONString(projectService.getProjectDetail(projectEntity));
//        ResultBean resultBean=new ResultBean();
//        resultBean.setSuccess(1);
//        resultBean.setData(result);
//        return JSONObject.toJSONString(resultBean);
//    }

}

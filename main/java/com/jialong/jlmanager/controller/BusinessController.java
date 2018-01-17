package com.jialong.jlmanager.controller;

import com.alibaba.fastjson.JSONArray;
import com.alibaba.fastjson.JSONObject;
import com.jialong.jlmanager.bean.RequestBean;
import com.jialong.jlmanager.bean.ResultBean;
import com.jialong.jlmanager.model.BusinessForecastpriceEntity;
import com.jialong.jlmanager.model.BusinessForecastpricelistEntity;
import com.jialong.jlmanager.model.DocCollectmouldEntity;
import com.jialong.jlmanager.service.impl.BusinessServiceIF;
import com.jialong.jlmanager.service.impl.CollectionServiceIF;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

public class BusinessController {
    @Autowired
    BusinessServiceIF businessService;
    @RequestMapping(value="/api/business/insertForecastPrice", method = RequestMethod.POST)
    @ResponseBody
    public String insertForecastListPrice(@RequestBody RequestBean requestBean){
        JSONObject jsonObject=JSONObject.parseObject(requestBean.getData());
        BusinessForecastpriceEntity forecastpriceEntity=new BusinessForecastpriceEntity();
        forecastpriceEntity=JSONObject.parseObject(requestBean.getData(),BusinessForecastpriceEntity.class);
        forecastpriceEntity.setPkGuid(UUID.randomUUID().toString());
        forecastpriceEntity.setAdduser(requestBean.getUserId());
        businessService.createForecastPrice(forecastpriceEntity);
        ResultBean resultBean=new ResultBean();
        resultBean.setSuccess(1);
        resultBean.setData("");
        return JSONObject.toJSONString(resultBean);
    }

    @RequestMapping(value="/api/business/forecastPriceList", method = RequestMethod.POST)
    @ResponseBody
    public String getForecastListPrice(@RequestBody RequestBean requestBean){
        List<BusinessForecastpriceEntity> businessForecastpriceEntityList=businessService.getForecastPriceList(requestBean.getUserId());
        ResultBean resultBean=new ResultBean();
        resultBean.setSuccess(1);
        JSONObject jsonObject=new JSONObject();
        jsonObject.put("forecastList",JSONArray.toJSONString(businessForecastpriceEntityList));
        resultBean.setData(jsonObject.toJSONString());
        return JSONObject.toJSONString(resultBean);
    }
}

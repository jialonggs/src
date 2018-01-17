package com.jialong.jlmanager.service;

import com.jialong.jlmanager.dao.Iterface.BusinessForecastPriceDaoIF;
import com.jialong.jlmanager.model.BusinessForecastpriceEntity;
import com.jialong.jlmanager.model.BusinessForecastpricelistEntity;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.transaction.annotation.Isolation;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

@RestController
public class HelloService {
    @Autowired
    private BusinessForecastPriceDaoIF userDao;



    @RequestMapping("/hello1")
    @Transactional(propagation = Propagation.REQUIRED,isolation = Isolation.DEFAULT,timeout=36000,rollbackFor=Exception.class)
    public String hello1() {

        BusinessForecastpriceEntity businessForecastpriceEntity=new BusinessForecastpriceEntity();
        businessForecastpriceEntity.setClientcompany("zzzzzz");
        businessForecastpriceEntity.setAdduser("asdasd");
        businessForecastpriceEntity.setPkGuid(UUID.randomUUID().toString());
        List<BusinessForecastpricelistEntity> list=new ArrayList();
        for(int i=0;i<5;i++){
            BusinessForecastpricelistEntity businessForecastpricelistEntity=new BusinessForecastpricelistEntity();
            businessForecastpricelistEntity.setName("bbbbb");
            businessForecastpricelistEntity.setForecastpriceId("aaaaa");
            list.add(businessForecastpricelistEntity);
        }
//        businessForecastpriceEntity.setBusinessForecastpricelistEntities(list);
        userDao.insertBusinessForecastpriceList(businessForecastpriceEntity);
        userDao.insertBusinessForecastprice(businessForecastpriceEntity);
        return "Hello World";
    }

    @RequestMapping("/hello2")
    public String hello2() {

        BusinessForecastpriceEntity businessForecastpriceEntity=new BusinessForecastpriceEntity();
        businessForecastpriceEntity.setAdduser("asdasd");
        List<BusinessForecastpriceEntity> list= userDao.getBusinessForecastpriceList(businessForecastpriceEntity);

        return list.get(0).getAdduser();
    }
}

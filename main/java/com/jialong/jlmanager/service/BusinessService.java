package com.jialong.jlmanager.service;

import com.jialong.jlmanager.dao.Iterface.BusinessForecastPriceDaoIF;
import com.jialong.jlmanager.model.BusinessForecastpriceEntity;
import com.jialong.jlmanager.service.impl.BusinessServiceIF;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Isolation;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
public class BusinessService implements BusinessServiceIF {
    @Autowired
    private BusinessForecastPriceDaoIF businessDao;
    @Override
    @Transactional(propagation = Propagation.REQUIRED,isolation = Isolation.DEFAULT,timeout=36000,rollbackFor=Exception.class)
    public void createForecastPrice(BusinessForecastpriceEntity businessForecastpriceEntity) {
        businessDao.insertBusinessForecastpriceList(businessForecastpriceEntity);
        businessDao.insertBusinessForecastprice(businessForecastpriceEntity);
    }

    @Override
    public List<BusinessForecastpriceEntity> getForecastPriceList(String userName) {
        BusinessForecastpriceEntity businessForecastpriceEntity=new BusinessForecastpriceEntity();
        businessForecastpriceEntity.setAdduser(userName);
        return businessDao.getBusinessForecastpriceList(businessForecastpriceEntity);
    }

    @Override
    public BusinessForecastpriceEntity getForecastPriceDetail(String guid) {
        return null;
    }


}

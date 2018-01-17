package com.jialong.jlmanager.service.impl;

import com.jialong.jlmanager.model.BusinessForecastpriceEntity;
import com.jialong.jlmanager.model.ProjectEntity;

import java.util.List;

public interface BusinessServiceIF {
    /**
     * 创建预报价单
     * @param businessForecastpriceEntity
     */
    public void createForecastPrice(BusinessForecastpriceEntity businessForecastpriceEntity);

    /**
     * 获取预报价单列表
     * @param userName
     */
    public List<BusinessForecastpriceEntity> getForecastPriceList(String userName);

    /**
     * 获取预报价单详情
     * @param guid
     */
    public BusinessForecastpriceEntity getForecastPriceDetail(String guid);
}

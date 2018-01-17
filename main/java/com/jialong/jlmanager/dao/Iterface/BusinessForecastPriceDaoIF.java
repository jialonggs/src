package com.jialong.jlmanager.dao.Iterface;

import com.jialong.jlmanager.model.BusinessForecastpriceEntity;
import org.apache.ibatis.annotations.Param;

import java.util.List;

/**
 * 与报价单的Dao
 */
public interface BusinessForecastPriceDaoIF {
    /**
     * 插入预报价单
     * @param
     */
    void insertBusinessForecastprice(@Param("business")BusinessForecastpriceEntity businessForecastpriceEntity);
    /**
     * 插入预报详情
     * @param
     */
    void insertBusinessForecastpriceList(@Param("business")BusinessForecastpriceEntity businessForecastpriceEntity);

    List<BusinessForecastpriceEntity> getBusinessForecastpriceList(BusinessForecastpriceEntity businessForecastpriceEntity);
}

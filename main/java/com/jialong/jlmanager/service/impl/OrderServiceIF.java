package com.jialong.jlmanager.service.impl;

import com.jialong.jlmanager.model.ProcessingorderEntity;
import com.jialong.jlmanager.model.ProjectEntity;

import java.util.List;

public interface OrderServiceIF {

    public void createOrder(ProcessingorderEntity orderEntity);

    public List<ProcessingorderEntity> getOrderList(ProcessingorderEntity orderEntity);

    public  ProcessingorderEntity getOrderDetail(ProcessingorderEntity orderEntity);
}

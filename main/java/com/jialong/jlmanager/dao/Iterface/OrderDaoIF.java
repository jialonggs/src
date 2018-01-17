package com.jialong.jlmanager.dao.Iterface;

import com.jialong.jlmanager.model.ProcessingorderEntity;

import java.util.List;

public interface OrderDaoIF {
    public List<ProcessingorderEntity> getOrder(ProcessingorderEntity order);
    public void insertOrder(ProcessingorderEntity order);
    public void updateOrder(ProcessingorderEntity order);
}

package com.jialong.jlmanager.service;

import com.jialong.jlmanager.dao.Iterface.CollectionDaoIF;
import com.jialong.jlmanager.dao.Iterface.DocControlInfoDaoIF;
import com.jialong.jlmanager.dao.Iterface.OrderDaoIF;
import com.jialong.jlmanager.dao.Iterface.PartInfoDaoIF;
import com.jialong.jlmanager.model.DocControlInfoEntity;
import com.jialong.jlmanager.model.ProcessingorderEntity;
import com.jialong.jlmanager.service.impl.OrderServiceIF;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Isolation;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

import java.util.ArrayList;
import java.util.List;

@Service
public class OrderService implements OrderServiceIF{
    @Autowired
    DocControlInfoDaoIF controlInfoDao;
    @Autowired
    OrderDaoIF orderDao;
    @Override
    @Transactional(propagation = Propagation.REQUIRED,isolation = Isolation.DEFAULT,timeout=36000,rollbackFor=Exception.class)
    public void createOrder(ProcessingorderEntity orderEntity) {
        orderDao.insertOrder(orderEntity);
        controlInfoDao.insertDocControlInfo(orderEntity.getControlInfoEntity());
    }

    @Override
    public List<ProcessingorderEntity> getOrderList(ProcessingorderEntity orderEntity) {
        List<ProcessingorderEntity> list=new ArrayList<>();
        list=orderDao.getOrder(orderEntity);
        for(int i=0;i<list.size();i++){
            DocControlInfoEntity controlInfoEntity=new DocControlInfoEntity();
            controlInfoEntity.setOrderId(list.get(i).getPkGuid());
            list.get(i).setControlInfoEntity(controlInfoEntity);
        }
        return list;
    }

    @Override
    public ProcessingorderEntity getOrderDetail(ProcessingorderEntity orderEntity) {
        ProcessingorderEntity processingorderEntity=new ProcessingorderEntity();
        processingorderEntity=orderDao.getOrder(orderEntity).get(0);
        DocControlInfoEntity controlInfoEntity=new DocControlInfoEntity();
        controlInfoEntity.setOrderId(processingorderEntity.getPkGuid());
        processingorderEntity.setControlInfoEntity(controlInfoEntity);
        return processingorderEntity;
    }
}

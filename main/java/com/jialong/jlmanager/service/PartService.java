package com.jialong.jlmanager.service;

import com.jialong.jlmanager.dao.Iterface.PartInfoDaoIF;
import com.jialong.jlmanager.model.CollectPartinfoEntity;
import com.jialong.jlmanager.service.impl.PartServiceIF;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.List;

@Service
public class PartService implements PartServiceIF {
    @Autowired
    private PartInfoDaoIF partDao;
    @Override
    public void insertPart(List<CollectPartinfoEntity> collectPartinfoEntities) {

    }

    @Override
    public List<CollectPartinfoEntity> getParts(CollectPartinfoEntity partinfoEntity) {
        return partDao.getModule(partinfoEntity);
    }
}

package com.jialong.jlmanager.service.impl;

import com.jialong.jlmanager.model.CollectPartinfoEntity;

import java.util.List;

public interface PartServiceIF {
    public void insertPart(List<CollectPartinfoEntity> collectPartinfoEntities);

    public List<CollectPartinfoEntity> getParts(CollectPartinfoEntity partinfoEntity);
}

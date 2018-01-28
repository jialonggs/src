package com.jialong.jlmanager.service.impl;

import com.jialong.jlmanager.model.CollectPartinfoEntity;

import java.util.List;

public interface PartServiceIF {
    public void insertPart(List<CollectPartinfoEntity> collectPartinfoEntities);

    // 获取模具信息列表
    public List<CollectPartinfoEntity> getParts(CollectPartinfoEntity partinfoEntity);

    // 添加模具信息
    public void addMouldPartInfo(CollectPartinfoEntity collectPartinfoEntity);

    public CollectPartinfoEntity getByPkGuid(String pkGuid);

    public void updateCollectPart (CollectPartinfoEntity collectPartinfoEntity);
}

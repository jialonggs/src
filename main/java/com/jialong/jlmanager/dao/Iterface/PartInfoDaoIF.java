package com.jialong.jlmanager.dao.Iterface;

import com.jialong.jlmanager.model.CollectPartinfoEntity;

import java.util.List;

public interface PartInfoDaoIF {
    public List<CollectPartinfoEntity> getModule(CollectPartinfoEntity partinfoEntity);

    public void insertCollectPart(CollectPartinfoEntity collectPartinfoEntity);

    public void updateCollectPart(CollectPartinfoEntity collectPartinfoEntity);
}

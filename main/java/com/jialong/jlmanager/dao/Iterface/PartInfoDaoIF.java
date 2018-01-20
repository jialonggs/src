package com.jialong.jlmanager.dao.Iterface;

import com.jialong.jlmanager.model.CollectPartinfoEntity;
import java.util.List;

public interface PartInfoDaoIF {
    // 获取模具列表（根据收模单pkGuid）
    List<CollectPartinfoEntity> getModule(CollectPartinfoEntity partinfoEntity);

    void insertCollectPart(CollectPartinfoEntity collectPartinfoEntity);

    void updateCollectPart(CollectPartinfoEntity collectPartinfoEntity);
}

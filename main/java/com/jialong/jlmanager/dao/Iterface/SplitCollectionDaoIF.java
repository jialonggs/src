package com.jialong.jlmanager.dao.Iterface;

import com.jialong.jlmanager.model.CollectSpitinfoEntity;

import java.util.List;

public interface SplitCollectionDaoIF {

    // 添加拆模记录
    public void insertCollectSpitinfo (CollectSpitinfoEntity collectSpitinfoEntity);

    // 获取拆模列表
    public List<CollectSpitinfoEntity> findCollectSpitinfoByCondition(CollectSpitinfoEntity collectSpitinfoEntity);

    // 更新拆模记录详情
    public void updateCollectSpitinfo(CollectSpitinfoEntity collectSpitinfoEntity);
}

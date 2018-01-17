package com.jialong.jlmanager.dao.Iterface;

import com.jialong.jlmanager.model.DocCollectmouldEntity;

import java.util.List;

public interface CollectionDaoIF {
    public void insertCollection(DocCollectmouldEntity collectmouldEntity);
    public List<DocCollectmouldEntity> getCollection(DocCollectmouldEntity collectmouldEntity);
}

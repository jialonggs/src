package com.jialong.jlmanager.service.impl;

import com.jialong.jlmanager.model.CollectPartinfoEntity;
import com.jialong.jlmanager.model.DocCollectmouldEntity;

import java.util.List;

public interface CollectionServiceIF {

    public void insertCollection(DocCollectmouldEntity collectmouldEntity, List<CollectPartinfoEntity> parts);

    public List<DocCollectmouldEntity> getCollection(DocCollectmouldEntity collectmouldEntity);

    public DocCollectmouldEntity getCollectionDetail(String pkguid);

    public void addNewCollection(DocCollectmouldEntity docCollectmouldEntity);

}

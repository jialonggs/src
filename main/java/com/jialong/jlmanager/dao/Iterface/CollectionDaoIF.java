package com.jialong.jlmanager.dao.Iterface;

import com.jialong.jlmanager.model.CollectSpitinfoEntity;
import com.jialong.jlmanager.model.DocCollectmouldEntity;

import java.util.List;

public interface CollectionDaoIF {
    public void insertDocCollectmould(DocCollectmouldEntity collectmouldEntity);

    public List<DocCollectmouldEntity> getCollection(DocCollectmouldEntity collectmouldEntity);

    public void upadteCollection(DocCollectmouldEntity collectmouldEntity);


}

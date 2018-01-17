package com.jialong.jlmanager.service;

import com.jialong.jlmanager.dao.Iterface.CollectionDaoIF;
import com.jialong.jlmanager.dao.Iterface.PartInfoDaoIF;
import com.jialong.jlmanager.model.CollectPartinfoEntity;
import com.jialong.jlmanager.model.DocCollectmouldEntity;
import com.jialong.jlmanager.service.impl.CollectionServiceIF;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.UUID;
@Service
public class CollectionService implements CollectionServiceIF {
    @Autowired
    CollectionDaoIF collectionDao;
    @Autowired
    PartInfoDaoIF partDao;
    @Override
    public void insertCollection(DocCollectmouldEntity collectmouldEntity, List<CollectPartinfoEntity> parts) {
        String id= UUID.randomUUID().toString();
        collectmouldEntity.setPkGuid(id);
        collectionDao.insertCollection(collectmouldEntity);
        for(int i=0;i<parts.size();i++){
            parts.get(i).setCollectmouldId(id);
            partDao.insertCollectPart(parts.get(i));
        }

    }

    @Override
    public List<DocCollectmouldEntity> getCollection(DocCollectmouldEntity collectmouldEntity) {
        return collectionDao.getCollection(collectmouldEntity);
    }

    public DocCollectmouldEntity getCollectionDetail(String pkguid){
        DocCollectmouldEntity collectmouldEntity = new DocCollectmouldEntity();
        collectmouldEntity.setPkGuid(pkguid);
        return collectionDao.getCollection(collectmouldEntity).get(0);
    }
}

package com.jialong.jlmanager.service;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.jialong.jlmanager.dao.Iterface.CollectionDaoIF;
import com.jialong.jlmanager.dao.Iterface.PartInfoDaoIF;
import com.jialong.jlmanager.dao.Iterface.SplitCollectionDaoIF;
import com.jialong.jlmanager.model.CollectPartinfoEntity;
import com.jialong.jlmanager.model.CollectSpitinfoEntity;
import com.jialong.jlmanager.model.DocCollectmouldEntity;
import com.jialong.jlmanager.model.PageInfoEntity;
import com.jialong.jlmanager.service.impl.CollectionServiceIF;
import com.jialong.jlmanager.util.PageBean;
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

    @Autowired
    SplitCollectionDaoIF splitCollectionDao;
    @Override
    public void insertCollection(DocCollectmouldEntity collectmouldEntity, List<CollectPartinfoEntity> parts) {
        String id= UUID.randomUUID().toString();
        collectmouldEntity.setPkGuid(id);
        collectionDao.insertDocCollectmould(collectmouldEntity);
        for(int i=0;i<parts.size();i++){
            parts.get(i).setCollectmouldId(id);
            partDao.insertCollectPart(parts.get(i));
        }

    }

    @Override
    public PageBean<DocCollectmouldEntity> getCollection(DocCollectmouldEntity collectmouldEntity, PageInfoEntity pageInfoEntity) {
        PageHelper.startPage(pageInfoEntity.getCurrentPage(),pageInfoEntity.getPagesize());
        List<DocCollectmouldEntity> list = collectionDao.getCollection(collectmouldEntity);
        PageInfo page = new PageInfo(list);
        PageBean<DocCollectmouldEntity> pageData = new PageBean<>();
        pageData.setItems(list);
        pageData.setPageInfo(page);
        return pageData;
    }

    @Override
    public DocCollectmouldEntity getCollectionDetail(String pkguid){
        DocCollectmouldEntity collectmouldEntity = new DocCollectmouldEntity();
        collectmouldEntity.setPkGuid(pkguid);
        return collectionDao.getCollection(collectmouldEntity).get(0);
    }

    @Override
    public void addNewCollection(DocCollectmouldEntity docCollectmouldEntity) {
        collectionDao.insertDocCollectmould(docCollectmouldEntity);
    }


    @Override
    public void addCollectionSplitInfo(CollectSpitinfoEntity collectSpitinfoEntity) {
        splitCollectionDao.insertCollectSpitinfo(collectSpitinfoEntity);
    }

    @Override
    public PageBean<CollectSpitinfoEntity> getCollectSplitList(CollectSpitinfoEntity collectSpitinfoEntity,PageInfoEntity pageInfoEntity) {
        PageHelper.startPage(pageInfoEntity.getCurrentPage(),pageInfoEntity.getPagesize());
        List<CollectSpitinfoEntity> list = splitCollectionDao.findCollectSpitinfoByCondition(collectSpitinfoEntity);
        PageInfo page = new PageInfo(list);
        PageBean<CollectSpitinfoEntity> pageData = new PageBean<>();
        pageData.setItems(list);
        pageData.setPageInfo(page);
        return pageData;
    }

    @Override
    public CollectSpitinfoEntity getCollectSplitInfo(CollectSpitinfoEntity collectSpitinfoEntity) {
        return  splitCollectionDao.findCollectSpitinfoByCondition(collectSpitinfoEntity).get(0);
    }

    @Override
    public void updateCollectSplitInfo(CollectSpitinfoEntity collectSpitinfoEntity) {
        splitCollectionDao.updateCollectSpitinfo(collectSpitinfoEntity);
    }

    @Override
    public void updateCollection(DocCollectmouldEntity docCollectmouldEntity) {
        collectionDao.upadteCollection(docCollectmouldEntity);
    }
}

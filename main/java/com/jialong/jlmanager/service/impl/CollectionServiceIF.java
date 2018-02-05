package com.jialong.jlmanager.service.impl;

import com.jialong.jlmanager.model.CollectPartinfoEntity;
import com.jialong.jlmanager.model.CollectSpitinfoEntity;
import com.jialong.jlmanager.model.DocCollectmouldEntity;
import com.jialong.jlmanager.model.PageInfoEntity;
import com.jialong.jlmanager.util.DateFormatUtil;
import com.jialong.jlmanager.util.PageBean;

import java.util.List;

public interface CollectionServiceIF {

    public void insertCollection(DocCollectmouldEntity collectmouldEntity, List<CollectPartinfoEntity> parts);

    public PageBean<DocCollectmouldEntity> getCollection(DocCollectmouldEntity collectmouldEntity, PageInfoEntity pageInfoEntity);

    public DocCollectmouldEntity getCollectionDetail(String pkguid);

    public void addNewCollection(DocCollectmouldEntity docCollectmouldEntity);

    public void updateCollection(DocCollectmouldEntity docCollectmouldEntity);

    // 添加拆模记录
    public void addCollectionSplitInfo(CollectSpitinfoEntity collectSpitinfoEntity);

    // 获取集合
    public PageBean<CollectSpitinfoEntity> getCollectSplitList(CollectSpitinfoEntity collectSpitinfoEntity,PageInfoEntity pageInfoEntity);

    //其获取拆模详情
    public  CollectSpitinfoEntity getCollectSplitInfo(CollectSpitinfoEntity collectSpitinfoEntity);

    //更新拆模记录
    public void updateCollectSplitInfo(CollectSpitinfoEntity collectSpitinfoEntity);

}

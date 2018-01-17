package com.jialong.jlmanager.dao.Iterface;

import com.jialong.jlmanager.model.DocCollectmouldEntity;
import com.jialong.jlmanager.model.DocControlInfoEntity;

import java.util.List;

public interface DocControlInfoDaoIF {
    public void insertDocControlInfo(DocControlInfoEntity collectmouldEntity);
    public DocControlInfoEntity getDocControllinfo(DocCollectmouldEntity collectmouldEntity);
}

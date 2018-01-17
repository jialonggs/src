package com.jialong.jlmanager.service;

import com.jialong.jlmanager.dao.Iterface.BusinessForecastPriceDaoIF;
import com.jialong.jlmanager.dao.Iterface.ProjectDaoIF;
import com.jialong.jlmanager.model.BusinessForecastpriceEntity;
import com.jialong.jlmanager.model.BusinessForecastpricelistEntity;
import com.jialong.jlmanager.model.ProjectEntity;
import com.jialong.jlmanager.service.impl.ProjectServiceIF;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Isolation;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

import java.util.ArrayList;
import java.util.List;
@Service
public class ProjectService implements ProjectServiceIF {
    @Autowired
    private ProjectDaoIF projectDao;

    @Override
    @Transactional(propagation = Propagation.REQUIRED,isolation = Isolation.DEFAULT,timeout=36000,rollbackFor=Exception.class)
    public void createProject(ProjectEntity projectEntity) {
        projectDao.insertProject(projectEntity);
    }

    @Override
    public List<ProjectEntity> getProjectList(ProjectEntity projectEntity) {
        return projectDao.getProjectList(projectEntity);
    }

    @Override
    @Transactional(propagation = Propagation.REQUIRED,isolation = Isolation.DEFAULT,timeout=36000,rollbackFor=Exception.class)
    public void updateProject(ProjectEntity projectEntity) {
        projectDao.updateProject(projectEntity);
    }

    @Override
    public ProjectEntity getProjectDetail(ProjectEntity projectEntity) {
        List<ProjectEntity> list= projectDao.getProjectList(projectEntity);
        if(list.size()==0){
            return null;
        }
        return  projectDao.getProjectList(projectEntity).get(0);
    }

}

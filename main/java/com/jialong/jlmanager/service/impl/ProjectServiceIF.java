package com.jialong.jlmanager.service.impl;

import com.jialong.jlmanager.model.ProjectEntity;

import java.util.List;

public interface ProjectServiceIF {

    public void createProject(ProjectEntity projectEntity);

    public List<ProjectEntity> getProjectList(ProjectEntity projectEntity);

    public  void updateProject(ProjectEntity projectEntity);
    public  ProjectEntity getProjectDetail(ProjectEntity projectEntity);
}

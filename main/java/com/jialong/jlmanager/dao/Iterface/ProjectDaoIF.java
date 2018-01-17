package com.jialong.jlmanager.dao.Iterface;

import com.jialong.jlmanager.model.ProjectEntity;

import java.util.List;

public interface ProjectDaoIF {
    List<ProjectEntity> getProjectList(ProjectEntity projectEntity);
    void insertProject(ProjectEntity projectEntity);
    void updateProject(ProjectEntity projectEntity);
}

package com.jialong.jlmanager.model;/*
 * Welcome to use the TableGo Tools.
 * 
 * http://vipbooks.iteye.com
 * http://blog.csdn.net/vipbooks
 * http://www.cnblogs.com/vipbooks
 * 
 * Author:bianj
 * Email:edinsker@163.com
 * Version:5.0.0
 */

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

/**
 * 项目加工步骤 流程关系表(PROCESSIONG_UNITSTEP_WORKFLOW)
 * 
 * @author lyz
 * @version 1.0.0 2017-12-31
 */
@Entity
@Table(name = "PROCESSIONG_UNITSTEP_WORKFLOW")
public class ProcessiongUnitstepWorkflowEntity implements java.io.Serializable {
    /** 版本号 */
    private static final long serialVersionUID = -6017177856146090709L;

    /**  */
    @Id
    @Column(name = "PK_GUID", unique = true, nullable = false, length = 255)
    private String pkGuid;

    /** 步骤ID */
    @Column(name = "STEP_ID", nullable = true, length = 255)
    private String stepId;

    /** 流程ID */
    @Column(name = "WORKFLOW_ID", nullable = true, length = 10)
    private Integer workflowId;

    /** 更新时间 */
    @Column(name = "UPDATETIME", nullable = true, length = 19)
    private String updatetime;

    /** 是否删除 */
    @Column(name = "ISDELETE", nullable = true, length = 10)
    private Integer isdelete;

    /** 添加/修改人 */
    @Column(name = "ADDUSER", nullable = true, length = 255)
    private String adduser;

    /**  */
    @Column(name = "CREATETIME", nullable = true, length = 19)
    private String createtime;

    /** 步骤编号从1开始 */
    @Column(name = "STEPINDEX", nullable = true, length = 10)
    private Integer stepindex;

    /**
     * 获取
     * 
     * @return 
     */
    public String getPkGuid() {
        return this.pkGuid;
    }

    /**
     * 设置
     * 
     * @param pkGuid
     */
    public void setPkGuid(String pkGuid) {
        this.pkGuid = pkGuid;
    }

    /**
     * 获取步骤ID
     * 
     * @return 步骤ID
     */
    public String getStepId() {
        return this.stepId;
    }

    /**
     * 设置步骤ID
     * 
     * @param stepId
     *          步骤ID
     */
    public void setStepId(String stepId) {
        this.stepId = stepId;
    }

    /**
     * 获取流程ID
     * 
     * @return 流程ID
     */
    public Integer getWorkflowId() {
        return this.workflowId;
    }

    /**
     * 设置流程ID
     * 
     * @param workflowId
     *          流程ID
     */
    public void setWorkflowId(Integer workflowId) {
        this.workflowId = workflowId;
    }

    /**
     * 获取更新时间
     * 
     * @return 更新时间
     */
    public String getUpdatetime() {
        return this.updatetime;
    }

    /**
     * 设置更新时间
     * 
     * @param updatetime
     *          更新时间
     */
    public void setUpdatetime(String updatetime) {
        this.updatetime = updatetime;
    }

    /**
     * 获取是否删除
     * 
     * @return 是否删除
     */
    public Integer getIsdelete() {
        return this.isdelete;
    }

    /**
     * 设置是否删除
     * 
     * @param isdelete
     *          是否删除
     */
    public void setIsdelete(Integer isdelete) {
        this.isdelete = isdelete;
    }

    /**
     * 获取添加/修改人
     * 
     * @return 添加/修改人
     */
    public String getAdduser() {
        return this.adduser;
    }

    /**
     * 设置添加/修改人
     * 
     * @param adduser
     *          添加/修改人
     */
    public void setAdduser(String adduser) {
        this.adduser = adduser;
    }

    /**
     * 获取
     * 
     * @return 
     */
    public String getCreatetime() {
        return this.createtime;
    }

    /**
     * 设置
     * 
     * @param createtime
     */
    public void setCreatetime(String createtime) {
        this.createtime = createtime;
    }

    /**
     * 获取步骤编号从1开始
     * 
     * @return 步骤编号从1开始
     */
    public Integer getStepindex() {
        return this.stepindex;
    }

    /**
     * 设置步骤编号从1开始
     * 
     * @param stepindex
     *          步骤编号从1开始
     */
    public void setStepindex(Integer stepindex) {
        this.stepindex = stepindex;
    }
}
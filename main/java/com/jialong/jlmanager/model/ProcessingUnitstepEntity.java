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
 * 分配工作步骤表(PROCESSING_UNITSTEP)
 * 
 * @author lyz
 * @version 1.0.0 2017-12-31
 */
@Entity
@Table(name = "PROCESSING_UNITSTEP")
public class ProcessingUnitstepEntity implements java.io.Serializable {
    /** 版本号 */
    private static final long serialVersionUID = -2030997985721496448L;

    /**  */
    @Id
    @Column(name = "PK_GUID", unique = true, nullable = false, length = 255)
    private String pkGuid;

    /** 基本表步骤ID */
    @Column(name = "BASEUNITSTEP_ID", nullable = true, length = 255)
    private String baseunitstepId;

    /** 加工表流程ID */
    @Column(name = "PROCESSIONGWORKFLOW_ID", nullable = true, length = 255)
    private String processiongworkflowId;

    /** 状态编号 */
    @Column(name = "STATUS", nullable = true, length = 10)
    private Integer status;

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
    @Column(name = "STARTTIME", nullable = true, length = 19)
    private String starttime;

    /**  */
    @Column(name = "FINISHTIME", nullable = true, length = 19)
    private String finishtime;

    /**  */
    @Column(name = "CREATETIME", nullable = true, length = 19)
    private String createtime;

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
     * 获取基本表步骤ID
     * 
     * @return 基本表步骤ID
     */
    public String getBaseunitstepId() {
        return this.baseunitstepId;
    }

    /**
     * 设置基本表步骤ID
     * 
     * @param baseunitstepId
     *          基本表步骤ID
     */
    public void setBaseunitstepId(String baseunitstepId) {
        this.baseunitstepId = baseunitstepId;
    }

    /**
     * 获取加工表流程ID
     * 
     * @return 加工表流程ID
     */
    public String getProcessiongworkflowId() {
        return this.processiongworkflowId;
    }

    /**
     * 设置加工表流程ID
     * 
     * @param processiongworkflowId
     *          加工表流程ID
     */
    public void setProcessiongworkflowId(String processiongworkflowId) {
        this.processiongworkflowId = processiongworkflowId;
    }

    /**
     * 获取状态编号
     * 
     * @return 状态编号
     */
    public Integer getStatus() {
        return this.status;
    }

    /**
     * 设置状态编号
     * 
     * @param status
     *          状态编号
     */
    public void setStatus(Integer status) {
        this.status = status;
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
    public String getStarttime() {
        return this.starttime;
    }

    /**
     * 设置
     * 
     * @param starttime
     */
    public void setStarttime(String starttime) {
        this.starttime = starttime;
    }

    /**
     * 获取
     * 
     * @return 
     */
    public String getFinishtime() {
        return this.finishtime;
    }

    /**
     * 设置
     * 
     * @param finishtime
     */
    public void setFinishtime(String finishtime) {
        this.finishtime = finishtime;
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
}
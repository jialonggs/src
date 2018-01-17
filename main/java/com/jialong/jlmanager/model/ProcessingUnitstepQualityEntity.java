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
 * 步骤质量总监关系表(PROCESSING_UNITSTEP_QUALITY)
 * 
 * @author lyz
 * @version 1.0.0 2017-12-31
 */
@Entity
@Table(name = "PROCESSING_UNITSTEP_QUALITY")
public class ProcessingUnitstepQualityEntity implements java.io.Serializable {
    /** 版本号 */
    private static final long serialVersionUID = 7867577222247727258L;

    /**  */
    @Id
    @Column(name = "PK_GUID", unique = true, nullable = false, length = 255)
    private String pkGuid;

    /** 操作员ID */
    @Column(name = "QUALITY_ID", nullable = true, length = 255)
    private String qualityId;

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
    @Column(name = "REMARK", nullable = true, length = 19)
    private String remark;

    /** 步骤 */
    @Column(name = "STATUS", nullable = true, length = 10)
    private Integer status;

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
     * 获取操作员ID
     * 
     * @return 操作员ID
     */
    public String getQualityId() {
        return this.qualityId;
    }

    /**
     * 设置操作员ID
     * 
     * @param qualityId
     *          操作员ID
     */
    public void setQualityId(String qualityId) {
        this.qualityId = qualityId;
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
    public String getRemark() {
        return this.remark;
    }

    /**
     * 设置
     * 
     * @param remark
     */
    public void setRemark(String remark) {
        this.remark = remark;
    }

    /**
     * 获取步骤
     * 
     * @return 步骤
     */
    public Integer getStatus() {
        return this.status;
    }

    /**
     * 设置步骤
     * 
     * @param status
     *          步骤
     */
    public void setStatus(Integer status) {
        this.status = status;
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
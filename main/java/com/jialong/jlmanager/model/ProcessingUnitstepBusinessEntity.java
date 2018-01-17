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
 * 商务总监步骤备注表(PROCESSING_UNITSTEP_BUSINESS)
 * 
 * @author lyz
 * @version 1.0.0 2017-12-31
 */
@Entity
@Table(name = "PROCESSING_UNITSTEP_BUSINESS")
public class ProcessingUnitstepBusinessEntity implements java.io.Serializable {
    /** 版本号 */
    private static final long serialVersionUID = -8950851107670241934L;

    /**  */
    @Id
    @Column(name = "PK_GUID", unique = true, nullable = false, length = 255)
    private String pkGuid;

    /** 商务ID */
    @Column(name = "BUSINESS_ID", nullable = true, length = 255)
    private String businessId;

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
    @Column(name = "PICURL", nullable = true, length = 255)
    private String picurl;

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
     * 获取商务ID
     * 
     * @return 商务ID
     */
    public String getBusinessId() {
        return this.businessId;
    }

    /**
     * 设置商务ID
     * 
     * @param businessId
     *          商务ID
     */
    public void setBusinessId(String businessId) {
        this.businessId = businessId;
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
    public String getPicurl() {
        return this.picurl;
    }

    /**
     * 设置步骤
     * 
     * @param picurl
     *          步骤
     */
    public void setPicurl(String picurl) {
        this.picurl = picurl;
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
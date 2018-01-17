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
 * 前期报告书的元件信息(DOC_PREVIOUSREPORT_PARTINFO)
 * 
 * @author lyz
 * @version 1.0.0 2017-12-31
 */
@Entity
@Table(name = "DOC_PREVIOUSREPORT_PARTINFO")
public class DocPreviousreportPartinfoEntity implements java.io.Serializable {
    /** 版本号 */
    private static final long serialVersionUID = 4882211748883416790L;

    /**  */
    @Id
    @Column(name = "PK_GUID", unique = true, nullable = false, length = 255)
    private String pkGuid;

    /** 操作员ID */
    @Column(name = "ORDER_ID", nullable = true, length = 255)
    private String orderId;

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

    /** 模具名称 */
    @Column(name = "MOULDNAME", nullable = true, length = 255)
    private String mouldname;

    /** 发模通知单 */
    @Column(name = "REPORT_ID", nullable = true, length = 255)
    private String reportId;

    /**  */
    @Column(name = "PICURL", nullable = true, length = 255)
    private String picurl;

    /** 收发模通知单模具ID */
    @Column(name = "COLLECTPARTINFO_ID", nullable = true)
    private String collectpartinfoId;

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
    public String getOrderId() {
        return this.orderId;
    }

    /**
     * 设置操作员ID
     * 
     * @param orderId
     *          操作员ID
     */
    public void setOrderId(String orderId) {
        this.orderId = orderId;
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
     * 获取模具名称
     * 
     * @return 模具名称
     */
    public String getMouldname() {
        return this.mouldname;
    }

    /**
     * 设置模具名称
     * 
     * @param mouldname
     *          模具名称
     */
    public void setMouldname(String mouldname) {
        this.mouldname = mouldname;
    }

    /**
     * 获取发模通知单
     * 
     * @return 发模通知单
     */
    public String getReportId() {
        return this.reportId;
    }

    /**
     * 设置发模通知单
     * 
     * @param reportId
     *          发模通知单
     */
    public void setReportId(String reportId) {
        this.reportId = reportId;
    }

    /**
     * 获取
     * 
     * @return 
     */
    public String getPicurl() {
        return this.picurl;
    }

    /**
     * 设置
     * 
     * @param picurl
     */
    public void setPicurl(String picurl) {
        this.picurl = picurl;
    }

    /**
     * 获取收发模通知单模具ID
     * 
     * @return 收发模通知单模具ID
     */
    public String getCollectpartinfoId() {
        return this.collectpartinfoId;
    }

    /**
     * 设置收发模通知单模具ID
     * 
     * @param collectpartinfoId
     *          收发模通知单模具ID
     */
    public void setCollectpartinfoId(String collectpartinfoId) {
        this.collectpartinfoId = collectpartinfoId;
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
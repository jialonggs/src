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
 * 收模订单列表(COLLECT_PARTINFO)
 * 
 * @author lyz
 * @version 1.0.0 2017-12-31
 */
@Entity
@Table(name = "COLLECT_PARTINFO")
public class CollectPartinfoEntity implements java.io.Serializable {
    /** 版本号 */
    private static final long serialVersionUID = 7066485025938794453L;

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

    /** 模具状态 */
    @Column(name = "STATUS", nullable = true, length = 10)
    private Integer status;

    /** 模具名称 */
    @Column(name = "MOULDNAME", nullable = true, length = 255)
    private String mouldname;

    /** 拆分人 */
    @Column(name = "SPIT_ID", nullable = true, length = 255)
    private String spitId;

    /** 拆分时间 */
    @Column(name = "SPITTIME", nullable = true, length = 19)
    private String spittime;

    /** 收发模通知单 */
    @Column(name = "COLLECTMOULD_ID", nullable = true, length = 255)
    private String collectmouldId;

    /** 发模通知单 */
    @Column(name = "SENDMOULD_ID", nullable = true, length = 255)
    private String sendmouldId;

    /**  */
    @Column(name = "PICURL", nullable = true, length = 255)
    private String picurl;

    /** 是否被选中 */
    @Column(name = "SELECT", nullable = true, length = 10)
    private Integer select;

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
     * 获取模具状态
     * 
     * @return 模具状态
     */
    public Integer getStatus() {
        return this.status;
    }

    /**
     * 设置模具状态
     * 
     * @param status
     *          模具状态
     */
    public void setStatus(Integer status) {
        this.status = status;
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
     * 获取拆分人
     * 
     * @return 拆分人
     */
    public String getSpitId() {
        return this.spitId;
    }

    /**
     * 设置拆分人
     * 
     * @param spitId
     *          拆分人
     */
    public void setSpitId(String spitId) {
        this.spitId = spitId;
    }

    /**
     * 获取拆分时间
     * 
     * @return 拆分时间
     */
    public String getSpittime() {
        return this.spittime;
    }

    /**
     * 设置拆分时间
     * 
     * @param spittime
     *          拆分时间
     */
    public void setSpittime(String spittime) {
        this.spittime = spittime;
    }

    /**
     * 获取收发模通知单
     * 
     * @return 收发模通知单
     */
    public String getCollectmouldId() {
        return this.collectmouldId;
    }

    /**
     * 设置收发模通知单
     * 
     * @param collectmouldId
     *          收发模通知单
     */
    public void setCollectmouldId(String collectmouldId) {
        this.collectmouldId = collectmouldId;
    }

    /**
     * 获取发模通知单
     * 
     * @return 发模通知单
     */
    public String getSendmouldId() {
        return this.sendmouldId;
    }

    /**
     * 设置发模通知单
     * 
     * @param sendmouldId
     *          发模通知单
     */
    public void setSendmouldId(String sendmouldId) {
        this.sendmouldId = sendmouldId;
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
     * 获取是否被选中
     * 
     * @return 是否被选中
     */
    public Integer getSelect() {
        return this.select;
    }

    /**
     * 设置是否被选中
     * 
     * @param select
     *          是否被选中
     */
    public void setSelect(Integer select) {
        this.select = select;
    }
}
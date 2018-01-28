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

    /** 订单ID */
    @Column(name = "ORDER_ID", nullable = true, length = 255)
    private String orderId;

    /** 更新时间 */
    @Column(name = "UPDATETIME", nullable = true, length = 19)
    private String updatetime;


    /** 是否删除 */
    @Column(name = "ISDELETE", nullable = true, length = 10)
    private Boolean isdelete;

    /** 添加/修改人 */
    @Column(name = "ADDUSER", nullable = true, length = 255)
    private String adduser;

    /**  */
    @Column(name = "REMARK", nullable = true, length = 255)
    private String remark;

    /** 模具状态 */
    @Column(name = "STATUS", nullable = true, length = 10)
    private Integer status;

    /** 模具名称 */
    @Column(name = "MOULDNAME", nullable = true, length = 255)
    private String mouldname;

    @Column(name = "MOULD_NUMBER", nullable = true, length = 10)
    private Integer mouldnumber;

    /** 创建时间 */
    @Column(name = "CREATETIME", nullable = true, length = 19)
    private String createtime;


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
    @Column(name = "IS_SELECT", nullable = true, length = 10)
    private Integer isselect;



    public  CollectPartinfoEntity () {

    }

    public static long getSerialVersionUID() {
        return serialVersionUID;
    }

    public String getPkGuid() {
        return pkGuid;
    }

    public void setPkGuid(String pkGuid) {
        this.pkGuid = pkGuid;
    }

    public String getOrderId() {
        return orderId;
    }

    public void setOrderId(String orderId) {
        this.orderId = orderId;
    }

    public String getUpdatetime() {
        return updatetime;
    }

    public void setUpdatetime(String updatetime) {
        this.updatetime = updatetime;
    }

    public Boolean getIsdelete() {
        return isdelete;
    }

    public void setIsdelete(Boolean isdelete) {
        this.isdelete = isdelete;
    }

    public String getAdduser() {
        return adduser;
    }

    public void setAdduser(String adduser) {
        this.adduser = adduser;
    }

    public String getRemark() {
        return remark;
    }

    public void setRemark(String remark) {
        this.remark = remark;
    }

    public Integer getStatus() {
        return status;
    }

    public void setStatus(Integer status) {
        this.status = status;
    }

    public String getMouldname() {
        return mouldname;
    }

    public void setMouldname(String mouldname) {
        this.mouldname = mouldname;
    }

    public Integer getMouldnumber() {
        return mouldnumber;
    }

    public void setMouldnumber(Integer mouldnumber) {
        this.mouldnumber = mouldnumber;
    }

    public String getCreatetime() {
        return createtime;
    }

    public void setCreatetime(String createtime) {
        this.createtime = createtime;
    }

    public String getCollectmouldId() {
        return collectmouldId;
    }

    public void setCollectmouldId(String collectmouldId) {
        this.collectmouldId = collectmouldId;
    }

    public String getSendmouldId() {
        return sendmouldId;
    }

    public void setSendmouldId(String sendmouldId) {
        this.sendmouldId = sendmouldId;
    }

    public String getPicurl() {
        return picurl;
    }

    public void setPicurl(String picurl) {
        this.picurl = picurl;
    }

    public Integer getIsselect() {
        return isselect;
    }

    public void setIsselect(Integer isselect) {
        this.isselect = isselect;
    }
}
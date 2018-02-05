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
import java.util.Date;

/**
 * 收模拆分订单列表(COLLECT_SPITINFO)
 * 
 * @author lyz
 * @version 1.0.0 2017-12-31
 */
@Entity
@Table(name = "COLLECT_SPITINFO")
public class CollectSpitinfoEntity implements java.io.Serializable {
    /** 版本号 */
    private static final long serialVersionUID = -22671996638903546L;

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
    private boolean isdelete;

    /** 添加/修改人 */
    @Column(name = "ADDUSER", nullable = true, length = 255)
    private String adduser;

    /**  */
    @Column(name = "REMARK", nullable = true, length = 19)
    private String remark;

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

    @Column(name = "SIWENNUM", nullable = true, length = 255)
    private Integer siwennum;

    @Column(name = "WUSIWENNUM", nullable = true, length = 255)
    private Integer wusiwennum;

    @Column(name = "MOULDNUM", nullable = true, length = 255)
    private Integer mouldnum;
    /**  */
    @Column(name = "CREATETIME", nullable = true, length = 19)
    private String createtime;



    public  CollectSpitinfoEntity () {

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

    public boolean isIsdelete() {
        return isdelete;
    }

    public void setIsdelete(boolean isdelete) {
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

    public String getMouldname() {
        return mouldname;
    }

    public void setMouldname(String mouldname) {
        this.mouldname = mouldname;
    }

    public String getSpitId() {
        return spitId;
    }

    public void setSpitId(String spitId) {
        this.spitId = spitId;
    }

    public String getSpittime() {
        return spittime;
    }

    public void setSpittime(String spittime) {
        this.spittime = spittime;
    }

    public String getCollectmouldId() {
        return collectmouldId;
    }

    public void setCollectmouldId(String collectmouldId) {
        this.collectmouldId = collectmouldId;
    }

    public Integer getSiwennum() {
        return siwennum;
    }

    public void setSiwennum(Integer siwennum) {
        this.siwennum = siwennum;
    }

    public Integer getWusiwennum() {
        return wusiwennum;
    }

    public void setWusiwennum(Integer wusiwennum) {
        this.wusiwennum = wusiwennum;
    }

    public Integer getMouldnum() {
        return mouldnum;
    }

    public void setMouldnum(Integer mouldnum) {
        this.mouldnum = mouldnum;
    }

    public String getCreatetime() {
        return createtime;
    }

    public void setCreatetime(String createtime) {
        this.createtime = createtime;
    }

    @Override
    public String toString() {
        return "CollectSpitinfoEntity{" +
                "pkGuid='" + pkGuid + '\'' +
                ", orderId='" + orderId + '\'' +
                ", updatetime='" + updatetime + '\'' +
                ", isdelete=" + isdelete +
                ", adduser='" + adduser + '\'' +
                ", remark='" + remark + '\'' +
                ", mouldname='" + mouldname + '\'' +
                ", spitId='" + spitId + '\'' +
                ", spittime='" + spittime + '\'' +
                ", collectmouldId='" + collectmouldId + '\'' +
                ", siwennum=" + siwennum +
                ", wusiwennum=" + wusiwennum +
                ", mouldnum=" + mouldnum +
                ", createtime='" + createtime + '\'' +
                '}';
    }
}
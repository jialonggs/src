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
 * 发模通知单(DOC_SENDMOULD)
 * 
 * @author lyz
 * @version 1.0.0 2017-12-31
 */
@Entity
@Table(name = "DOC_SENDMOULD")
public class DocSendmouldEntity implements java.io.Serializable {
    /** 版本号 */
    private static final long serialVersionUID = -142807914410099503L;

    /**  */
    @Id
    @Column(name = "PK_GUID", unique = true, nullable = false, length = 255)
    private String pkGuid;

    /** 文档ID */
    @Column(name = "DOC_ID", nullable = true, length = 255)
    private String docId;

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

    /** 发模时间 */
    @Column(name = "SENDTIME", nullable = true, length = 19)
    private String sendtime;

    /** 快递 */
    @Column(name = "MAIL", nullable = true, length = 10)
    private Integer mail;

    /** 是否有木箱 */
    @Column(name = "WOODENCASE", nullable = true, length = 10)
    private Integer woodencase;

    /** 是否有托盘 */
    @Column(name = "PALLET", nullable = true, length = 10)
    private Integer pallet;

    /** 是否有吊环 */
    @Column(name = "LIFTINGRING", nullable = true, length = 10)
    private Integer liftingring;

    /** 车牌号 */
    @Column(name = "CARNUM", nullable = true, length = 255)
    private String carnum;

    /** 司机电话 */
    @Column(name = "DRIVERPHONE", nullable = true, length = 255)
    private String driverphone;

    /** 图片数 */
    @Column(name = "PICURL", nullable = true, length = 255)
    private String picurl;

    /** 发货方式 */
    @Column(name = "FREIGHTTYPE", nullable = true, length = 10)
    private Integer freighttype;

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
     * 获取文档ID
     * 
     * @return 文档ID
     */
    public String getDocId() {
        return this.docId;
    }

    /**
     * 设置文档ID
     * 
     * @param docId
     *          文档ID
     */
    public void setDocId(String docId) {
        this.docId = docId;
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
     * 获取发模时间
     * 
     * @return 发模时间
     */
    public String getSendtime() {
        return this.sendtime;
    }

    /**
     * 设置发模时间
     * 
     * @param sendtime
     *          发模时间
     */
    public void setSendtime(String sendtime) {
        this.sendtime = sendtime;
    }

    /**
     * 获取快递
     * 
     * @return 快递
     */
    public Integer getMail() {
        return this.mail;
    }

    /**
     * 设置快递
     * 
     * @param mail
     *          快递
     */
    public void setMail(Integer mail) {
        this.mail = mail;
    }

    /**
     * 获取是否有木箱
     * 
     * @return 是否有木箱
     */
    public Integer getWoodencase() {
        return this.woodencase;
    }

    /**
     * 设置是否有木箱
     * 
     * @param woodencase
     *          是否有木箱
     */
    public void setWoodencase(Integer woodencase) {
        this.woodencase = woodencase;
    }

    /**
     * 获取是否有托盘
     * 
     * @return 是否有托盘
     */
    public Integer getPallet() {
        return this.pallet;
    }

    /**
     * 设置是否有托盘
     * 
     * @param pallet
     *          是否有托盘
     */
    public void setPallet(Integer pallet) {
        this.pallet = pallet;
    }

    /**
     * 获取是否有吊环
     * 
     * @return 是否有吊环
     */
    public Integer getLiftingring() {
        return this.liftingring;
    }

    /**
     * 设置是否有吊环
     * 
     * @param liftingring
     *          是否有吊环
     */
    public void setLiftingring(Integer liftingring) {
        this.liftingring = liftingring;
    }

    /**
     * 获取车牌号
     * 
     * @return 车牌号
     */
    public String getCarnum() {
        return this.carnum;
    }

    /**
     * 设置车牌号
     * 
     * @param carnum
     *          车牌号
     */
    public void setCarnum(String carnum) {
        this.carnum = carnum;
    }

    /**
     * 获取司机电话
     * 
     * @return 司机电话
     */
    public String getDriverphone() {
        return this.driverphone;
    }

    /**
     * 设置司机电话
     * 
     * @param driverphone
     *          司机电话
     */
    public void setDriverphone(String driverphone) {
        this.driverphone = driverphone;
    }

    /**
     * 获取图片数
     * 
     * @return 图片数
     */
    public String getPicurl() {
        return this.picurl;
    }

    /**
     * 设置图片数
     * 
     * @param picurl
     *          图片数
     */
    public void setPicurl(String picurl) {
        this.picurl = picurl;
    }

    /**
     * 获取发货方式
     * 
     * @return 发货方式
     */
    public Integer getFreighttype() {
        return this.freighttype;
    }

    /**
     * 设置发货方式
     * 
     * @param freighttype
     *          发货方式
     */
    public void setFreighttype(Integer freighttype) {
        this.freighttype = freighttype;
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
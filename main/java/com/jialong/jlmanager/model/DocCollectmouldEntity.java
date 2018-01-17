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
 * 首发模通知单(DOC_COLLECTMOULD)
 * 
 * @author lyz
 * @version 1.0.0 2017-12-31
 */
@Entity
@Table(name = "DOC_COLLECTMOULD")
public class DocCollectmouldEntity implements java.io.Serializable {
    /** 版本号 */
    private static final long serialVersionUID = 5737926942958159644L;

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

    /** 步骤 */
    @Column(name = "STATUS", nullable = true, length = 10)
    private Integer status;

    /**  */
    @Column(name = "FINISHTIME", nullable = true, length = 19)
    private String finishtime;

    /** 寄货方式 */
    @Column(name = "FREIGHTTYPE", nullable = true, length = 10)
    private Integer freighttype;

    /** 是否有木箱 */
    @Column(name = "WOODENCASE", nullable = true, length = 10)
    private Integer woodencase;

    /** 木箱数量 */
    @Column(name = "WOODENCASENUM", nullable = true, length = 10)
    private Integer woodencasenum;

    /** 是否有托盘 */
    @Column(name = "PALLET", nullable = true, length = 10)
    private Integer pallet;

    /** 托盘数量 */
    @Column(name = "PALLETNUM", nullable = true, length = 10)
    private Integer palletnum;

    /** 是否有吊环 */
    @Column(name = "LIFTINGRING", nullable = true, length = 10)
    private Integer liftingring;

    /** 吊环数量 */
    @Column(name = "LIFTINGRINGNUM", nullable = true, length = 10)
    private Integer liftingringnum;

    /** 车牌号 */
    @Column(name = "CARNUM", nullable = true, length = 255)
    private String carnum;

    /** 司机电话 */
    @Column(name = "DRIVERPHONE", nullable = true, length = 255)
    private String driverphone;

    /** 图片数 */
    @Column(name = "PICURL", nullable = true, length = 255)
    private String picurl;

    /** 蚀纹镶块 */
    @Column(name = "ETCHBORD", nullable = true, length = 10)
    private Integer etchbord;

    /** 紧缩本体还是分开 */
    @Column(name = "SEPARATE", nullable = true, length = 10)
    private Integer separate;

    /**  */
    @Column(name = "CREATETIME", nullable = true, length = 19)
    private String createtime;

    /** 批次 */
    @Column(name = "BATCH", nullable = true, length = 255)
    private String batch;
    @Column(name = "RECIVETIME", nullable = true, length = 255)
    private String receivetime;
    /** 客户单位 */
    @Column(name = "CLIENTCOMPANY", nullable = true, length = 255)
    private String clientcompany;


    public String getReceivetime() {
        return receivetime;
    }

    public void setReceivetime(String receivetime) {
        this.receivetime = receivetime;
    }

    public String getClientcompany() {
        return clientcompany;
    }

    public void setClientcompany(String clientcompany) {
        this.clientcompany = clientcompany;
    }

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
     * 获取寄货方式
     * 
     * @return 寄货方式
     */
    public Integer getFreighttype() {
        return this.freighttype;
    }

    /**
     * 设置寄货方式
     * 
     * @param freighttype
     *          寄货方式
     */
    public void setFreighttype(Integer freighttype) {
        this.freighttype = freighttype;
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
     * 获取木箱数量
     * 
     * @return 木箱数量
     */
    public Integer getWoodencasenum() {
        return this.woodencasenum;
    }

    /**
     * 设置木箱数量
     * 
     * @param woodencasenum
     *          木箱数量
     */
    public void setWoodencasenum(Integer woodencasenum) {
        this.woodencasenum = woodencasenum;
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
     * 获取托盘数量
     * 
     * @return 托盘数量
     */
    public Integer getPalletnum() {
        return this.palletnum;
    }

    /**
     * 设置托盘数量
     * 
     * @param palletnum
     *          托盘数量
     */
    public void setPalletnum(Integer palletnum) {
        this.palletnum = palletnum;
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
     * 获取吊环数量
     * 
     * @return 吊环数量
     */
    public Integer getLiftingringnum() {
        return this.liftingringnum;
    }

    /**
     * 设置吊环数量
     * 
     * @param liftingringnum
     *          吊环数量
     */
    public void setLiftingringnum(Integer liftingringnum) {
        this.liftingringnum = liftingringnum;
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
     * 获取蚀纹镶块
     * 
     * @return 蚀纹镶块
     */
    public Integer getEtchbord() {
        return this.etchbord;
    }

    /**
     * 设置蚀纹镶块
     * 
     * @param etchbord
     *          蚀纹镶块
     */
    public void setEtchbord(Integer etchbord) {
        this.etchbord = etchbord;
    }

    /**
     * 获取紧缩本体还是分开
     * 
     * @return 紧缩本体还是分开
     */
    public Integer getSeparate() {
        return this.separate;
    }

    /**
     * 设置紧缩本体还是分开
     * 
     * @param separate
     *          紧缩本体还是分开
     */
    public void setSeparate(Integer separate) {
        this.separate = separate;
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
     * 获取批次
     * 
     * @return 批次
     */
    public String getBatch() {
        return this.batch;
    }

    /**
     * 设置批次
     * 
     * @param batch
     *          批次
     */
    public void setBatch(String batch) {
        this.batch = batch;
    }
}
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
    @Column(name = "REMARK", nullable = true, length = 1024)
    private String remark;

    /** 步骤 */
    @Column(name = "STATUS", nullable = true, length = 10)
    private Integer status;

    /**  */
    @Column(name = "FINISHTIME", nullable = true, length = 19)
    private String finishtime;

    /** 寄货方式 */
    @Column(name = "FREIGHTTYPE", nullable = true, length = 10)
    private String freighttype;

//    /** 是否有木箱 */
//    @Column(name = "WOODENCASE", nullable = true, length = 10)
//    private Integer woodencase;

    /** 木箱数量 */
    @Column(name = "WOODENCASENUM", nullable = true, length = 10)
    private Integer woodencasenum;

//    /** 是否有托盘 */
//    @Column(name = "PALLET", nullable = true, length = 10)
//    private Integer pallet;

    /** 托盘数量 */
    @Column(name = "PALLETNUM", nullable = true, length = 10)
    private Integer palletnum;

//    /** 是否有吊环 */
//    @Column(name = "LIFTINGRING", nullable = true, length = 10)
//    private Integer liftingring;

    /** 吊环数量 */
    @Column(name = "LIFTINGRINGNUM", nullable = true, length = 10)
    private Integer liftingringnum;

    @Column(name = "JIANBAO", nullable = true, length = 10)
    private boolean jianbao;

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

    /** 客户单位 */
    @Column(name = "CLIENTCOMPANY", nullable = true, length = 255)
    private String clientcompany;

    public DocCollectmouldEntity () {

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

    public String getDocId() {
        return docId;
    }

    public void setDocId(String docId) {
        this.docId = docId;
    }

    public String getUpdatetime() {
        return updatetime;
    }

    public void setUpdatetime(String updatetime) {
        this.updatetime = updatetime;
    }

    public Integer getIsdelete() {
        return isdelete;
    }

    public void setIsdelete(Integer isdelete) {
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

    public String getFinishtime() {
        return finishtime;
    }

    public void setFinishtime(String finishtime) {
        this.finishtime = finishtime;
    }

    public String getFreighttype() {
        return freighttype;
    }

    public void setFreighttype(String freighttype) {
        this.freighttype = freighttype;
    }

    public Integer getWoodencasenum() {
        return woodencasenum;
    }

    public void setWoodencasenum(Integer woodencasenum) {
        this.woodencasenum = woodencasenum;
    }

    public Integer getPalletnum() {
        return palletnum;
    }

    public void setPalletnum(Integer palletnum) {
        this.palletnum = palletnum;
    }

    public Integer getLiftingringnum() {
        return liftingringnum;
    }

    public void setLiftingringnum(Integer liftingringnum) {
        this.liftingringnum = liftingringnum;
    }

    public boolean isJianbao() {
        return jianbao;
    }

    public void setJianbao(boolean jianbao) {
        this.jianbao = jianbao;
    }

    public String getCarnum() {
        return carnum;
    }

    public void setCarnum(String carnum) {
        this.carnum = carnum;
    }

    public String getDriverphone() {
        return driverphone;
    }

    public void setDriverphone(String driverphone) {
        this.driverphone = driverphone;
    }

    public String getPicurl() {
        return picurl;
    }

    public void setPicurl(String picurl) {
        this.picurl = picurl;
    }

    public Integer getEtchbord() {
        return etchbord;
    }

    public void setEtchbord(Integer etchbord) {
        this.etchbord = etchbord;
    }

    public Integer getSeparate() {
        return separate;
    }

    public void setSeparate(Integer separate) {
        this.separate = separate;
    }

    public String getCreatetime() {
        return createtime;
    }

    public void setCreatetime(String createtime) {
        this.createtime = createtime;
    }

    public String getBatch() {
        return batch;
    }

    public void setBatch(String batch) {
        this.batch = batch;
    }


    public String getClientcompany() {
        return clientcompany;
    }

    public void setClientcompany(String clientcompany) {
        this.clientcompany = clientcompany;
    }
}
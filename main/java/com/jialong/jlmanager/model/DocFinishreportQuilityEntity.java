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
 * 完毕报告书质量检测列表(DOC_FINISHREPORT_QUILITY)
 * 
 * @author lyz
 * @version 1.0.0 2017-12-31
 */
@Entity
@Table(name = "DOC_FINISHREPORT_QUILITY")
public class DocFinishreportQuilityEntity implements java.io.Serializable {
    /** 版本号 */
    private static final long serialVersionUID = -4842152413144595847L;

    /**  */
    @Id
    @Column(name = "PK_GUID", unique = true, nullable = false, length = 255)
    private String pkGuid;

    /** 文档ID */
    @Column(name = "FINISHREPORTDOC_ID", nullable = true, length = 255)
    private String finishreportdocId;

    /** 更新时间 */
    @Column(name = "UPDATETIME", nullable = true, length = 19)
    private String updatetime;

    /** 是否删除 */
    @Column(name = "ISDELETE", nullable = true, length = 10)
    private Integer isdelete;

    /** 添加/修改人 */
    @Column(name = "ADDUSER", nullable = true, length = 255)
    private String adduser;

    /** 创建日期 */
    @Column(name = "CREATETIME", nullable = true, length = 10)
    private String createtime;

    /**  */
    @Column(name = "TEXTURINGCODE", nullable = true, length = 255)
    private String texturingcode;

    /**  */
    @Column(name = "DEPTHSTANDARD", nullable = true, length = 255)
    private String depthstandard;

    /**  */
    @Column(name = "DEPTHREAL", nullable = true, length = 255)
    private String depthreal;

    /**  */
    @Column(name = "GLOSSSTANDARD", nullable = true, length = 255)
    private String glossstandard;

    /**  */
    @Column(name = "GLOSSREAL", nullable = true, length = 255)
    private String glossreal;

    /**  */
    @Column(name = "PICURL", nullable = true, length = 255)
    private String picurl;

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
    public String getFinishreportdocId() {
        return this.finishreportdocId;
    }

    /**
     * 设置文档ID
     * 
     * @param finishreportdocId
     *          文档ID
     */
    public void setFinishreportdocId(String finishreportdocId) {
        this.finishreportdocId = finishreportdocId;
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
     * 获取创建日期
     * 
     * @return 创建日期
     */
    public String getCreatetime() {
        return this.createtime;
    }

    /**
     * 设置创建日期
     * 
     * @param createtime
     *          创建日期
     */
    public void setCreatetime(String createtime) {
        this.createtime = createtime;
    }

    /**
     * 获取
     * 
     * @return 
     */
    public String getTexturingcode() {
        return this.texturingcode;
    }

    /**
     * 设置
     * 
     * @param texturingcode
     */
    public void setTexturingcode(String texturingcode) {
        this.texturingcode = texturingcode;
    }

    /**
     * 获取
     * 
     * @return 
     */
    public String getDepthstandard() {
        return this.depthstandard;
    }

    /**
     * 设置
     * 
     * @param depthstandard
     */
    public void setDepthstandard(String depthstandard) {
        this.depthstandard = depthstandard;
    }

    /**
     * 获取
     * 
     * @return 
     */
    public String getDepthreal() {
        return this.depthreal;
    }

    /**
     * 设置
     * 
     * @param depthreal
     */
    public void setDepthreal(String depthreal) {
        this.depthreal = depthreal;
    }

    /**
     * 获取
     * 
     * @return 
     */
    public String getGlossstandard() {
        return this.glossstandard;
    }

    /**
     * 设置
     * 
     * @param glossstandard
     */
    public void setGlossstandard(String glossstandard) {
        this.glossstandard = glossstandard;
    }

    /**
     * 获取
     * 
     * @return 
     */
    public String getGlossreal() {
        return this.glossreal;
    }

    /**
     * 设置
     * 
     * @param glossreal
     */
    public void setGlossreal(String glossreal) {
        this.glossreal = glossreal;
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
}
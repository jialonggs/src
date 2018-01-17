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
 * 前期报告书模具不合格说明(DOC_PREVIOUSREPORT_QUESTION)
 * 
 * @author lyz
 * @version 1.0.0 2017-12-31
 */
@Entity
@Table(name = "DOC_PREVIOUSREPORT_QUESTION")
public class DocPreviousreportQuestionEntity implements java.io.Serializable {
    /** 版本号 */
    private static final long serialVersionUID = -5615562199670610537L;

    /**  */
    @Id
    @Column(name = "PK_GUID", unique = true, nullable = false, length = 255)
    private String pkGuid;

    /** 前期报告书文档ID */
    @Column(name = "REPORTDOC_ID", nullable = true, length = 255)
    private String reportdocId;

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
    @Column(name = "CREATETIME", nullable = true, length = 19)
    private String createtime;

    /** 不合格图片 */
    @Column(name = "PICURL", nullable = true, length = 255)
    private String picurl;

    /** 不合格说明 */
    @Column(name = "REMARK", nullable = true, length = 2)
    private String remark;

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
     * 获取前期报告书文档ID
     * 
     * @return 前期报告书文档ID
     */
    public String getReportdocId() {
        return this.reportdocId;
    }

    /**
     * 设置前期报告书文档ID
     * 
     * @param reportdocId
     *          前期报告书文档ID
     */
    public void setReportdocId(String reportdocId) {
        this.reportdocId = reportdocId;
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
     * 获取不合格图片
     * 
     * @return 不合格图片
     */
    public String getPicurl() {
        return this.picurl;
    }

    /**
     * 设置不合格图片
     * 
     * @param picurl
     *          不合格图片
     */
    public void setPicurl(String picurl) {
        this.picurl = picurl;
    }

    /**
     * 获取不合格说明
     * 
     * @return 不合格说明
     */
    public String getRemark() {
        return this.remark;
    }

    /**
     * 设置不合格说明
     * 
     * @param remark
     *          不合格说明
     */
    public void setRemark(String remark) {
        this.remark = remark;
    }
}
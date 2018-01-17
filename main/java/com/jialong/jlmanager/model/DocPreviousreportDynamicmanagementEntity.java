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
 * 前期报告书动态管理信息(DOC_PREVIOUSREPORT_DYNAMICMANAGEMENT)
 * 
 * @author lyz
 * @version 1.0.0 2017-12-31
 */
@Entity
@Table(name = "DOC_PREVIOUSREPORT_DYNAMICMANAGEMENT")
public class DocPreviousreportDynamicmanagementEntity implements java.io.Serializable {
    /** 版本号 */
    private static final long serialVersionUID = -7619094127391174461L;

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
    @Column(name = "CREATETIME", nullable = true, length = 10)
    private String createtime;

    /** 确定加工日期 */
    @Column(name = "DETERMINEDATE", nullable = true, length = 10)
    private Integer determinedate;

    /** 动态日汇报是否建立 */
    @Column(name = "DYNAMICREPORT", nullable = true, length = 10)
    private Integer dynamicreport;

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
     * 获取确定加工日期
     * 
     * @return 确定加工日期
     */
    public Integer getDeterminedate() {
        return this.determinedate;
    }

    /**
     * 设置确定加工日期
     * 
     * @param determinedate
     *          确定加工日期
     */
    public void setDeterminedate(Integer determinedate) {
        this.determinedate = determinedate;
    }

    /**
     * 获取动态日汇报是否建立
     * 
     * @return 动态日汇报是否建立
     */
    public Integer getDynamicreport() {
        return this.dynamicreport;
    }

    /**
     * 设置动态日汇报是否建立
     * 
     * @param dynamicreport
     *          动态日汇报是否建立
     */
    public void setDynamicreport(Integer dynamicreport) {
        this.dynamicreport = dynamicreport;
    }
}
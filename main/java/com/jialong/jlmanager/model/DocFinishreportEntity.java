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
 * 完毕报告书(DOC_FINISHREPORT)
 * 
 * @author lyz
 * @version 1.0.0 2017-12-31
 */
@Entity
@Table(name = "DOC_FINISHREPORT")
public class DocFinishreportEntity implements java.io.Serializable {
    /** 版本号 */
    private static final long serialVersionUID = 39979409582261935L;

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

    /** 创建日期 */
    @Column(name = "CREATETIME", nullable = true, length = 10)
    private String createtime;

    /** 纹理区域 */
    @Column(name = "TEXTUREAREA", nullable = true, length = 255)
    private String texturearea;

    /** 纹理方向 */
    @Column(name = "TEXTUREDIRECTION", nullable = true, length = 255)
    private String texturedirection;

    /** 注塑测定 */
    @Column(name = "INJECTIONMOLDING", nullable = true, length = 10)
    private Integer injectionmolding;

    /** 订单ID */
    @Column(name = "ORDER_ID", nullable = true, length = 255)
    private String orderId;

    /** 检验方式 */
    @Column(name = "INSPECTIONTYPE", nullable = true, length = 10)
    private Integer inspectiontype;

    /** 质量评估 */
    @Column(name = "QUALITYSTATUS", nullable = true, length = 10)
    private Integer qualitystatus;

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
     * 获取纹理区域
     * 
     * @return 纹理区域
     */
    public String getTexturearea() {
        return this.texturearea;
    }

    /**
     * 设置纹理区域
     * 
     * @param texturearea
     *          纹理区域
     */
    public void setTexturearea(String texturearea) {
        this.texturearea = texturearea;
    }

    /**
     * 获取纹理方向
     * 
     * @return 纹理方向
     */
    public String getTexturedirection() {
        return this.texturedirection;
    }

    /**
     * 设置纹理方向
     * 
     * @param texturedirection
     *          纹理方向
     */
    public void setTexturedirection(String texturedirection) {
        this.texturedirection = texturedirection;
    }

    /**
     * 获取注塑测定
     * 
     * @return 注塑测定
     */
    public Integer getInjectionmolding() {
        return this.injectionmolding;
    }

    /**
     * 设置注塑测定
     * 
     * @param injectionmolding
     *          注塑测定
     */
    public void setInjectionmolding(Integer injectionmolding) {
        this.injectionmolding = injectionmolding;
    }

    /**
     * 获取订单ID
     * 
     * @return 订单ID
     */
    public String getOrderId() {
        return this.orderId;
    }

    /**
     * 设置订单ID
     * 
     * @param orderId
     *          订单ID
     */
    public void setOrderId(String orderId) {
        this.orderId = orderId;
    }

    /**
     * 获取检验方式
     * 
     * @return 检验方式
     */
    public Integer getInspectiontype() {
        return this.inspectiontype;
    }

    /**
     * 设置检验方式
     * 
     * @param inspectiontype
     *          检验方式
     */
    public void setInspectiontype(Integer inspectiontype) {
        this.inspectiontype = inspectiontype;
    }

    /**
     * 获取质量评估
     * 
     * @return 质量评估
     */
    public Integer getQualitystatus() {
        return this.qualitystatus;
    }

    /**
     * 设置质量评估
     * 
     * @param qualitystatus
     *          质量评估
     */
    public void setQualitystatus(Integer qualitystatus) {
        this.qualitystatus = qualitystatus;
    }
}
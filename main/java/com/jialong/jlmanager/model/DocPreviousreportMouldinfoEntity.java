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
 * 前期报告书模具信息(DOC_PREVIOUSREPORT_MOULDINFO)
 * 
 * @author lyz
 * @version 1.0.0 2017-12-31
 */
@Entity
@Table(name = "DOC_PREVIOUSREPORT_MOULDINFO")
public class DocPreviousreportMouldinfoEntity implements java.io.Serializable {
    /** 版本号 */
    private static final long serialVersionUID = 1067356823733631054L;

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

    /** 主机厂纹理批准书 */
    @Column(name = "APPROVEBOOK", nullable = true, length = 255)
    private String approvebook;

    /** 钢材类型 */
    @Column(name = "STEELTYPE", nullable = true, length = 255)
    private String steeltype;

    /** 模具件数 */
    @Column(name = "MOULDNUM", nullable = true, length = 10)
    private Integer mouldnum;

    /** 型腔数量 */
    @Column(name = "CAVITYNUM", nullable = true, length = 10)
    private Integer cavitynum;

    /** 材料硬度 */
    @Column(name = "MATERIALHARDNESS", nullable = true, length = 255)
    private String materialhardness;

    /** 经过热处理 */
    @Column(name = "HEATTREATMENT", nullable = true, length = 10)
    private Integer heattreatment;

    /** 最小拔模斜度 */
    @Column(name = "MINDRAFTANGLE", nullable = true, length = 255)
    private String mindraftangle;

    /** 滑块镶块 */
    @Column(name = "SLIDER", nullable = true, length = 10)
    private Integer slider;

    /** 表面火化层是否清空 */
    @Column(name = "SPARKLAYER", nullable = true, length = 10)
    private Integer sparklayer;

    /** 达到表面抛光要求 */
    @Column(name = "BUFFING", nullable = true, length = 10)
    private Integer buffing;

    /** 是否焊接 */
    @Column(name = "WELDING", nullable = true, length = 10)
    private Integer welding;

    /** 是否使用指定焊丝 */
    @Column(name = "WELDINGWIRE", nullable = true, length = 10)
    private Integer weldingwire;

    /** 是否超过400度焊接处理 */
    @Column(name = "WELDING400", nullable = true, length = 10)
    private Integer welding400;

    /** 氮化处理热处理 */
    @Column(name = "NITRIDE", nullable = true, length = 10)
    private Integer nitride;

    /** 备注 */
    @Column(name = "REMARK", nullable = true, length = 10)
    private Integer remark;

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
     * 获取主机厂纹理批准书
     * 
     * @return 主机厂纹理批准书
     */
    public String getApprovebook() {
        return this.approvebook;
    }

    /**
     * 设置主机厂纹理批准书
     * 
     * @param approvebook
     *          主机厂纹理批准书
     */
    public void setApprovebook(String approvebook) {
        this.approvebook = approvebook;
    }

    /**
     * 获取钢材类型
     * 
     * @return 钢材类型
     */
    public String getSteeltype() {
        return this.steeltype;
    }

    /**
     * 设置钢材类型
     * 
     * @param steeltype
     *          钢材类型
     */
    public void setSteeltype(String steeltype) {
        this.steeltype = steeltype;
    }

    /**
     * 获取模具件数
     * 
     * @return 模具件数
     */
    public Integer getMouldnum() {
        return this.mouldnum;
    }

    /**
     * 设置模具件数
     * 
     * @param mouldnum
     *          模具件数
     */
    public void setMouldnum(Integer mouldnum) {
        this.mouldnum = mouldnum;
    }

    /**
     * 获取型腔数量
     * 
     * @return 型腔数量
     */
    public Integer getCavitynum() {
        return this.cavitynum;
    }

    /**
     * 设置型腔数量
     * 
     * @param cavitynum
     *          型腔数量
     */
    public void setCavitynum(Integer cavitynum) {
        this.cavitynum = cavitynum;
    }

    /**
     * 获取材料硬度
     * 
     * @return 材料硬度
     */
    public String getMaterialhardness() {
        return this.materialhardness;
    }

    /**
     * 设置材料硬度
     * 
     * @param materialhardness
     *          材料硬度
     */
    public void setMaterialhardness(String materialhardness) {
        this.materialhardness = materialhardness;
    }

    /**
     * 获取经过热处理
     * 
     * @return 经过热处理
     */
    public Integer getHeattreatment() {
        return this.heattreatment;
    }

    /**
     * 设置经过热处理
     * 
     * @param heattreatment
     *          经过热处理
     */
    public void setHeattreatment(Integer heattreatment) {
        this.heattreatment = heattreatment;
    }

    /**
     * 获取最小拔模斜度
     * 
     * @return 最小拔模斜度
     */
    public String getMindraftangle() {
        return this.mindraftangle;
    }

    /**
     * 设置最小拔模斜度
     * 
     * @param mindraftangle
     *          最小拔模斜度
     */
    public void setMindraftangle(String mindraftangle) {
        this.mindraftangle = mindraftangle;
    }

    /**
     * 获取滑块镶块
     * 
     * @return 滑块镶块
     */
    public Integer getSlider() {
        return this.slider;
    }

    /**
     * 设置滑块镶块
     * 
     * @param slider
     *          滑块镶块
     */
    public void setSlider(Integer slider) {
        this.slider = slider;
    }

    /**
     * 获取表面火化层是否清空
     * 
     * @return 表面火化层是否清空
     */
    public Integer getSparklayer() {
        return this.sparklayer;
    }

    /**
     * 设置表面火化层是否清空
     * 
     * @param sparklayer
     *          表面火化层是否清空
     */
    public void setSparklayer(Integer sparklayer) {
        this.sparklayer = sparklayer;
    }

    /**
     * 获取达到表面抛光要求
     * 
     * @return 达到表面抛光要求
     */
    public Integer getBuffing() {
        return this.buffing;
    }

    /**
     * 设置达到表面抛光要求
     * 
     * @param buffing
     *          达到表面抛光要求
     */
    public void setBuffing(Integer buffing) {
        this.buffing = buffing;
    }

    /**
     * 获取是否焊接
     * 
     * @return 是否焊接
     */
    public Integer getWelding() {
        return this.welding;
    }

    /**
     * 设置是否焊接
     * 
     * @param welding
     *          是否焊接
     */
    public void setWelding(Integer welding) {
        this.welding = welding;
    }

    /**
     * 获取是否使用指定焊丝
     * 
     * @return 是否使用指定焊丝
     */
    public Integer getWeldingwire() {
        return this.weldingwire;
    }

    /**
     * 设置是否使用指定焊丝
     * 
     * @param weldingwire
     *          是否使用指定焊丝
     */
    public void setWeldingwire(Integer weldingwire) {
        this.weldingwire = weldingwire;
    }

    /**
     * 获取是否超过400度焊接处理
     * 
     * @return 是否超过400度焊接处理
     */
    public Integer getWelding400() {
        return this.welding400;
    }

    /**
     * 设置是否超过400度焊接处理
     * 
     * @param welding400
     *          是否超过400度焊接处理
     */
    public void setWelding400(Integer welding400) {
        this.welding400 = welding400;
    }

    /**
     * 获取氮化处理热处理
     * 
     * @return 氮化处理热处理
     */
    public Integer getNitride() {
        return this.nitride;
    }

    /**
     * 设置氮化处理热处理
     * 
     * @param nitride
     *          氮化处理热处理
     */
    public void setNitride(Integer nitride) {
        this.nitride = nitride;
    }

    /**
     * 获取备注
     * 
     * @return 备注
     */
    public Integer getRemark() {
        return this.remark;
    }

    /**
     * 设置备注
     * 
     * @param remark
     *          备注
     */
    public void setRemark(Integer remark) {
        this.remark = remark;
    }
}
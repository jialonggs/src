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
 * 前期报告书零件信息(DOC_PREVIOUS_PARTINFO)
 * 
 * @author lyz
 * @version 1.0.0 2017-12-31
 */
@Entity
@Table(name = "DOC_PREVIOUS_PARTINFO")
public class DocPreviousPartinfoEntity implements java.io.Serializable {
    /** 版本号 */
    private static final long serialVersionUID = -8990705869232887103L;

    /**  */
    @Id
    @Column(name = "PK_GUID", unique = true, nullable = false, length = 255)
    private String pkGuid;

    /** 前期加工报告书ID */
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

    /**  */
    @Column(name = "CARTYPE", nullable = true, length = 255)
    private String cartype;

    /** 零件号 */
    @Column(name = "PARTSCODE", nullable = true, length = 255)
    private String partscode;

    /** 零件类型 */
    @Column(name = "PARTSNAME", nullable = true, length = 255)
    private String partsname;

    /**  */
    @Column(name = "TEXTURINGCODE", nullable = true, length = 255)
    private String texturingcode;

    /** 纹理光泽度 */
    @Column(name = "TEXTURELUSTER", nullable = true, length = 255)
    private String textureluster;

    /** 纹理深度 */
    @Column(name = "TEXTUREDEPTH", nullable = true, length = 255)
    private String texturedepth;

    /** 纹理方向 */
    @Column(name = "TEXTUREDIRECTION", nullable = true, length = 10)
    private Integer texturedirection;

    /** 纹理区域 */
    @Column(name = "TEXTUREAREA", nullable = true, length = 10)
    private Integer texturearea;

    /** 是否留光边 */
    @Column(name = "OPTICALMARGIN", nullable = true, length = 10)
    private Integer opticalmargin;

    /** 光边尺寸 */
    @Column(name = "OPTICALMARGINDIMENSION", nullable = true, length = 10)
    private Integer opticalmargindimension;

    /** 穿碰区域 */
    @Column(name = "TOUCHAREA", nullable = true, length = 10)
    private Integer toucharea;

    /** 最后一次光面是否提供 */
    @Column(name = "LINE", nullable = true, length = 10)
    private Integer line;

    /**  */
    @Column(name = "LASTSMOOTHSURFACE", nullable = true, length = 10)
    private Integer lastsmoothsurface;

    /** 是否注明不必蚀纹区域 */
    @Column(name = "NOETCH", nullable = true, length = 10)
    private Integer noetch;

    /** 是否提供CKD原件 */
    @Column(name = "CKD", nullable = true, length = 10)
    private Integer ckd;

    /** 塑料材料类型 */
    @Column(name = "PLASTIC", nullable = true, length = 255)
    private String plastic;

    /** 零件表面喷漆 */
    @Column(name = "SPRAYPAINT", nullable = true, length = 255)
    private String spraypaint;

    /** 表面喷漆厚度 */
    @Column(name = "SPRAYPAINTDIMENSION", nullable = true, length = 255)
    private String spraypaintdimension;

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
     * 获取前期加工报告书ID
     * 
     * @return 前期加工报告书ID
     */
    public String getReportdocId() {
        return this.reportdocId;
    }

    /**
     * 设置前期加工报告书ID
     * 
     * @param reportdocId
     *          前期加工报告书ID
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
     * 获取
     * 
     * @return 
     */
    public String getCartype() {
        return this.cartype;
    }

    /**
     * 设置
     * 
     * @param cartype
     */
    public void setCartype(String cartype) {
        this.cartype = cartype;
    }

    /**
     * 获取零件号
     * 
     * @return 零件号
     */
    public String getPartscode() {
        return this.partscode;
    }

    /**
     * 设置零件号
     * 
     * @param partscode
     *          零件号
     */
    public void setPartscode(String partscode) {
        this.partscode = partscode;
    }

    /**
     * 获取零件类型
     * 
     * @return 零件类型
     */
    public String getPartsname() {
        return this.partsname;
    }

    /**
     * 设置零件类型
     * 
     * @param partsname
     *          零件类型
     */
    public void setPartsname(String partsname) {
        this.partsname = partsname;
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
     * 获取纹理光泽度
     * 
     * @return 纹理光泽度
     */
    public String getTextureluster() {
        return this.textureluster;
    }

    /**
     * 设置纹理光泽度
     * 
     * @param textureluster
     *          纹理光泽度
     */
    public void setTextureluster(String textureluster) {
        this.textureluster = textureluster;
    }

    /**
     * 获取纹理深度
     * 
     * @return 纹理深度
     */
    public String getTexturedepth() {
        return this.texturedepth;
    }

    /**
     * 设置纹理深度
     * 
     * @param texturedepth
     *          纹理深度
     */
    public void setTexturedepth(String texturedepth) {
        this.texturedepth = texturedepth;
    }

    /**
     * 获取纹理方向
     * 
     * @return 纹理方向
     */
    public Integer getTexturedirection() {
        return this.texturedirection;
    }

    /**
     * 设置纹理方向
     * 
     * @param texturedirection
     *          纹理方向
     */
    public void setTexturedirection(Integer texturedirection) {
        this.texturedirection = texturedirection;
    }

    /**
     * 获取纹理区域
     * 
     * @return 纹理区域
     */
    public Integer getTexturearea() {
        return this.texturearea;
    }

    /**
     * 设置纹理区域
     * 
     * @param texturearea
     *          纹理区域
     */
    public void setTexturearea(Integer texturearea) {
        this.texturearea = texturearea;
    }

    /**
     * 获取是否留光边
     * 
     * @return 是否留光边
     */
    public Integer getOpticalmargin() {
        return this.opticalmargin;
    }

    /**
     * 设置是否留光边
     * 
     * @param opticalmargin
     *          是否留光边
     */
    public void setOpticalmargin(Integer opticalmargin) {
        this.opticalmargin = opticalmargin;
    }

    /**
     * 获取光边尺寸
     * 
     * @return 光边尺寸
     */
    public Integer getOpticalmargindimension() {
        return this.opticalmargindimension;
    }

    /**
     * 设置光边尺寸
     * 
     * @param opticalmargindimension
     *          光边尺寸
     */
    public void setOpticalmargindimension(Integer opticalmargindimension) {
        this.opticalmargindimension = opticalmargindimension;
    }

    /**
     * 获取穿碰区域
     * 
     * @return 穿碰区域
     */
    public Integer getToucharea() {
        return this.toucharea;
    }

    /**
     * 设置穿碰区域
     * 
     * @param toucharea
     *          穿碰区域
     */
    public void setToucharea(Integer toucharea) {
        this.toucharea = toucharea;
    }

    /**
     * 获取最后一次光面是否提供
     * 
     * @return 最后一次光面是否提供
     */
    public Integer getLine() {
        return this.line;
    }

    /**
     * 设置最后一次光面是否提供
     * 
     * @param line
     *          最后一次光面是否提供
     */
    public void setLine(Integer line) {
        this.line = line;
    }

    /**
     * 获取
     * 
     * @return 
     */
    public Integer getLastsmoothsurface() {
        return this.lastsmoothsurface;
    }

    /**
     * 设置
     * 
     * @param lastsmoothsurface
     */
    public void setLastsmoothsurface(Integer lastsmoothsurface) {
        this.lastsmoothsurface = lastsmoothsurface;
    }

    /**
     * 获取是否注明不必蚀纹区域
     * 
     * @return 是否注明不必蚀纹区域
     */
    public Integer getNoetch() {
        return this.noetch;
    }

    /**
     * 设置是否注明不必蚀纹区域
     * 
     * @param noetch
     *          是否注明不必蚀纹区域
     */
    public void setNoetch(Integer noetch) {
        this.noetch = noetch;
    }

    /**
     * 获取是否提供CKD原件
     * 
     * @return 是否提供CKD原件
     */
    public Integer getCkd() {
        return this.ckd;
    }

    /**
     * 设置是否提供CKD原件
     * 
     * @param ckd
     *          是否提供CKD原件
     */
    public void setCkd(Integer ckd) {
        this.ckd = ckd;
    }

    /**
     * 获取塑料材料类型
     * 
     * @return 塑料材料类型
     */
    public String getPlastic() {
        return this.plastic;
    }

    /**
     * 设置塑料材料类型
     * 
     * @param plastic
     *          塑料材料类型
     */
    public void setPlastic(String plastic) {
        this.plastic = plastic;
    }

    /**
     * 获取零件表面喷漆
     * 
     * @return 零件表面喷漆
     */
    public String getSpraypaint() {
        return this.spraypaint;
    }

    /**
     * 设置零件表面喷漆
     * 
     * @param spraypaint
     *          零件表面喷漆
     */
    public void setSpraypaint(String spraypaint) {
        this.spraypaint = spraypaint;
    }

    /**
     * 获取表面喷漆厚度
     * 
     * @return 表面喷漆厚度
     */
    public String getSpraypaintdimension() {
        return this.spraypaintdimension;
    }

    /**
     * 设置表面喷漆厚度
     * 
     * @param spraypaintdimension
     *          表面喷漆厚度
     */
    public void setSpraypaintdimension(String spraypaintdimension) {
        this.spraypaintdimension = spraypaintdimension;
    }
}
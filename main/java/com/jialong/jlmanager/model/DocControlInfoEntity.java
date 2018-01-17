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
 * 控制单书(DOC_CONTROL_INFO)
 * 
 * @author lyz
 * @version 1.0.0 2017-12-31
 */
@Entity
@Table(name = "DOC_CONTROL_INFO")
public class DocControlInfoEntity implements java.io.Serializable {
    /** 版本号 */
    private static final long serialVersionUID = 7393430283149178167L;

    /**  */
    @Id
    @Column(name = "PK_GUID", unique = true, nullable = false, length = 255)
    private String pkGuid;

    /** 文档ID */
    @Column(name = "DOC_ID", nullable = true, length = 255)
    private String docId;
    /** 订单ID */

    @Column(name = "ORDER_ID", nullable = true, length = 255)
    private String orderId;

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

    /** 区域 */
    @Column(name = "AREA", nullable = true, length = 10)
    private Integer area;

    /** 气孔 */
    @Column(name = "STOMATAL", nullable = true, length = 10)
    private Integer stomatal;

    /** 裂缝 */
    @Column(name = "CRACKS", nullable = true, length = 10)
    private Integer cracks;

    /** 缺口 */
    @Column(name = "GAP", nullable = true, length = 10)
    private Integer gap;

    /** 焊疤 */
    @Column(name = "WELDINGSCAR", nullable = true, length = 10)
    private Integer weldingscar;

    /** 电火花 */
    @Column(name = "EDM", nullable = true, length = 10)
    private Integer edm;

    /** 油石丝 */
    @Column(name = "ABRASIVEWIRE", nullable = true, length = 10)
    private Integer abrasivewire;

    /** 不平 */
    @Column(name = "ROUGH", nullable = true, length = 10)
    private Integer rough;

    /**  */
    @Column(name = "OPTICALEDGE", nullable = true, length = 255)
    private String opticaledge;

    /** 备注信息 */
    @Column(name = "REMARK", nullable = true, length = 255)
    private String remark;

    /** 同光泽处理区域 */
    @Column(name = "GLOSSAREA", nullable = true, length = 255)
    private String glossarea;

    /** 最后提供模具 */
    @Column(name = "LASTMODULE", nullable = true, length = 10)
    private Integer lastmodule;

    /** 最后提供模具数目 */
    @Column(name = "LASTMODULENUM", nullable = true, length = 10)
    private Integer lastmodulenum;

    /**  */
    @Column(name = "CKD", nullable = true, length = 10)
    private Integer ckd;

    /**  */
    @Column(name = "CKDNUM", nullable = true, length = 10)
    private Integer ckdnum;

    /** 碰穿边 */
    @Column(name = "EDGEWEAR", nullable = true, length = 10)
    private Integer edgewear;

    /** 预留光边单边 */
    @Column(name = "OPTICALEDGESINGLE", nullable = true, length = 10)
    private Integer opticaledgesingle;

    /** 预留光边合模处 */
    @Column(name = "OPTICALEDGEMUTI", nullable = true, length = 10)
    private Integer opticaledgemuti;

    public String getOrderId() {
        return orderId;
    }

    public void setOrderId(String orderId) {
        this.orderId = orderId;
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
     * 获取区域
     * 
     * @return 区域
     */
    public Integer getArea() {
        return this.area;
    }

    /**
     * 设置区域
     * 
     * @param area
     *          区域
     */
    public void setArea(Integer area) {
        this.area = area;
    }

    /**
     * 获取气孔
     * 
     * @return 气孔
     */
    public Integer getStomatal() {
        return this.stomatal;
    }

    /**
     * 设置气孔
     * 
     * @param stomatal
     *          气孔
     */
    public void setStomatal(Integer stomatal) {
        this.stomatal = stomatal;
    }

    /**
     * 获取裂缝
     * 
     * @return 裂缝
     */
    public Integer getCracks() {
        return this.cracks;
    }

    /**
     * 设置裂缝
     * 
     * @param cracks
     *          裂缝
     */
    public void setCracks(Integer cracks) {
        this.cracks = cracks;
    }

    /**
     * 获取缺口
     * 
     * @return 缺口
     */
    public Integer getGap() {
        return this.gap;
    }

    /**
     * 设置缺口
     * 
     * @param gap
     *          缺口
     */
    public void setGap(Integer gap) {
        this.gap = gap;
    }

    /**
     * 获取焊疤
     * 
     * @return 焊疤
     */
    public Integer getWeldingscar() {
        return this.weldingscar;
    }

    /**
     * 设置焊疤
     * 
     * @param weldingscar
     *          焊疤
     */
    public void setWeldingscar(Integer weldingscar) {
        this.weldingscar = weldingscar;
    }

    /**
     * 获取电火花
     * 
     * @return 电火花
     */
    public Integer getEdm() {
        return this.edm;
    }

    /**
     * 设置电火花
     * 
     * @param edm
     *          电火花
     */
    public void setEdm(Integer edm) {
        this.edm = edm;
    }

    /**
     * 获取油石丝
     * 
     * @return 油石丝
     */
    public Integer getAbrasivewire() {
        return this.abrasivewire;
    }

    /**
     * 设置油石丝
     * 
     * @param abrasivewire
     *          油石丝
     */
    public void setAbrasivewire(Integer abrasivewire) {
        this.abrasivewire = abrasivewire;
    }

    /**
     * 获取不平
     * 
     * @return 不平
     */
    public Integer getRough() {
        return this.rough;
    }

    /**
     * 设置不平
     * 
     * @param rough
     *          不平
     */
    public void setRough(Integer rough) {
        this.rough = rough;
    }

    /**
     * 获取
     * 
     * @return 
     */
    public String getOpticaledge() {
        return this.opticaledge;
    }

    /**
     * 设置
     * 
     * @param opticaledge
     */
    public void setOpticaledge(String opticaledge) {
        this.opticaledge = opticaledge;
    }

    /**
     * 获取备注信息
     * 
     * @return 备注信息
     */
    public String getRemark() {
        return this.remark;
    }

    /**
     * 设置备注信息
     * 
     * @param remark
     *          备注信息
     */
    public void setRemark(String remark) {
        this.remark = remark;
    }

    /**
     * 获取同光泽处理区域
     * 
     * @return 同光泽处理区域
     */
    public String getGlossarea() {
        return this.glossarea;
    }

    /**
     * 设置同光泽处理区域
     * 
     * @param glossarea
     *          同光泽处理区域
     */
    public void setGlossarea(String glossarea) {
        this.glossarea = glossarea;
    }

    /**
     * 获取最后提供模具
     * 
     * @return 最后提供模具
     */
    public Integer getLastmodule() {
        return this.lastmodule;
    }

    /**
     * 设置最后提供模具
     * 
     * @param lastmodule
     *          最后提供模具
     */
    public void setLastmodule(Integer lastmodule) {
        this.lastmodule = lastmodule;
    }

    /**
     * 获取最后提供模具数目
     * 
     * @return 最后提供模具数目
     */
    public Integer getLastmodulenum() {
        return this.lastmodulenum;
    }

    /**
     * 设置最后提供模具数目
     * 
     * @param lastmodulenum
     *          最后提供模具数目
     */
    public void setLastmodulenum(Integer lastmodulenum) {
        this.lastmodulenum = lastmodulenum;
    }

    /**
     * 获取
     * 
     * @return 
     */
    public Integer getCkd() {
        return this.ckd;
    }

    /**
     * 设置
     * 
     * @param ckd
     */
    public void setCkd(Integer ckd) {
        this.ckd = ckd;
    }

    /**
     * 获取
     * 
     * @return 
     */
    public Integer getCkdnum() {
        return this.ckdnum;
    }

    /**
     * 设置
     * 
     * @param ckdnum
     */
    public void setCkdnum(Integer ckdnum) {
        this.ckdnum = ckdnum;
    }

    /**
     * 获取碰穿边
     * 
     * @return 碰穿边
     */
    public Integer getEdgewear() {
        return this.edgewear;
    }

    /**
     * 设置碰穿边
     * 
     * @param edgewear
     *          碰穿边
     */
    public void setEdgewear(Integer edgewear) {
        this.edgewear = edgewear;
    }

    /**
     * 获取预留光边单边
     * 
     * @return 预留光边单边
     */
    public Integer getOpticaledgesingle() {
        return this.opticaledgesingle;
    }

    /**
     * 设置预留光边单边
     * 
     * @param opticaledgesingle
     *          预留光边单边
     */
    public void setOpticaledgesingle(Integer opticaledgesingle) {
        this.opticaledgesingle = opticaledgesingle;
    }

    /**
     * 获取预留光边合模处
     * 
     * @return 预留光边合模处
     */
    public Integer getOpticaledgemuti() {
        return this.opticaledgemuti;
    }

    /**
     * 设置预留光边合模处
     * 
     * @param opticaledgemuti
     *          预留光边合模处
     */
    public void setOpticaledgemuti(Integer opticaledgemuti) {
        this.opticaledgemuti = opticaledgemuti;
    }
}
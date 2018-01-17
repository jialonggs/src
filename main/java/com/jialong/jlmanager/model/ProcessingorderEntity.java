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

import com.alibaba.fastjson.annotation.JSONField;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

/**
 * 订单表 记录单笔订单(ProcessingOrder)
 * 
 * @author lyz
 * @version 1.0.0 2017-12-31
 */
@Entity
@Table(name = "ProcessingOrder")
public class ProcessingorderEntity implements java.io.Serializable {
    /** 版本号 */
    private static final long serialVersionUID = 3990870086655796453L;

    /**  */
    @Id
    @Column(name = "PK_GUID", unique = true, nullable = false, length = 255)
    private String pkGuid;

    /** 对应项目ID */
    @Column(name = "PROJECT_ID", nullable = true, length = 255)
    private String projectId;

    /** 订单名称 */
    @Column(name = "ORDERNAME", nullable = true, length = 255)
    private String ordername;

    /** 订单添加时间 */
    @Column(name = "CREATETIME", nullable = true, length = 19)
    private String createtime;

    /** 订单状态 */
    @Column(name = "STATUS", nullable = true, length = 10)
    private Integer status;

    /** 结束时间 */
    @Column(name = "FINISHTIME", nullable = true, length = 19)
    private String finishtime;

    /** 工艺类型 */
    @Column(name = "PROCESSINGTYPE", nullable = true, length = 10)
    private Integer processingtype;

    /** 车间负责人 */
    @Column(name = "WORKSHOPHEAD", nullable = true, length = 255)
    private String workshophead;

    /** 紧急程度 */
    @Column(name = "URGENCY", nullable = true, length = 10)
    private Integer urgency;

    /** 是否有备忘 */
    @Column(name = "HASREMARK", nullable = true, length = 10)
    private Integer hasremark;

    /** 预期时间（天） */
    @Column(name = "EXPECTED", nullable = true, length = 255)
    private String expected;

    /** 二维码信息（字符串） */
    @Column(name = "QRCODEINFO", nullable = true, length = 255)
    private String qrcodeinfo;

    /** 更新时间 */
    @Column(name = "UPDATETIME", nullable = true, length = 19)
    private String updatetime;

    /** 是否删除 */
    @Column(name = "ISDELETE", nullable = true, length = 10)
    private Integer isdelete;

    /** 添加/修改人 */
    @Column(name = "ADDUSER", nullable = true, length = 255)
    private String adduser;

    /** 发模通知单 */
    @Column(name = "SENDMODUL_ID", nullable = true)
    private String sendmodulId;

    /** 备注 */
    @Column(name = "REMARK", nullable = true)
    private String remark;

    /** 加工面积 */
    @Column(name = "Area", nullable = true)
    private String are;
    @JSONField(name ="controlInfo")
    private DocControlInfoEntity controlInfoEntity;

    public DocControlInfoEntity getControlInfoEntity() {
        return controlInfoEntity;
    }

    public void setControlInfoEntity(DocControlInfoEntity controlInfoEntity) {
        this.controlInfoEntity = controlInfoEntity;
    }

    public String getRemark() {
        return remark;
    }

    public void setRemark(String remark) {
        this.remark = remark;
    }

    public String getAre() {
        return are;
    }

    public void setAre(String are) {
        this.are = are;
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
     * 获取对应项目ID
     * 
     * @return 对应项目ID
     */
    public String getProjectId() {
        return this.projectId;
    }

    /**
     * 设置对应项目ID
     * 
     * @param projectId
     *          对应项目ID
     */
    public void setProjectId(String projectId) {
        this.projectId = projectId;
    }

    /**
     * 获取订单名称
     * 
     * @return 订单名称
     */
    public String getOrdername() {
        return this.ordername;
    }

    /**
     * 设置订单名称
     * 
     * @param ordername
     *          订单名称
     */
    public void setOrdername(String ordername) {
        this.ordername = ordername;
    }

    /**
     * 获取订单添加时间
     * 
     * @return 订单添加时间
     */
    public String getCreatetime() {
        return this.createtime;
    }

    /**
     * 设置订单添加时间
     * 
     * @param createtime
     *          订单添加时间
     */
    public void setCreatetime(String createtime) {
        this.createtime = createtime;
    }

    /**
     * 获取订单状态
     * 
     * @return 订单状态
     */
    public Integer getStatus() {
        return this.status;
    }

    /**
     * 设置订单状态
     * 
     * @param status
     *          订单状态
     */
    public void setStatus(Integer status) {
        this.status = status;
    }

    /**
     * 获取结束时间
     * 
     * @return 结束时间
     */
    public String getFinishtime() {
        return this.finishtime;
    }

    /**
     * 设置结束时间
     * 
     * @param finishtime
     *          结束时间
     */
    public void setFinishtime(String finishtime) {
        this.finishtime = finishtime;
    }

    /**
     * 获取工艺类型
     * 
     * @return 工艺类型
     */
    public Integer getProcessingtype() {
        return this.processingtype;
    }

    /**
     * 设置工艺类型
     * 
     * @param processingtype
     *          工艺类型
     */
    public void setProcessingtype(Integer processingtype) {
        this.processingtype = processingtype;
    }

    /**
     * 获取车间负责人
     * 
     * @return 车间负责人
     */
    public String getWorkshophead() {
        return this.workshophead;
    }

    /**
     * 设置车间负责人
     * 
     * @param workshophead
     *          车间负责人
     */
    public void setWorkshophead(String workshophead) {
        this.workshophead = workshophead;
    }

    /**
     * 获取紧急程度
     * 
     * @return 紧急程度
     */
    public Integer getUrgency() {
        return this.urgency;
    }

    /**
     * 设置紧急程度
     * 
     * @param urgency
     *          紧急程度
     */
    public void setUrgency(Integer urgency) {
        this.urgency = urgency;
    }

    /**
     * 获取是否有备忘
     * 
     * @return 是否有备忘
     */
    public Integer getHasremark() {
        return this.hasremark;
    }

    /**
     * 设置是否有备忘
     * 
     * @param hasremark
     *          是否有备忘
     */
    public void setHasremark(Integer hasremark) {
        this.hasremark = hasremark;
    }

    /**
     * 获取预期时间（天）
     * 
     * @return 预期时间（天）
     */
    public String getExpected() {
        return this.expected;
    }

    /**
     * 设置预期时间（天）
     * 
     * @param expected
     *          预期时间（天）
     */
    public void setExpected(String expected) {
        this.expected = expected;
    }

    /**
     * 获取二维码信息（字符串）
     * 
     * @return 二维码信息（字符串）
     */
    public String getQrcodeinfo() {
        return this.qrcodeinfo;
    }

    /**
     * 设置二维码信息（字符串）
     * 
     * @param qrcodeinfo
     *          二维码信息（字符串）
     */
    public void setQrcodeinfo(String qrcodeinfo) {
        this.qrcodeinfo = qrcodeinfo;
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
     * 获取发模通知单
     * 
     * @return 发模通知单
     */
    public String getSendmodulId() {
        return this.sendmodulId;
    }

    /**
     * 设置发模通知单
     * 
     * @param sendmodulId
     *          发模通知单
     */
    public void setSendmodulId(String sendmodulId) {
        this.sendmodulId = sendmodulId;
    }
}
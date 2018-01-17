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
 * 正式报价单(BUSINESS_FORMALITYPRICE)
 * 
 * @author lyz
 * @version 1.0.0 2017-12-31
 */
@Entity
@Table(name = "BUSINESS_FORMALITYPRICE")
public class BusinessFormalitypriceEntity implements java.io.Serializable {
    /** 版本号 */
    private static final long serialVersionUID = -313375087461401741L;

    /**  */
    @Id
    @Column(name = "PK_GUID", unique = true, nullable = false, length = 255)
    private String pkGuid;

    /** 对应项目ID */
    @Column(name = "PROJECT_ID", nullable = true, length = 255)
    private String projectId;

    /** 预报价单ID */
    @Column(name = "FORECASTPRICE_ID", nullable = true, length = 255)
    private String forecastpriceId;

    /** 电话号码 */
    @Column(name = "TEL", nullable = true, length = 255)
    private String tel;

    /** 订单添加时间 */
    @Column(name = "FAX", nullable = true, length = 255)
    private String fax;

    /** 车型 */
    @Column(name = "CARTYPE", nullable = true, length = 255)
    private String cartype;

    /** 审批状态 */
    @Column(name = "STATUS", nullable = true, length = 10)
    private Integer status;

    /** 添加时间 */
    @Column(name = "ADDTIME", nullable = true, length = 19)
    private String addtime;

    /** 审批人 */
    @Column(name = "APPROVER", nullable = true, length = 10)
    private Integer approver;

    /** 审批时间 */
    @Column(name = "APPROVETIME", nullable = true, length = 19)
    private String approvetime;

    /** 总价合计 */
    @Column(name = "TOTLEPRICE", nullable = true, length = 255)
    private String totleprice;

    /** 添加/修改人 */
    @Column(name = "ADDUSER", nullable = true, length = 255)
    private String adduser;

    /**  */
    @Column(name = "INSTRUCTIONS", nullable = true, length = 255)
    private String instructions;

    /**  */
    @Column(name = "SENDDATE", nullable = true, length = 10)
    private String senddate;

    /** 交货方式 */
    @Column(name = "PAYTYPE", nullable = true, length = 255)
    private String paytype;

    /** 交货日期 */
    @Column(name = "DELIVERYTIME", nullable = true, length = 255)
    private String deliverytime;

    /** 收件人 */
    @Column(name = "ADDRESSEE", nullable = true, length = 255)
    private String addressee;

    /** 致 */
    @Column(name = "TO", nullable = true, length = 255)
    private String to;

    /** 联系电话 */
    @Column(name = "CONTACTTEL", nullable = true, length = 255)
    private String contacttel;

    /** 加工单位 */
    @Column(name = "PROCESSINGUNIT", nullable = true, length = 255)
    private String processingunit;

    /** 模具名称 */
    @Column(name = "MOULDNAME", nullable = true, length = 255)
    private String mouldname;

    /** 纹理费用 */
    @Column(name = "TEXTURINGPRICE", nullable = true, length = 255)
    private String texturingprice;

    /** 打光费用 */
    @Column(name = "POLISHINGPRICE", nullable = true, length = 255)
    private String polishingprice;

    /** 额外费用 */
    @Column(name = "EXTRAPRICE", nullable = true, length = 255)
    private String extraprice;

    /** 是否删除 */
    @Column(name = "ISDELETE", nullable = true, length = 10)
    private Integer isdelete;

    /** 更新时间 */
    @Column(name = "UPDATETIME", nullable = true, length = 19)
    private String updatetime;

    /**  */
    @Column(name = "CREATETIME", nullable = true, length = 19)
    private String createtime;

    /** 备注 */
    @Column(name = "REMARK", nullable = true, length = 65535)
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
     * 获取预报价单ID
     * 
     * @return 预报价单ID
     */
    public String getForecastpriceId() {
        return this.forecastpriceId;
    }

    /**
     * 设置预报价单ID
     * 
     * @param forecastpriceId
     *          预报价单ID
     */
    public void setForecastpriceId(String forecastpriceId) {
        this.forecastpriceId = forecastpriceId;
    }

    /**
     * 获取电话号码
     * 
     * @return 电话号码
     */
    public String getTel() {
        return this.tel;
    }

    /**
     * 设置电话号码
     * 
     * @param tel
     *          电话号码
     */
    public void setTel(String tel) {
        this.tel = tel;
    }

    /**
     * 获取订单添加时间
     * 
     * @return 订单添加时间
     */
    public String getFax() {
        return this.fax;
    }

    /**
     * 设置订单添加时间
     * 
     * @param fax
     *          订单添加时间
     */
    public void setFax(String fax) {
        this.fax = fax;
    }

    /**
     * 获取车型
     * 
     * @return 车型
     */
    public String getCartype() {
        return this.cartype;
    }

    /**
     * 设置车型
     * 
     * @param cartype
     *          车型
     */
    public void setCartype(String cartype) {
        this.cartype = cartype;
    }

    /**
     * 获取审批状态
     * 
     * @return 审批状态
     */
    public Integer getStatus() {
        return this.status;
    }

    /**
     * 设置审批状态
     * 
     * @param status
     *          审批状态
     */
    public void setStatus(Integer status) {
        this.status = status;
    }

    /**
     * 获取添加时间
     * 
     * @return 添加时间
     */
    public String getAddtime() {
        return this.addtime;
    }

    /**
     * 设置添加时间
     * 
     * @param addtime
     *          添加时间
     */
    public void setAddtime(String addtime) {
        this.addtime = addtime;
    }

    /**
     * 获取审批人
     * 
     * @return 审批人
     */
    public Integer getApprover() {
        return this.approver;
    }

    /**
     * 设置审批人
     * 
     * @param approver
     *          审批人
     */
    public void setApprover(Integer approver) {
        this.approver = approver;
    }

    /**
     * 获取审批时间
     * 
     * @return 审批时间
     */
    public String getApprovetime() {
        return this.approvetime;
    }

    /**
     * 设置审批时间
     * 
     * @param approvetime
     *          审批时间
     */
    public void setApprovetime(String approvetime) {
        this.approvetime = approvetime;
    }

    /**
     * 获取总价合计
     * 
     * @return 总价合计
     */
    public String getTotleprice() {
        return this.totleprice;
    }

    /**
     * 设置总价合计
     * 
     * @param totleprice
     *          总价合计
     */
    public void setTotleprice(String totleprice) {
        this.totleprice = totleprice;
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
    public String getInstructions() {
        return this.instructions;
    }

    /**
     * 设置
     * 
     * @param instructions
     */
    public void setInstructions(String instructions) {
        this.instructions = instructions;
    }

    /**
     * 获取
     * 
     * @return 
     */
    public String getSenddate() {
        return this.senddate;
    }

    /**
     * 设置
     * 
     * @param senddate
     */
    public void setSenddate(String senddate) {
        this.senddate = senddate;
    }

    /**
     * 获取交货方式
     * 
     * @return 交货方式
     */
    public String getPaytype() {
        return this.paytype;
    }

    /**
     * 设置交货方式
     * 
     * @param paytype
     *          交货方式
     */
    public void setPaytype(String paytype) {
        this.paytype = paytype;
    }

    /**
     * 获取交货日期
     * 
     * @return 交货日期
     */
    public String getDeliverytime() {
        return this.deliverytime;
    }

    /**
     * 设置交货日期
     * 
     * @param deliverytime
     *          交货日期
     */
    public void setDeliverytime(String deliverytime) {
        this.deliverytime = deliverytime;
    }

    /**
     * 获取收件人
     * 
     * @return 收件人
     */
    public String getAddressee() {
        return this.addressee;
    }

    /**
     * 设置收件人
     * 
     * @param addressee
     *          收件人
     */
    public void setAddressee(String addressee) {
        this.addressee = addressee;
    }

    /**
     * 获取致
     * 
     * @return 致
     */
    public String getTo() {
        return this.to;
    }

    /**
     * 设置致
     * 
     * @param to
     *          致
     */
    public void setTo(String to) {
        this.to = to;
    }

    /**
     * 获取联系电话
     * 
     * @return 联系电话
     */
    public String getContacttel() {
        return this.contacttel;
    }

    /**
     * 设置联系电话
     * 
     * @param contacttel
     *          联系电话
     */
    public void setContacttel(String contacttel) {
        this.contacttel = contacttel;
    }

    /**
     * 获取加工单位
     * 
     * @return 加工单位
     */
    public String getProcessingunit() {
        return this.processingunit;
    }

    /**
     * 设置加工单位
     * 
     * @param processingunit
     *          加工单位
     */
    public void setProcessingunit(String processingunit) {
        this.processingunit = processingunit;
    }

    /**
     * 获取模具名称
     * 
     * @return 模具名称
     */
    public String getMouldname() {
        return this.mouldname;
    }

    /**
     * 设置模具名称
     * 
     * @param mouldname
     *          模具名称
     */
    public void setMouldname(String mouldname) {
        this.mouldname = mouldname;
    }

    /**
     * 获取纹理费用
     * 
     * @return 纹理费用
     */
    public String getTexturingprice() {
        return this.texturingprice;
    }

    /**
     * 设置纹理费用
     * 
     * @param texturingprice
     *          纹理费用
     */
    public void setTexturingprice(String texturingprice) {
        this.texturingprice = texturingprice;
    }

    /**
     * 获取打光费用
     * 
     * @return 打光费用
     */
    public String getPolishingprice() {
        return this.polishingprice;
    }

    /**
     * 设置打光费用
     * 
     * @param polishingprice
     *          打光费用
     */
    public void setPolishingprice(String polishingprice) {
        this.polishingprice = polishingprice;
    }

    /**
     * 获取额外费用
     * 
     * @return 额外费用
     */
    public String getExtraprice() {
        return this.extraprice;
    }

    /**
     * 设置额外费用
     * 
     * @param extraprice
     *          额外费用
     */
    public void setExtraprice(String extraprice) {
        this.extraprice = extraprice;
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
     * 获取备注
     * 
     * @return 备注
     */
    public String getRemark() {
        return this.remark;
    }

    /**
     * 设置备注
     * 
     * @param remark
     *          备注
     */
    public void setRemark(String remark) {
        this.remark = remark;
    }
}
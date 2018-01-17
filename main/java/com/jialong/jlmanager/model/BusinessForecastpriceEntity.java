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
import com.baomidou.mybatisplus.annotations.TableField;

import javax.persistence.*;
import java.beans.Transient;
import java.util.ArrayList;
import java.util.List;

public class BusinessForecastpriceEntity{

    /**  */
    @Id
    @Column(name = "PK_GUID", unique = true, nullable = false, length = 255)
    private String pkGuid;

    /** 对应项目ID */
    @Column(name = "PROJECT_ID", nullable = true, length = 255)
    private String projectId;

    /** 说明 */
    @Column(name = "INSTRUCTIONS", nullable = true, length = 255)
    private String instructions;

    /** 电话号码 */
    @Column(name = "TEL", nullable = true, length = 255)
    private String tel;

    /** fax */
    @Column(name = "FAX", nullable = true, length = 255)
    private String fax;

    /** 客户单位 */
    @Column(name = "CLIENTCOMPANY", nullable = true, length = 255)
    private String clientcompany;

    /** 订单状态 */
    @Column(name = "STATUS", nullable = true, length = 10)
    private Integer status;

    /** 添加时间 */
    @Column(name = "CREATETIME", nullable = true, length = 19)
    private String createtime;

    /** 审批人 */
    @Column(name = "APPROVER", nullable = true, length = 10)
    private String approver;

    /** 审批时间 */
    @Column(name = "APPROVETIME", nullable = true, length = 19)
    private String approvetime;

    /** 税率 */
    @Column(name = "TAX", nullable = true, length = 10)
    private String tax;

    /** 总价合计 */
    @Column(name = "TOTLEPRICE", nullable = true, length = 255)
    private String totleprice;

    /** 更新时间 */
    @Column(name = "UPDATETIME", nullable = true, length = 19)
    private String updatetime;

    /** 是否删除 */
    @Column(name = "ISDELETE", nullable = true, length = 10)
    private Integer isdelete;

    /** 添加/修改人 */
    @Column(name = "ADDUSER", nullable = true, length = 255)
    private String adduser;

    /** 备注 */
    @Column(name = "REMARK", nullable = true, length = 65535)
    private String remark;

    @CollectionTable(name = "BUSINESS_FORECASTPRICELIST")
    @JSONField(name = "modulesList")
    private List<BusinessForecastpricelistEntity> businessForecastpricelistEntities;

    public List<BusinessForecastpricelistEntity> getBusinessForecastpricelistEntities() {
        return businessForecastpricelistEntities;
    }

    public void setBusinessForecastpricelistEntities(List<BusinessForecastpricelistEntity> businessForecastpricelistEntities) {
        this.businessForecastpricelistEntities = businessForecastpricelistEntities;
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
     * 获取说明
     * 
     * @return 说明
     */
    public String getInstructions() {
        return this.instructions;
    }

    /**
     * 设置说明
     * 
     * @param instructions
     *          说明
     */
    public void setInstructions(String instructions) {
        this.instructions = instructions;
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
     * 获取fax
     * 
     * @return fax
     */
    public String getFax() {
        return this.fax;
    }

    /**
     * 设置fax
     * 
     * @param fax
     *          fax
     */
    public void setFax(String fax) {
        this.fax = fax;
    }

    /**
     * 获取客户单位
     * 
     * @return 客户单位
     */
    public String getClientcompany() {
        return this.clientcompany;
    }

    /**
     * 设置客户单位
     * 
     * @param clientcompany
     *          客户单位
     */
    public void setClientcompany(String clientcompany) {
        this.clientcompany = clientcompany;
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
     * 获取添加时间
     * 
     * @return 添加时间
     */
    public String getCreatetime() {
        return this.createtime;
    }

    /**
     * 设置添加时间
     * 
     * @param createtime
     *          添加时间
     */
    public void setCreatetime(String createtime) {
        this.createtime = createtime;
    }

    /**
     * 获取审批人
     * 
     * @return 审批人
     */
    public String getApprover() {
        return this.approver;
    }

    /**
     * 设置审批人
     * 
     * @param approver
     *          审批人
     */
    public void setApprover(String approver) {
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
     * 获取税率
     * 
     * @return 税率
     */
    public String getTax() {
        return this.tax;
    }

    /**
     * 设置税率
     * 
     * @param tax
     *          税率
     */
    public void setTax(String tax) {
        this.tax = tax;
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
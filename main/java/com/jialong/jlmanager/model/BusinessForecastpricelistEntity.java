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
 * 商务预报价单列表(BUSINESS_FORECASTPRICELIST)
 * 
 * @author lyz
 * @version 1.0.0 2017-12-31
 */
@Entity
@Table(name = "BUSINESS_FORECASTPRICELIST")
public class BusinessForecastpricelistEntity implements java.io.Serializable {
    /** 版本号 */
    private static final long serialVersionUID = 7513060923444078475L;

    /**  */
    @Id
    @Column(name = "PK_GUID", unique = true, nullable = false, length = 255)
    private String pkGuid;

    /** 预报价ID */
    @Column(name = "FORECASTPRICE_ID", nullable = true, length = 255)
    private String forecastpriceId;

    /** 名称 */
    @Column(name = "NAME", nullable = true, length = 255)
    private String name;

    /** 图片路径 */
    @Column(name = "PICURL", nullable = true, length = 255)
    private String picurl;

    /** 面积 */
    @Column(name = "AREA", nullable = true, length = 255)
    private String area;

    /** 添加时间 */
    @Column(name = "ADDTIME", nullable = true, length = 19)
    private String addtime;

    /** 订单状态 */
    @Column(name = "STATUS", nullable = true, length = 10)
    private Integer status;

    /** 数量 */
    @Column(name = "NUMBER", nullable = true, length = 10)
    private Integer number;

    /** 车型 */
    @Column(name = "CARTYPE", nullable = true, length = 255)
    private String cartype;

    /** 单价 */
    @Column(name = "UNITPRICE", nullable = true, length = 10)
    private Integer unitprice;

    /** 纹理代码 */
    @Column(name = "TEXTURINGCODE", nullable = true, length = 255)
    private String texturingcode;

    /** 总价 */
    @Column(name = "TOTLEPRICE", nullable = true, length = 255)
    private String totleprice;

    /** 更新时间 */
    @Column(name = "UPDATETIME", nullable = true, length = 19)
    private String updatetime;

    /** 是否有动模 */
    @Column(name = "DYNAMICMODEL", nullable = true, length = 10)
    private Integer dynamicmodel;

    /** 系数 */
    @Column(name = "COEFFICIENT", nullable = true, length = 10)
    private Integer coefficient;

    /** 是否删除 */
    @Column(name = "ISDELETE", nullable = true, length = 10)
    private Integer isdelete;

    /** 添加/修改人 */
    @Column(name = "ADDUSER", nullable = true, length = 255)
    private String adduser;

    /** 备注 */
    @Column(name = "REMARK", nullable = true, length = 65535)
    private String remark;

    /**  */
    @Column(name = "CREATETIME", nullable = true, length = 19)
    private String createtime;

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
     * 获取预报价ID
     * 
     * @return 预报价ID
     */
    public String getForecastpriceId() {
        return this.forecastpriceId;
    }

    /**
     * 设置预报价ID
     * 
     * @param forecastpriceId
     *          预报价ID
     */
    public void setForecastpriceId(String forecastpriceId) {
        this.forecastpriceId = forecastpriceId;
    }

    /**
     * 获取名称
     * 
     * @return 名称
     */
    public String getName() {
        return this.name;
    }

    /**
     * 设置名称
     * 
     * @param name
     *          名称
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * 获取图片路径
     * 
     * @return 图片路径
     */
    public String getPicurl() {
        return this.picurl;
    }

    /**
     * 设置图片路径
     * 
     * @param picurl
     *          图片路径
     */
    public void setPicurl(String picurl) {
        this.picurl = picurl;
    }

    /**
     * 获取面积
     * 
     * @return 面积
     */
    public String getArea() {
        return this.area;
    }

    /**
     * 设置面积
     * 
     * @param area
     *          面积
     */
    public void setArea(String area) {
        this.area = area;
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
     * 获取数量
     * 
     * @return 数量
     */
    public Integer getNumber() {
        return this.number;
    }

    /**
     * 设置数量
     * 
     * @param number
     *          数量
     */
    public void setNumber(Integer number) {
        this.number = number;
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
     * 获取单价
     * 
     * @return 单价
     */
    public Integer getUnitprice() {
        return this.unitprice;
    }

    /**
     * 设置单价
     * 
     * @param unitprice
     *          单价
     */
    public void setUnitprice(Integer unitprice) {
        this.unitprice = unitprice;
    }

    /**
     * 获取纹理代码
     * 
     * @return 纹理代码
     */
    public String getTexturingcode() {
        return this.texturingcode;
    }

    /**
     * 设置纹理代码
     * 
     * @param texturingcode
     *          纹理代码
     */
    public void setTexturingcode(String texturingcode) {
        this.texturingcode = texturingcode;
    }

    /**
     * 获取总价
     * 
     * @return 总价
     */
    public String getTotleprice() {
        return this.totleprice;
    }

    /**
     * 设置总价
     * 
     * @param totleprice
     *          总价
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
     * 获取是否有动模
     * 
     * @return 是否有动模
     */
    public Integer getDynamicmodel() {
        return this.dynamicmodel;
    }

    /**
     * 设置是否有动模
     * 
     * @param dynamicmodel
     *          是否有动模
     */
    public void setDynamicmodel(Integer dynamicmodel) {
        this.dynamicmodel = dynamicmodel;
    }

    /**
     * 获取系数
     * 
     * @return 系数
     */
    public Integer getCoefficient() {
        return this.coefficient;
    }

    /**
     * 设置系数
     * 
     * @param coefficient
     *          系数
     */
    public void setCoefficient(Integer coefficient) {
        this.coefficient = coefficient;
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
}
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
 * 部门表(USER_DEPARTMENT)
 * 
 * @author lyz
 * @version 1.0.0 2017-12-31
 */
@Entity
@Table(name = "USER_DEPARTMENT")
public class UserDepartmentEntity implements java.io.Serializable {
    /** 版本号 */
    private static final long serialVersionUID = -3802906083532281672L;

    /**  */
    @Id
    @Column(name = "PK_GUID", unique = true, nullable = false, length = 255)
    private String pkGuid;

    /** 父部门ID */
    @Column(name = "PARENT_ID", nullable = true, length = 255)
    private String parentId;

    /** 部门名称 */
    @Column(name = "DEPARTMENTNAME", nullable = true, length = 255)
    private String departmentname;

    /** 部门电话 */
    @Column(name = "PHONE", nullable = true, length = 255)
    private String phone;

    /** 领导名称 */
    @Column(name = "LEADER_ID", nullable = true, length = 10)
    private Integer leaderId;

    /** 添加/修改人 */
    @Column(name = "ADDUSER", nullable = true, length = 255)
    private String adduser;

    /** 是否删除 */
    @Column(name = "ISDELETE", nullable = true, length = 10)
    private Integer isdelete;

    /** 更新时间 */
    @Column(name = "UPDATETIME", nullable = true, length = 19)
    private String updatetime;

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
     * 获取父部门ID
     * 
     * @return 父部门ID
     */
    public String getParentId() {
        return this.parentId;
    }

    /**
     * 设置父部门ID
     * 
     * @param parentId
     *          父部门ID
     */
    public void setParentId(String parentId) {
        this.parentId = parentId;
    }

    /**
     * 获取部门名称
     * 
     * @return 部门名称
     */
    public String getDepartmentname() {
        return this.departmentname;
    }

    /**
     * 设置部门名称
     * 
     * @param departmentname
     *          部门名称
     */
    public void setDepartmentname(String departmentname) {
        this.departmentname = departmentname;
    }

    /**
     * 获取部门电话
     * 
     * @return 部门电话
     */
    public String getPhone() {
        return this.phone;
    }

    /**
     * 设置部门电话
     * 
     * @param phone
     *          部门电话
     */
    public void setPhone(String phone) {
        this.phone = phone;
    }

    /**
     * 获取领导名称
     * 
     * @return 领导名称
     */
    public Integer getLeaderId() {
        return this.leaderId;
    }

    /**
     * 设置领导名称
     * 
     * @param leaderId
     *          领导名称
     */
    public void setLeaderId(Integer leaderId) {
        this.leaderId = leaderId;
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
}
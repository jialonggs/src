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
 * USER_LOGIN
 * 
 * @author lyz
 * @version 1.0.0 2017-12-31
 */
@Entity
@Table(name = "USER_LOGIN")
public class UserLoginEntity implements java.io.Serializable {
    /** 版本号 */
    private static final long serialVersionUID = -6566007271253295021L;

    /**  */
    @Id
    @Column(name = "PK_GUID", unique = true, nullable = false, length = 255)
    private String pkGuid;

    /** 用户名 */
    @Column(name = "USERNAME", nullable = false, length = 255)
    private String username;

    /** 密码 */
    @Column(name = "PASSWORD", nullable = false, length = 255)
    private String password;

    /** 角色 */
    @Column(name = "ROLE", nullable = true, length = 10)
    private Integer role;

    /** 性别 */
    @Column(name = "SEX", nullable = true, length = 10)
    private Integer sex;

    /** 部门编号 */
    @Column(name = "DEPARTMENT_ID", nullable = true, length = 255)
    private String departmentId;

    /** 电话号码 */
    @Column(name = "MOBILE", nullable = true, length = 255)
    private String mobile;

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
     * 获取用户名
     * 
     * @return 用户名
     */
    public String getUsername() {
        return this.username;
    }

    /**
     * 设置用户名
     * 
     * @param username
     *          用户名
     */
    public void setUsername(String username) {
        this.username = username;
    }

    /**
     * 获取密码
     * 
     * @return 密码
     */
    public String getPassword() {
        return this.password;
    }

    /**
     * 设置密码
     * 
     * @param password
     *          密码
     */
    public void setPassword(String password) {
        this.password = password;
    }

    /**
     * 获取角色
     * 
     * @return 角色
     */
    public Integer getRole() {
        return this.role;
    }

    /**
     * 设置角色
     * 
     * @param role
     *          角色
     */
    public void setRole(Integer role) {
        this.role = role;
    }

    /**
     * 获取性别
     * 
     * @return 性别
     */
    public Integer getSex() {
        return this.sex;
    }

    /**
     * 设置性别
     * 
     * @param sex
     *          性别
     */
    public void setSex(Integer sex) {
        this.sex = sex;
    }

    /**
     * 获取部门编号
     * 
     * @return 部门编号
     */
    public String getDepartmentId() {
        return this.departmentId;
    }

    /**
     * 设置部门编号
     * 
     * @param departmentId
     *          部门编号
     */
    public void setDepartmentId(String departmentId) {
        this.departmentId = departmentId;
    }

    /**
     * 获取电话号码
     * 
     * @return 电话号码
     */
    public String getMobile() {
        return this.mobile;
    }

    /**
     * 设置电话号码
     * 
     * @param mobile
     *          电话号码
     */
    public void setMobile(String mobile) {
        this.mobile = mobile;
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
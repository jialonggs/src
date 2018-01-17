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
 * 项目表(Project)
 * 
 * @author lyz
 * @version 1.0.0 2017-12-31
 */
@Entity
@Table(name = "Project")
public class ProjectEntity implements java.io.Serializable {
    /** 版本号 */
    private static final long serialVersionUID = 2040175464277095311L;

    /**  */
    @Id
    @Column(name = "PK_GUID", unique = true, nullable = false, length = 255)
    private String pkGuid;

    /** 项目名 */
    @Column(name = "PROJECTNAME", nullable = false, length = 255)
    private String projectname;

    /** 项目添加时间 */
    @Column(name = "ADDTIME", nullable = true, length = 255)
    private String addtime;

    /** 项目状态 */
    @Column(name = "STATUS", nullable = true, length = 10)
    private Integer status;

    /** 客户单位 */
    @Column(name = "CLIENTCOMPANY", nullable = true, length = 255)
    private String clientcompany;

    /** 结束时间 */
    @Column(name = "FINISHTIME", nullable = true, length = 10)
    private Integer finishtime;

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
    @Column(name = "REMARK", nullable = true, length = 19)
    private String remark;


    public String getRemark() {
        return remark;
    }

    public void setRemark(String remark) {
        this.remark = remark;
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
     * 获取项目名
     * 
     * @return 项目名
     */
    public String getProjectname() {
        return this.projectname;
    }

    /**
     * 设置项目名
     * 
     * @param projectname
     *          项目名
     */
    public void setProjectname(String projectname) {
        this.projectname = projectname;
    }

    /**
     * 获取项目添加时间
     * 
     * @return 项目添加时间
     */
    public String getAddtime() {
        return this.addtime;
    }

    /**
     * 设置项目添加时间
     * 
     * @param addtime
     *          项目添加时间
     */
    public void setAddtime(String addtime) {
        this.addtime = addtime;
    }

    /**
     * 获取项目状态
     * 
     * @return 项目状态
     */
    public Integer getStatus() {
        return this.status;
    }

    /**
     * 设置项目状态
     * 
     * @param status
     *          项目状态
     */
    public void setStatus(Integer status) {
        this.status = status;
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
     * 获取结束时间
     * 
     * @return 结束时间
     */
    public Integer getFinishtime() {
        return this.finishtime;
    }

    /**
     * 设置结束时间
     * 
     * @param finishtime
     *          结束时间
     */
    public void setFinishtime(Integer finishtime) {
        this.finishtime = finishtime;
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
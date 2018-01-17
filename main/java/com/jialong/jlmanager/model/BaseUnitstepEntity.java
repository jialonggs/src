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
 * 步骤表(BASE_UNITSTEP)
 * 
 * @author lyz
 * @version 1.0.0 2017-12-31
 */
@Entity
@Table(name = "BASE_UNITSTEP")
public class BaseUnitstepEntity implements java.io.Serializable {
    /** 版本号 */
    private static final long serialVersionUID = 891465189644374873L;

    /**  */
    @Id
    @Column(name = "PK_GUID", unique = true, nullable = false, length = 255)
    private String pkGuid;

    /** 对应项目ID */
    @Column(name = "STEPNAME", nullable = true, length = 255)
    private String stepname;

    /** 是否需要填写文档 */
    @Column(name = "ISDOC", nullable = true, length = 10)
    private Integer isdoc;

    /** 是否需要商务编辑 */
    @Column(name = "ISBUSINESSREMARK", nullable = true, length = 10)
    private Integer isbusinessremark;

    /** 更新时间 */
    @Column(name = "UPDATETIME", nullable = true, length = 19)
    private String updatetime;

    /** 是否删除 */
    @Column(name = "ISDELETE", nullable = true, length = 10)
    private Integer isdelete;

    /** 添加/修改人 */
    @Column(name = "ADDUSER", nullable = true, length = 255)
    private String adduser;

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
     * 获取对应项目ID
     * 
     * @return 对应项目ID
     */
    public String getStepname() {
        return this.stepname;
    }

    /**
     * 设置对应项目ID
     * 
     * @param stepname
     *          对应项目ID
     */
    public void setStepname(String stepname) {
        this.stepname = stepname;
    }

    /**
     * 获取是否需要填写文档
     * 
     * @return 是否需要填写文档
     */
    public Integer getIsdoc() {
        return this.isdoc;
    }

    /**
     * 设置是否需要填写文档
     * 
     * @param isdoc
     *          是否需要填写文档
     */
    public void setIsdoc(Integer isdoc) {
        this.isdoc = isdoc;
    }

    /**
     * 获取是否需要商务编辑
     * 
     * @return 是否需要商务编辑
     */
    public Integer getIsbusinessremark() {
        return this.isbusinessremark;
    }

    /**
     * 设置是否需要商务编辑
     * 
     * @param isbusinessremark
     *          是否需要商务编辑
     */
    public void setIsbusinessremark(Integer isbusinessremark) {
        this.isbusinessremark = isbusinessremark;
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
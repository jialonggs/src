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
 * 车间主管内置流程分配表(PROCESSING_WORKFLOW)
 * 
 * @author lyz
 * @version 1.0.0 2017-12-31
 */
@Entity
@Table(name = "PROCESSING_WORKFLOW")
public class ProcessingWorkflowEntity implements java.io.Serializable {
    /** 版本号 */
    private static final long serialVersionUID = 4756796313355290206L;

    /**  */
    @Id
    @Column(name = "PK_GUID", unique = true, nullable = false, length = 255)
    private String pkGuid;

    /** 流程名称 */
    @Column(name = "ORDERID", nullable = true, length = 255)
    private String orderid;

    /** 流程编号 */
    @Column(name = "STATUS", nullable = true, length = 10)
    private Integer status;

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
    @Column(name = "STARTTIME", nullable = true, length = 19)
    private String starttime;

    /**  */
    @Column(name = "FINISHTIME", nullable = true, length = 19)
    private String finishtime;

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
     * 获取流程名称
     * 
     * @return 流程名称
     */
    public String getOrderid() {
        return this.orderid;
    }

    /**
     * 设置流程名称
     * 
     * @param orderid
     *          流程名称
     */
    public void setOrderid(String orderid) {
        this.orderid = orderid;
    }

    /**
     * 获取流程编号
     * 
     * @return 流程编号
     */
    public Integer getStatus() {
        return this.status;
    }

    /**
     * 设置流程编号
     * 
     * @param status
     *          流程编号
     */
    public void setStatus(Integer status) {
        this.status = status;
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
    public String getStarttime() {
        return this.starttime;
    }

    /**
     * 设置
     * 
     * @param starttime
     */
    public void setStarttime(String starttime) {
        this.starttime = starttime;
    }

    /**
     * 获取
     * 
     * @return 
     */
    public String getFinishtime() {
        return this.finishtime;
    }

    /**
     * 设置
     * 
     * @param finishtime
     */
    public void setFinishtime(String finishtime) {
        this.finishtime = finishtime;
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
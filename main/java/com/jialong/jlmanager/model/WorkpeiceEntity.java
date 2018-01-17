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
 * 分配工作步骤表(WorkPeice)
 * 
 * @author lyz
 * @version 1.0.0 2017-12-31
 */
@Entity
@Table(name = "WorkPeice")
public class WorkpeiceEntity implements java.io.Serializable {
    /** 版本号 */
    private static final long serialVersionUID = -4442643273915054862L;

    /**  */
    @Id
    @Column(name = "PK_GUID", unique = true, nullable = false, length = 255)
    private String pkGuid;

    /** 基本表步骤ID */
    @Column(name = "COLLECTMOULD_ID", nullable = true, length = 255)
    private String collectmouldId;

    /** 加工表流程ID */
    @Column(name = "NUM", nullable = true, length = 255)
    private String num;

    /** 状态编号 */
    @Column(name = "ORDER_ID", nullable = true, length = 10)
    private Integer orderId;

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

    /** 拆分人ID */
    @Column(name = "SPLIT_ID", nullable = true, length = 255)
    private String splitId;

    /** 拆分时间 */
    @Column(name = "SPLITTIME", nullable = true, length = 19)
    private String splittime;

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
     * 获取基本表步骤ID
     * 
     * @return 基本表步骤ID
     */
    public String getCollectmouldId() {
        return this.collectmouldId;
    }

    /**
     * 设置基本表步骤ID
     * 
     * @param collectmouldId
     *          基本表步骤ID
     */
    public void setCollectmouldId(String collectmouldId) {
        this.collectmouldId = collectmouldId;
    }

    /**
     * 获取加工表流程ID
     * 
     * @return 加工表流程ID
     */
    public String getNum() {
        return this.num;
    }

    /**
     * 设置加工表流程ID
     * 
     * @param num
     *          加工表流程ID
     */
    public void setNum(String num) {
        this.num = num;
    }

    /**
     * 获取状态编号
     * 
     * @return 状态编号
     */
    public Integer getOrderId() {
        return this.orderId;
    }

    /**
     * 设置状态编号
     * 
     * @param orderId
     *          状态编号
     */
    public void setOrderId(Integer orderId) {
        this.orderId = orderId;
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
     * 获取拆分人ID
     * 
     * @return 拆分人ID
     */
    public String getSplitId() {
        return this.splitId;
    }

    /**
     * 设置拆分人ID
     * 
     * @param splitId
     *          拆分人ID
     */
    public void setSplitId(String splitId) {
        this.splitId = splitId;
    }

    /**
     * 获取拆分时间
     * 
     * @return 拆分时间
     */
    public String getSplittime() {
        return this.splittime;
    }

    /**
     * 设置拆分时间
     * 
     * @param splittime
     *          拆分时间
     */
    public void setSplittime(String splittime) {
        this.splittime = splittime;
    }
}
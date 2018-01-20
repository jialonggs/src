package com.jialong.jlmanager.model.responseModel;

public class CollectmouldListResp {

    // 批次
    private String batch;

    // 客户单位
    private String clientCompanyName;

    // 唯一ID
    private String pkGuid;

    // 模具数量
    private Integer mouldNums;

    // 添加人
    private String addUser;

    // 创建时间
    private String createTime;

    public CollectmouldListResp () {

    }

    public CollectmouldListResp(String batch, String clientCompanyName, String pkGuid, Integer mouldNums, String addUser, String createTime) {
        this.batch = batch;
        this.clientCompanyName = clientCompanyName;
        this.pkGuid = pkGuid;
        this.mouldNums = mouldNums;
        this.addUser = addUser;
        this.createTime = createTime;
    }

    public String getBatch() {
        return batch;
    }

    public void setBatch(String batch) {
        this.batch = batch;
    }

    public String getClientCompanyName() {
        return clientCompanyName;
    }

    public void setClientCompanyName(String clientCompanyName) {
        this.clientCompanyName = clientCompanyName;
    }

    public String getPkGuid() {
        return pkGuid;
    }

    public void setPkGuid(String pkGuid) {
        this.pkGuid = pkGuid;
    }

    public Integer getMouldNums() {
        return mouldNums;
    }

    public void setMouldNums(Integer mouldNums) {
        this.mouldNums = mouldNums;
    }

    public String getAddUser() {
        return addUser;
    }

    public void setAddUser(String addUser) {
        this.addUser = addUser;
    }

    public String getCreateTime() {
        return createTime;
    }

    public void setCreateTime(String createTime) {
        this.createTime = createTime;
    }
}

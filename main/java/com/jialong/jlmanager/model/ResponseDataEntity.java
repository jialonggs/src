package com.jialong.jlmanager.model;

public class ResponseDataEntity {
    public Object data;
    public Integer code;
    public String msg;
    public Integer msgCode;

    public ResponseDataEntity(){

    }

    public ResponseDataEntity(Object data, Integer code, String msg, Integer msgCode) {
        this.data = data;
        this.code = code;
        this.msg = msg;
        this.msgCode = msgCode;
    }

    public Object getData() {
        return data;
    }

    public Integer getCode() {
        return code;
    }

    public String getMsg() {
        return msg;
    }

    public Integer getMsgCode() {
        return msgCode;
    }

    public void setData(Object data) {
        this.data = data;
    }

    public void setCode(Integer code) {
        this.code = code;
    }

    public void setMsg(String msg) {
        this.msg = msg;
    }

    public void setMsgCode(Integer msgCode) {
        this.msgCode = msgCode;
    }
}
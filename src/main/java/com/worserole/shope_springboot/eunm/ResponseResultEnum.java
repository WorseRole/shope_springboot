package com.worserole.shope_springboot.eunm;

/**
 * Created by liyanyan on 2020/9/6 11:50 下午
 */
public enum ResponseResultEnum {

    SUCCESS(200, "success"),
    FAILED(400, "操作失败"),
    SYSTEM_ERROR(500, "系统异常");

    public int code;
    private String message;

    ResponseResultEnum(int code, String message) {
        this.code = code;
        this.message = message;
    }
    public int getCode() {
        return code;
    }

    public void setCode(int code) {
        this.code = code;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }
}

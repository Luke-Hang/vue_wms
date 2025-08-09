package com.wms.common;

import lombok.Data;
public enum ResultEnum {
    SUCCESS(200, "成功"),
    FAIL(500, "失败"),
    USER_NOT_EXIST(501, "用户不存在"),
    USER_HAS_EXIST(502, "用户已存在"),
    USER_NO_EXIST(503, "用户不存在"),
    USER_PASSWORD_ERROR(504, "用户密码错误"),
    USER_NO_LOGIN(505, "用户未登录"),
    USER_NO_PERMISSION(506, "用户无权限"),
    USER_NO_ROLE(507, "用户无角色");

    private Integer code;
    private String message;

    ResultEnum(Integer code, String message) {
        this.code = code;
        this.message = message;
    }



    public Integer getCode() {
        return code;
    }

    public String getMsg() {
        return message;
    }
}

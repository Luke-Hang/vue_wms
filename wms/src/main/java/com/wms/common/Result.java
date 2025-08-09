package com.wms.common;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class Result<T> {

    private Integer code;
    private String msg;
    private T data;

    public static <T> Result<T> success(T data){
        return new Result<>(ResultCode.SUCCESS.getCode(), ResultCode.SUCCESS.getMsg(),data);
    }

    public static <T> Result<T> success(String msg, T data){
        return new Result<>(ResultCode.SUCCESS.getCode(), msg,data);
    }

    public static <T> Result<T> success(String msg){
        return new Result<>(ResultCode.SUCCESS.getCode(), msg,null);
    }

    public static <T> Result<T> fail(){
        return new Result<>(ResultCode.FAIL.getCode(), Result.fail().getMsg(), null);
    }

    public static <T> Result<T> fail(String msg){
        return new Result<>(ResultCode.FAIL.getCode(), msg, null);
    }

    public static <T> Result<T> fail(String msg, T data){
        return new Result<>(ResultCode.FAIL.getCode(), msg, data);
    }

}

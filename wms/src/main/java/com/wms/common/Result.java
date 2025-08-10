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
    private Long total;//总记录数

    public static <T> Result<T> success(T data, Long total){
        return new Result<>(ResultCode.SUCCESS.getCode(), ResultCode.SUCCESS.getMsg(),data,total);
    }

    public static <T> Result<T> success(T data){
        return new Result<>(ResultCode.SUCCESS.getCode(), ResultCode.SUCCESS.getMsg(),data,null);
    }

    public static <T> Result<T> success(String msg){
        return new Result<>(ResultCode.SUCCESS.getCode(), msg,null,null);
    }

    public static <T> Result<T> success(){
        return new Result<>(ResultCode.SUCCESS.getCode(), Result.success().getMsg(),null,null);
    }

    public static <T> Result<T> fail(){
        return new Result<>(ResultCode.FAIL.getCode(), Result.fail().getMsg(), null,null);
    }

    public static <T> Result<T> fail(String msg){
        return new Result<>(ResultCode.FAIL.getCode(), msg, null,null);
    }

    public static <T> Result<T> fail(String msg, T data, Long total){
        return new Result<>(ResultCode.FAIL.getCode(), msg, data,null);
    }

}

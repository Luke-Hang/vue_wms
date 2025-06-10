package com.wms.common;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * @author xiehang
 * @date 2025/6/8 16:23
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Result {

    /**
     * 返回状态码
     */
    private int code;
    /**
     * 返回信息
     */
    private String msg;
    /**
     * 返回数据总数
     */
    private Long total;
    /**
     * 返回数据
     */
    private Object data;

    //success
    public static Result success() {
        return new Result(200, "成功", 0L, null);
    }

    public static Result success(Object data) {
        return new Result(200, "成功", 0L, data);
    }

    public static Result success(Long total, Object data) {
        return new Result(200, "成功", total, data);
    }

    //fail
    public static Result fail(String msg) {
        return new Result(400, msg, 0L, null);
    }

    public static Result fail(String msg, Object data) {
        return new Result(400, "失败", 0L, data);
    }

}

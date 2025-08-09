//package com.wms.common;
//
//import lombok.AllArgsConstructor;
//import lombok.Data;
//import lombok.NoArgsConstructor;
//
//@Data
//@AllArgsConstructor
//@NoArgsConstructor
//public class Result2 {
//    /**
//     * 返回状态码
//     */
//    private int code;
//    /**
//     * 返回信息
//     */
//    private String msg;
//    /**
//     * 返回数据总数
//     */
//    private Long total;
//    /**
//     * 返回数据
//     */
//    private Object data;
//
//    //success
//    public static Result2 success() {
//        return new Result2(200, "成功", 0L, null);
//    }
//
//    public static Result2 success(Object data) {
//        return new Result2(200, "成功", 0L, data);
//    }
//
//    public static Result2 success(Long total, Object data) {
//        return new Result2(200, "成功", total, data);
//    }
//
//    //fail
//    public static Result2 fail() {
//        return new Result2(400, "失败", 0L, null);
//    }
//
//    public static Result2 fail(Object data) {
//        return new Result2(400, "失败", 0L, data);
//    }
//
//}

package com.wms.entity;

import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

@Data
public class UserQueryVo {
    /**
     * 账号
     */
    @ApiModelProperty(value = "账号")
    private String no;
    /**
     * 密码
     */
    @ApiModelProperty(value = "密码")
    private String password;
}

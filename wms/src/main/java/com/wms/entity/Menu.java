package com.wms.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;

/**
 * 菜单表(Menu)实体类
 *
 * @author makejava
 * @since 2025-08-09 23:39:35
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Menu implements Serializable {
    private static final long serialVersionUID = 482470852808846655L;

    private Integer id;
    /**
     * 菜单编码
     */
    private String menucode;
    /**
     * 菜单名字
     */
    private String menuname;
    /**
     * 菜单级别
     */
    private String menulevel;
    /**
     * 菜单的父code
     */
    private String menuparentcode;
    /**
     * 点击触发的函数
     */
    private String menuclick;
    /**
     * 权限 0超级管理员，1表示管理员，2表示普通用户，可以用逗号组合使用
     */
    private String menuright;
    /**
     * 菜单组件
     */
    private String menucomponent;
    /**
     * 菜单图标
     */
    private String menuicon;

}


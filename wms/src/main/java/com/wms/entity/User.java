package com.wms.entity;

import java.io.Serializable;

/**
 * (User)实体类
 *
 * @author makejava
 * @since 2025-06-08 15:45:28
 */
public class User implements Serializable {
    private static final long serialVersionUID = 392562650637641641L;
/**
     * 主键
     */
    private Integer id;
/**
     * 账号
     */
    private String no;
/**
     * 名字
     */
    private String name;
/**
     * 密码
     */
    private String password;
/**
     * 年龄
     */
    private Integer age;
/**
     * 性别
     */
    private Integer sex;
/**
     * 电话
     */
    private String phone;
/**
     * 角色,0超级管理员， 1管理员， 2普通账号
     */
    private Integer roleId;
/**
     * 是否有效，Y有效，其他无效
     */
    private String isvalid;


    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getNo() {
        return no;
    }

    public void setNo(String no) {
        this.no = no;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    public Integer getSex() {
        return sex;
    }

    public void setSex(Integer sex) {
        this.sex = sex;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public Integer getRoleId() {
        return roleId;
    }

    public void setRoleId(Integer roleId) {
        this.roleId = roleId;
    }

    public String getIsvalid() {
        return isvalid;
    }

    public void setIsvalid(String isvalid) {
        this.isvalid = isvalid;
    }

}


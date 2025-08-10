package com.wms.service;

import com.github.pagehelper.PageInfo;
import com.wms.common.Result;
import com.wms.entity.QueryPageParam;
import com.wms.entity.User;
import com.wms.entity.UserQueryVo;

import java.util.List;

/**
 * (User)表服务接口
 *
 * @author makejava
 * @since 2025-06-08 15:45:28
 */
public interface UserService {

    /**
     * 通过ID查询单条数据
     *
     * @param id 主键
     * @return 实例对象
     */
    User queryById(Integer id);

    /**
     * 分页查询
     *
     * @return 查询结果
     */
    PageInfo<User> queryByPage(QueryPageParam query);

    /**
     * 新增数据
     *
     * @param user 实例对象
     * @return 实例对象
     */
    User insert(User user);

    /**
     * 修改数据
     *
     * @param user 实例对象
     * @return 实例对象
     */
    Result update(User user);

    /**
     * 通过主键删除数据
     *
     * @param id 主键
     * @return 是否成功
     */
    Result deleteById(Integer id);

    List<User> getUserList();

    Result findUserByNo(String userNo);

    Result save(User user);

    Result login(UserQueryVo userQueryVo);

    long getUserCount(User user);
}

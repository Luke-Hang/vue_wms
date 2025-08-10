package com.wms.service.impl;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.wms.common.Result;
import com.wms.dao.UserMapper;
import com.wms.entity.Menu;
import com.wms.entity.QueryPageParam;
import com.wms.entity.User;
import com.wms.entity.UserQueryVo;
import com.wms.service.MenuService;
import com.wms.service.UserService;
import org.apache.commons.collections4.CollectionUtils;
import org.apache.commons.lang3.StringUtils;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Collections;
import java.util.HashMap;
import java.util.List;

/**
 * (User)表服务实现类
 *
 * @author makejava
 * @since 2025-06-08 15:45:28
 */
@Service
public class UserServiceImpl implements UserService {

    Logger logger = LoggerFactory.getLogger(UserServiceImpl.class);

    @Autowired
    private UserMapper userMapper;

    @Autowired
    private MenuService menuService;

    /**
     * 通过ID查询单条数据
     *
     * @param id 主键
     * @return 实例对象
     */
    @Override
    public User queryById(Integer id) {
        return this.userMapper.queryById(id);
    }

    /**
     * 分页查询
     * @param query
     * @return
     */
    @Override
    public PageInfo<User> queryByPage(QueryPageParam query) {
        logger.info("分页查询开始!");
        List<User> list = null;
        try {
            HashMap param = query.getParam();
            String name = (String) param.get("name");
            String sex = (String) param.get("sex");
            String roleId = (String) param.get("roleId");

            User user = new User();
            if (StringUtils.isNotBlank(name)) {
                user.setName(name);
            }

            if (StringUtils.isNotBlank(sex)) {
                user.setSex(Integer.parseInt(sex));
            }

            if (StringUtils.isNotBlank(roleId)) {
                user.setRoleId(Integer.parseInt(roleId));
            }

            // 标准用法
            //    PageHelper.startPage(pageNum, pageSize);
            //    List<T> data = mapper.selectXxx();
            //    PageInfo<T> pageInfo = new PageInfo<>(data);

            // 大数据量优化
            //PageHelper.startPage(pageNum, pageSize, false); // 不查总数

            ////MyBatis 分页插件 PageHelper 的核心方法调用，其作用是通过拦截 MyBatis 的 SQL 执行流程，自动实现物理分页功能
            PageHelper.startPage(query.getPageNum(), query.getPageSize());
            list = userMapper.queryAllByLimit(user);
        } catch (NumberFormatException e) {
            logger.error("分页查询异常!", e);
            return new PageInfo<>(Collections.emptyList());
        }
        logger.info("分页查询结束!");
        return new PageInfo<>(list);
    }

    /**
     * 新增数据
     *
     * @param user 实例对象
     * @return 实例对象
     */
    @Override
    public User insert(User user) {
        this.userMapper.insert(user);
        return user;
    }

    /**
     * 修改数据
     *
     * @param user 实例对象
     * @return 实例对象
     */
    @Override
    public Result update(User user) {
        userMapper.update(user);
        return Result.success("修改成功");
    }

    /**
     * 通过主键删除数据
     *
     * @param id 主键
     * @return 是否成功
     */
    @Override
    public Result deleteById(Integer id) {
        try {
            if (userMapper.deleteById(id)>0) {
                return Result.success("删除成功");
            }
        } catch (Exception e) {
            return Result.fail("删除失败");
        }
        return Result.success("删除成功");
    }

    @Override
    public List<User> getUserList() {
        logger.info("查询用户列表开始!");
        List<User> userList = null;
        try {
            userList = userMapper.getUserList();
        } catch (Exception e) {
            logger.error("查询用户列表异常!", e);
            return Collections.emptyList();
        }
        logger.info("查询用户列表结束!");
        return userList;
    }

    @Override
    public Result findUserByNo(String userNo) {
        logger.info("根据账号查询用户开始!");
        User user;
        try {
            user = userMapper.findUserByNo(userNo);
            if (user != null){
                return Result.success();
            }
        } catch (Exception e) {
            logger.error("根据账号查询用户异常!", e);
            return Result.fail("根据账号查询用户异常!");
        }
        logger.info("根据账号查询用户结束!");
        return Result.fail("用户不存在");
    }

    @Override
    public Result save(User user) {
        logger.info("新增用户开始!");
        try {
            userMapper.insert(user);
        } catch (Exception e) {
            logger.error("新增用户异常!", e);
            return Result.fail("新增用户异常!");
        }
        logger.info("新增用户结束!");
        return Result.success("新增用户成功!");
    }

    @Override
    public Result login(UserQueryVo userQueryVo) {
        List<User> userList = userMapper.queryUser(userQueryVo);

        if (CollectionUtils.isNotEmpty(userList) && userList.size() > 0) {
            User user1 = userList.get(0);
            //获取用户权限
            List<Menu> menuList = menuService.queryMenuList(user1.getRoleId());
            HashMap res = new HashMap();
            res.put("user", user1);
            res.put("menu", menuList);
            return Result.success(res);
        }
        return Result.fail("用户不存在");
    }

    @Override
    public long getUserCount(User user) {
        long count = userMapper.count(user);
        return count;
    }
}

package com.wms.controller;

import com.wms.common.Result;
import com.wms.entity.User;
import com.wms.entity.UserQueryVo;
import com.wms.service.UserService;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@Api(tags = "用户管理")
@RestController
@RequestMapping("/user")
public class UserController {
    /**
     * 服务对象
     */
    @Autowired
    private UserService userService;

    @ApiOperation(value = "查询用户列表")
    @GetMapping("/list")
    public List<User> getUserList() {
        return userService.getUserList();
    }

    @ApiOperation(value = "根据账号查询用户")
    @GetMapping("/findByNo/{userNo}")
    public Result findUserByNo(@PathVariable String userNo) {
        return userService.findUserByNo(userNo);
    }

    @ApiOperation(value = "新增用户")
    @PostMapping("/save")
    public Result save(@RequestBody User user) {
        return userService.save(user);
    }

    @ApiOperation(value = "更新用户")
    @PostMapping("/update")
    public Result update(@RequestBody User user) {
        return userService.update(user);
    }


    @ApiOperation(value = "用户登录")
    @PostMapping("/login")
    public Result login(@RequestBody UserQueryVo userQueryVo) {
        return userService.login(userQueryVo);
    }


    /**
     * 分页查询
     *
     * @param user        筛选条件
     * @param pageRequest 分页对象
     * @return 查询结果
     */
/*    @GetMapping("/list")
    public ResponseEntity<Page<User>> queryByPage(User user, PageRequest pageRequest) {
        return ResponseEntity.ok(userService.queryByPage(user, pageRequest));
    }*/

    /**
     * 通过主键查询单条数据
     *
     * @param id 主键
     * @return 单条数据
     */
    @GetMapping("{id}")
    public ResponseEntity<User> queryById(@PathVariable("id") Integer id) {
        return ResponseEntity.ok(this.userService.queryById(id));
    }

    /**
     * 新增数据
     *
     * @param user 实体
     * @return 新增结果
     */
    @PostMapping()
    public ResponseEntity<User> add(User user) {
        return ResponseEntity.ok(this.userService.insert(user));
    }

    /**
     * 编辑数据
     *
     * @param user 实体
     * @return 编辑结果
     */
/*    @PutMapping
    public ResponseEntity<User> edit(User user) {
        return ResponseEntity.ok(this.userService.update(user));
    }*/

    /**
     * 删除数据
     *
     * @param id 主键
     * @return 删除是否成功
     */
    @DeleteMapping
    public ResponseEntity<Boolean> deleteById(Integer id) {
        return ResponseEntity.ok(this.userService.deleteById(id));
    }

}


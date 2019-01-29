package cn.huangxulin.cloud.controller;

import cn.huangxulin.cloud.common.UserFeignClient;
import cn.huangxulin.cloud.bean.ApiResponse;
import cn.huangxulin.cloud.entity.User;
import cn.huangxulin.cloud.service.impl.UserServiceImpl;
import cn.huangxulin.cloud.utils.UUIDUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

/**
 * 功能描述:
 *
 * @author hxulin
 */
@RestController
public class UserController implements UserFeignClient {

    @Autowired
    private UserServiceImpl userService;

    /**
     * 新增用户
     */
    @PostMapping(value = "/users")
    public ApiResponse insert(@RequestBody User user) {
        user.setId(UUIDUtils.create32UUID());

        System.out.println(user);

        userService.save(user);
        return ApiResponse.success("新增成功！");
    }

    /**
     * 删除一个用户
     */
    @DeleteMapping("/users/{id}")
    public ApiResponse deleteById(@PathVariable("id") String id) {
        userService.removeById(id);
        return ApiResponse.success("删除成功！");
    }

    /**
     * 更新用户信息
     */
    @PutMapping("/users/{id}")
    public ApiResponse updateById(@PathVariable("id") String id, @RequestBody User user) {
        userService.saveOrUpdate(user);
        return ApiResponse.success("修改成功！");
    }

    /**
     * 查询单个用户
     */
    @GetMapping("/users/{id}")
    public ApiResponse selectById(@PathVariable("id") String id) {
        User user = userService.getById(id);
        return ApiResponse.success(user);
    }

    /**
     * 查询所有用户
     */
    @GetMapping("/users")
    public ApiResponse listAll() {
        List<User> userList = userService.list();
        return ApiResponse.success(userList);
    }
}

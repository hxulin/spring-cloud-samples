package cn.huangxulin.cloud.controller;

import cn.huangxulin.cloud.bean.ApiResponse;
import cn.huangxulin.cloud.common.UserFeignClient;
import cn.huangxulin.cloud.entity.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

/**
 * 功能描述: 图书微服务 调用 平台微服务
 *
 * @author hxulin
 */
@RestController
public class BookController {

    @Autowired
    private UserFeignClient userFeignClient;

    /**
     * 图书微服务 调用 平台微服务, 新增用户
     */
    @PostMapping("/books")
    public ApiResponse insert(User user) {
        return userFeignClient.insert(user);
    }

    /**
     * 图书微服务 调用 平台微服务, 删除用户
     */
    @DeleteMapping("/books/{id}")
    public ApiResponse deleteById(@PathVariable("id") String id) {
        return userFeignClient.deleteById(id);
    }

    /**
     * 图书微服务 调用 平台微服务, 修改用户
     */
    @PutMapping("/books/{id}")
    public ApiResponse updateById(@PathVariable("id") String id, User user) {
        return userFeignClient.updateById(id, user);
    }

    /**
     * 图书微服务 调用 平台微服务, 查询单个用户
     */
    @GetMapping("/books/{id}")
    public ApiResponse selectById(@PathVariable("id") String id) {
        return userFeignClient.selectById(id);
    }

    /**
     * 图书微服务 调用 平台微服务, 查询所有用户
     */
    @GetMapping("/books")
    public ApiResponse listAll() {
        return userFeignClient.listAll();
    }

}

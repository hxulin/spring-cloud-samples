package cn.huangxulin.cloud.common;

import cn.huangxulin.cloud.bean.ApiResponse;
import cn.huangxulin.cloud.entity.User;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.*;

@FeignClient("app-platform")
public interface UserFeignClient {

    /**
     * 新增用户
     */
    @PostMapping("/users")
    ApiResponse insert(@RequestBody User user);

    /**
     * 删除一个用户
     */
    @DeleteMapping("/users/{id}")
    ApiResponse deleteById(@PathVariable("id") String id);

    /**
     * 更新用户信息
     */
    @PutMapping("/users/{id}")
    ApiResponse updateById(@PathVariable("id") String id, @RequestBody User user);

    /**
     * 查询单个用户
     */
    @GetMapping("/users/{id}")
    ApiResponse selectById(@PathVariable("id") String id);

    /**
     * 分页查询
     */
    @GetMapping("/users")
    ApiResponse listAll();

}
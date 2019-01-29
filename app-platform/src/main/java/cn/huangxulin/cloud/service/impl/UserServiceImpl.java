package cn.huangxulin.cloud.service.impl;

import cn.huangxulin.cloud.entity.User;
import cn.huangxulin.cloud.mapper.UserMapper;
import cn.huangxulin.cloud.service.UserService;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.springframework.stereotype.Service;

/**
 * 功能描述:
 *
 * @author hxulin
 */
@Service
public class UserServiceImpl extends ServiceImpl<UserMapper, User> implements UserService {

}

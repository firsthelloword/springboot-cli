package com.zyk.cli.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.zyk.cli.mapper.UserMapper;
import com.zyk.cli.UserService;
import com.zyk.cli.entity.User;
import org.springframework.stereotype.Service;

/**
 * @author zhangyongkai
 * @date 2023/8/8 17:07
 */
@Service
public class UserServiceImpl extends ServiceImpl<UserMapper,User> implements UserService {
}

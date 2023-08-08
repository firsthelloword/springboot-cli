package com.zyk.cli.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.zyk.cli.mapper.UserMapper;
import com.zyk.cli.pojo.entity.User;
import com.zyk.cli.service.UserService;

/**
 * @author zhangyongkai
 * @date 2023/8/8 17:07
 */
public class UserServiceImpl extends ServiceImpl<UserMapper,User> implements UserService {
}

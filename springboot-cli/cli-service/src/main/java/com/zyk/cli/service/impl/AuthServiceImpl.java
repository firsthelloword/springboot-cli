package com.zyk.cli.service.impl;

import com.zyk.cli.common.ResponseResult;
import com.zyk.cli.mapper.UserMapper;
import com.zyk.cli.pojo.param.LoginParam;
import com.zyk.cli.service.AuthService;
import org.springframework.stereotype.Service;

/**
 * @author zhangyongkai
 * @date 2023/8/3 15:28
 */
@Service
public class AuthServiceImpl implements AuthService {



    @Override
    public boolean tokenIsExpire(String token) {
        return false;
    }

    @Override
    public ResponseResult login(LoginParam loginParam) {
        return null;
    }
}

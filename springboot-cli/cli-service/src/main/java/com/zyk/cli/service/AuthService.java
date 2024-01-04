package com.zyk.cli.service;

import com.zyk.cli.common.ResponseResult;
import com.zyk.cli.pojo.param.LoginParam;

/**
 * @author zhangyongkai
 * @date 2023/8/3 15:28
 */
public interface AuthService {

    boolean tokenIsExpire(String token);

    ResponseResult login(LoginParam loginParam);
}

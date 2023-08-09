package com.zyk.cli;

import com.zyk.cli.param.LoginParam;

/**
 * @author zhangyongkai
 * @date 2023/8/3 15:28
 */
public interface AuthService {

    boolean tokenIsExpire(String token);

    ResponseResult login(LoginParam loginParam);
}

package com.zyk.cli.service.impl;

import com.zyk.cli.common.ResponseResult;
import com.zyk.cli.service.AuthService;
import com.zyk.cli.pojo.param.LoginParam;
import org.springframework.stereotype.Service;

/**
 * @author zhangyongkai
 * @date 2023/8/3 15:28
 */
@Service
public class AuthServiceImpl implements AuthService {

//    @Autowired
//    AuthenticationManager authenticationManager;

    @Override
    public boolean tokenIsExpire(String token) {
        return false;
    }

    @Override
    public ResponseResult login(LoginParam loginParam) {
//        UsernamePasswordAuthenticationToken authenticationToken =
//                new UsernamePasswordAuthenticationToken(loginParam.getUsername(), loginParam.getPassword());
//        authenticationManager.authenticate(authenticationToken);

        //上一步没有抛出异常说明认证成功，我们向用户颁发jwt令牌
//        String token = JWT.create()
//                .setPayload("username", loginParam.getUsername())
//                .setKey("zhangyongkai".getBytes(StandardCharsets.UTF_8))
//                .sign();

        return ResponseResult.success("token");
    }
}

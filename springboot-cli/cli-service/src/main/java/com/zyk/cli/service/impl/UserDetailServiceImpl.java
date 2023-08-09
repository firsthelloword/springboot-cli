package com.zyk.cli.service.impl;

import com.baomidou.mybatisplus.core.conditions.query.LambdaQueryWrapper;
import com.zyk.cli.entity.User;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

/**
 * @author zhangyongkai
 * @date 2023/8/8 14:56
 */
//@Service
//public class UserDetailServiceImpl implements UserDetailsService {
//
////    @Autowired
////    private UserService userService;
//
//    @Override
//    public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
//
//        LambdaQueryWrapper<User> userLambdaQueryWrapper = new LambdaQueryWrapper<User>();
//        userLambdaQueryWrapper.eq(User::getUsername,username);
//      //  User one = userService.getOne(userLambdaQueryWrapper);
//
//        return null;
//    }
//}

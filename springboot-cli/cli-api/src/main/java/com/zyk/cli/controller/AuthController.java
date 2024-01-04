package com.zyk.cli.controller;

import com.zyk.cli.common.ResponseResult;
import com.zyk.cli.pojo.param.LoginParam;
import com.zyk.cli.service.AuthService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author zhangyongkai
 * @date 2023/8/3 17:12
 */
@RestController
@RequestMapping("/auth")
public class AuthController {



	@Autowired
	private AuthService authService;


	@PostMapping("/login")
	public ResponseResult login(@RequestBody LoginParam loginParam){

		return  ResponseResult.success();

	}




}

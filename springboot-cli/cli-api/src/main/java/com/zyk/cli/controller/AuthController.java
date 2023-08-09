package com.zyk.cli.controller;

import com.zyk.cli.ResponseResult;
import com.zyk.cli.param.LoginParam;
import com.zyk.cli.AuthService;
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

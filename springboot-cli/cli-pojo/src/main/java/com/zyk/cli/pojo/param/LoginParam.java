package com.zyk.cli.pojo.param;

import lombok.Data;

/**
 * @author zhangyongkai
 * @date 2023/8/8 10:48
 */
@Data
public class LoginParam {

   private String password;

   private String username;

   private String code;
}

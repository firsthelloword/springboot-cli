package com.zyk.cli.entity;

import com.baomidou.mybatisplus.annotation.TableName;
import lombok.Data;

/**
 * @author zhangyongkai
 * @date 2023/8/8 14:57
 */
@Data
@TableName("user")
public class  User extends BaseEntity {

    private String username;

    private String password;
}

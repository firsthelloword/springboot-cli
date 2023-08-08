package com.zyk.cli.pojo.entity;

import com.zyk.cli.common.BaseEntity;
import lombok.Data;

/**
 * @author zhangyongkai
 * @date 2023/8/8 14:57
 */
@Data
public class  User extends BaseEntity {

    private String username;

    private String password;
}

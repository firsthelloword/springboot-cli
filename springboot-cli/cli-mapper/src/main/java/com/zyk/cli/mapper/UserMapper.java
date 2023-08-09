package com.zyk.cli.mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.zyk.cli.entity.User;
import org.apache.ibatis.annotations.Mapper;

/**
 * @author zhangyongkai
 * @date 2023/8/8 17:04
 */
@Mapper
public interface UserMapper extends BaseMapper<User> {
}

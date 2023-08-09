package com.zyk.cli.entity;

import com.baomidou.mybatisplus.annotation.TableId;
import lombok.Data;

import java.time.LocalDateTime;

/**
 * @author zhangyongkai
 * @date 2023/8/8 17:00
 */
@Data
public class BaseEntity {

   @TableId
   private Integer id;

   private LocalDateTime createTime;

   private LocalDateTime updateTime;
}

package org.jxch.study.security.entity.po;

import com.baomidou.mybatisplus.annotation.TableName;
import lombok.Data;
import lombok.experimental.Accessors;

import java.io.Serializable;

@Data
@Accessors(chain = true)
@TableName("user_role")
public class UserRoleDO implements Serializable {
    private Long userId;
    private Long roleId;
}

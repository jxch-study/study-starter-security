package org.jxch.study.security.entity.po;

import com.baomidou.mybatisplus.annotation.TableName;
import lombok.Data;
import lombok.experimental.Accessors;

import java.io.Serializable;

@Data
@Accessors(chain = true)
@TableName("role_permission")
public class RolePermissionDO implements Serializable {
    private Long roleId;
    private Long permissionId;
}

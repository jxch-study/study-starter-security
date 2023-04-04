package org.jxch.study.security.entity.po;

import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import lombok.Data;
import lombok.experimental.Accessors;

import java.io.Serializable;

@Data
@Accessors(chain = true)
@TableName("permission")
public class PermissionDO implements Serializable {
    @TableId
    private Long id;
    private String permissionName;
    private String permissionUrl;
    private Long parentId;
}

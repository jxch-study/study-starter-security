package org.jxch.study.security.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.jxch.study.security.dao.RolePermissionDao;
import org.jxch.study.security.entity.po.RolePermissionDO;
import org.jxch.study.security.service.RolePermissionService;
import org.springframework.stereotype.Service;

@Service
public class RolePermissionServiceImpl extends ServiceImpl<RolePermissionDao, RolePermissionDO> implements RolePermissionService {
}

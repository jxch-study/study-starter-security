package org.jxch.study.security.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.jxch.study.security.dao.RoleDao;
import org.jxch.study.security.entity.po.RoleDO;
import org.jxch.study.security.service.RoleService;
import org.springframework.stereotype.Service;

@Service
public class RoleServiceImpl extends ServiceImpl<RoleDao, RoleDO> implements RoleService {
}

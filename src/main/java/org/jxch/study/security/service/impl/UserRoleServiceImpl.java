package org.jxch.study.security.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.jxch.study.security.dao.UserRoleDao;
import org.jxch.study.security.entity.po.UserRoleDO;
import org.jxch.study.security.service.UserRoleService;
import org.springframework.stereotype.Service;

@Service
public class UserRoleServiceImpl extends ServiceImpl<UserRoleDao, UserRoleDO> implements UserRoleService {
}

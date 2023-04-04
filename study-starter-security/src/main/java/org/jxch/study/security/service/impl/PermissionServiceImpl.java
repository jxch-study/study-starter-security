package org.jxch.study.security.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.jxch.study.security.dao.PermissionDao;
import org.jxch.study.security.entity.po.PermissionDO;
import org.jxch.study.security.service.PermissionService;
import org.springframework.stereotype.Service;

@Service
public class PermissionServiceImpl extends ServiceImpl<PermissionDao, PermissionDO> implements PermissionService {
}


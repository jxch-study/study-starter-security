package org.jxch.study.security.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.jxch.study.security.dao.UserDao;
import org.jxch.study.security.entity.po.UserDO;
import org.jxch.study.security.service.UserService;
import org.springframework.stereotype.Service;

@Service
public class UserServiceImpl extends ServiceImpl<UserDao, UserDO> implements UserService {
}

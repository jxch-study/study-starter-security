package org.jxch.study.security.dao;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;
import org.jxch.study.security.entity.po.UserDO;

@Mapper
public interface UserDao extends BaseMapper<UserDO> {
}

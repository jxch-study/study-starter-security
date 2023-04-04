package org.jxch.study.security.service.impl;


import com.baomidou.mybatisplus.core.conditions.query.LambdaQueryWrapper;
import lombok.RequiredArgsConstructor;
import org.jxch.study.security.entity.po.PermissionDO;
import org.jxch.study.security.entity.po.RolePermissionDO;
import org.jxch.study.security.entity.po.UserDO;
import org.jxch.study.security.entity.po.UserRoleDO;
import org.jxch.study.security.service.PermissionService;
import org.jxch.study.security.service.RolePermissionService;
import org.jxch.study.security.service.UserRoleService;
import org.jxch.study.security.service.UserService;
import org.springframework.lang.NonNull;
import org.springframework.security.core.authority.SimpleGrantedAuthority;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

import java.util.Collection;
import java.util.List;
import java.util.Objects;

@Service
@RequiredArgsConstructor
public class UserDetailsServiceImpl implements UserDetailsService {
    private final UserService userService;
    private final PermissionService permissionService;
    private final UserRoleService userRoleService;
    private final RolePermissionService rolePermissionService;

    @Override
    public UserDetails loadUserByUsername(@NonNull String username) throws UsernameNotFoundException {
        UserDO user = userService.getOne(new LambdaQueryWrapper<UserDO>().eq(UserDO::getUsername, username));
        if (Objects.isNull(user)) {
            throw new UsernameNotFoundException(username);
        }

        List<SimpleGrantedAuthority> authorityList = userRoleService.list(new LambdaQueryWrapper<UserRoleDO>()
                        .eq(UserRoleDO::getUserId, user.getId())).stream()
                .map(userRoleDO -> rolePermissionService.list(new LambdaQueryWrapper<RolePermissionDO>()
                        .eq(RolePermissionDO::getRoleId, userRoleDO.getRoleId())))
                .flatMap(Collection::stream)
                .map(rolePermissionDo -> permissionService.getOne(new LambdaQueryWrapper<PermissionDO>().eq(PermissionDO::getId, rolePermissionDo.getPermissionId())))
                .map(permissionDO -> new SimpleGrantedAuthority(permissionDO.getPermissionUrl()))
                .toList();

        return user.setAuthorityList(authorityList);
    }

}


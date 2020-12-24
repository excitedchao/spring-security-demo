package com.example.springsecuritydemo.service.security;

import com.example.springsecuritydemo.domain.Permission;
import com.example.springsecuritydemo.domain.Role;
import com.example.springsecuritydemo.domain.RolePermission;
import com.example.springsecuritydemo.domain.UserRole;
import com.example.springsecuritydemo.service.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.authority.SimpleGrantedAuthority;
import org.springframework.security.core.userdetails.User;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

// 自定义数据源来获取数据
// 这里只要是存在一个自定义的 UserDetailsService ，那么security将会使用该实例进行配置
@Component
public class MyUserDetailsService implements UserDetailsService {
    @Autowired
    private IUserService userService;

    @Autowired
    private IPermissionService permissionService;

    @Autowired
    private IRoleService roleService;

    @Autowired
    private IUserRoleService userRoleService;

    @Autowired
    private IRolePermissionService rolePermissionService;

    @Autowired
    private IUserPermService userPermService;

    @Override
    public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {

        Collection<GrantedAuthority> authorities = new ArrayList<>();
        // 从数据库中取出用户信息
        com.example.springsecuritydemo.domain.User user = userService.selectUserByUsername(username);

        // 判断用户是否存在
        if(user == null) {
            throw new UsernameNotFoundException("用户名不存在");
        }

        // 添加角色
        UserRole userRole1 = new UserRole();
        userRole1.setUserId(user.getId());
        List<UserRole> userRoles = userRoleService.selectUserRoleList(userRole1);

        if (userRoles != null){
            for (UserRole userRole : userRoles) {
                Role role = roleService.selectRoleById(userRole.getRoleId());
                authorities.add(new SimpleGrantedAuthority("ROLE_"+role.getName()));
                RolePermission rolePermission1 = new RolePermission();
                rolePermission1.setRoleId(role.getId());
                List<RolePermission> rolePermissions = rolePermissionService.selectRolePermissionList(rolePermission1);
                    if (rolePermissions != null){
                        for (RolePermission sysRolePermission:rolePermissions) {
                            Permission Permission = permissionService.selectPermissionById(sysRolePermission.getPermissionId());
                            authorities.add(new SimpleGrantedAuthority(Permission.getName()));
                        }
                    }
            }
        }

        // 返回UserDetails实现类
        return new User(user.getUsername(), user.getPassword(), authorities);
    }
}
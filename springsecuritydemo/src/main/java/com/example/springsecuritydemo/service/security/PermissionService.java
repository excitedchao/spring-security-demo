package com.example.springsecuritydemo.service.security;

import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.stereotype.Service;

import java.util.Collection;

@Service("ss")
public class PermissionService {
    /**
     * 仅支持单个权限
     * @param permission
     * @return
     */
    public boolean hasPermission(String permission) {
        Collection<? extends GrantedAuthority> authorities = SecurityContextHolder.getContext().getAuthentication().getAuthorities();
        if (authorities != null){
            for (GrantedAuthority authority: authorities) {
                if (authority.getAuthority().equalsIgnoreCase(permission)){
                    return true;
                }
            }
        }
        return false;
    }
}

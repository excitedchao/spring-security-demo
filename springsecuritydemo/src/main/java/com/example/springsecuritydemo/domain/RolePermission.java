package com.example.springsecuritydemo.domain;

/**
 * 角色权限对象 sy_role_permission
 * 
 * @author ruoyi
 * @date 2020-12-23
 */
public class RolePermission
{
    private static final long serialVersionUID = 1L;

    /**  */
    private Long roleId;

    /**  */
    private Long permissionId;

    public void setRoleId(Long roleId) 
    {
        this.roleId = roleId;
    }

    public Long getRoleId() 
    {
        return roleId;
    }
    public void setPermissionId(Long permissionId) 
    {
        this.permissionId = permissionId;
    }

    public Long getPermissionId() 
    {
        return permissionId;
    }

}

package com.example.springsecuritydemo.domain;

/**
 * 用户角色对象 sy_user_role
 * 
 * @author ruoyi
 * @date 2020-12-23
 */
public class UserRole
{
    private static final long serialVersionUID = 1L;

    /**  */
    private Long id;

    /**  */
    private Long userId;

    /**  */
    private Long roleId;

    public void setId(Long id) 
    {
        this.id = id;
    }

    public Long getId() 
    {
        return id;
    }
    public void setUserId(Long userId) 
    {
        this.userId = userId;
    }

    public Long getUserId() 
    {
        return userId;
    }
    public void setRoleId(Long roleId) 
    {
        this.roleId = roleId;
    }

    public Long getRoleId() 
    {
        return roleId;
    }

}

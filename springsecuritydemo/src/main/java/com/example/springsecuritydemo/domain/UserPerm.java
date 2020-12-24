package com.example.springsecuritydemo.domain;

/**
 * 用户权限对象 sy_user_perm
 * 
 * @author ruoyi
 * @date 2020-12-23
 */
public class UserPerm
{
    private static final long serialVersionUID = 1L;

    /**  */
    private Long id;

    /**  */
    private Long userId;

    /**  */
    private Long permId;

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
    public void setPermId(Long permId) 
    {
        this.permId = permId;
    }

    public Long getPermId() 
    {
        return permId;
    }

}

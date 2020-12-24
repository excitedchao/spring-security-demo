package com.example.springsecuritydemo.domain;

/**
 * 用户对象 sy_user
 * 
 * @author ruoyi
 * @date 2020-12-23
 */
public class User
{
    private static final long serialVersionUID = 1L;

    /**  */
    private Long id;

    /**  */
    private String username;

    /**  */
    private String password;

    public void setId(Long id) 
    {
        this.id = id;
    }

    public Long getId() 
    {
        return id;
    }
    public void setUsername(String username) 
    {
        this.username = username;
    }

    public String getUsername() 
    {
        return username;
    }
    public void setPassword(String password) 
    {
        this.password = password;
    }

    public String getPassword() 
    {
        return password;
    }

}

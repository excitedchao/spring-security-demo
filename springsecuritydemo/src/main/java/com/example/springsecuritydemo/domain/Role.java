package com.example.springsecuritydemo.domain;

/**
 * 角色对象 sy_role
 * 
 * @author ruoyi
 * @date 2020-12-23
 */
public class Role
{
    private static final long serialVersionUID = 1L;

    /**  */
    private Long id;

    /**  */
    private String name;

    public void setId(Long id) 
    {
        this.id = id;
    }

    public Long getId() 
    {
        return id;
    }
    public void setName(String name) 
    {
        this.name = name;
    }

    public String getName() 
    {
        return name;
    }

}

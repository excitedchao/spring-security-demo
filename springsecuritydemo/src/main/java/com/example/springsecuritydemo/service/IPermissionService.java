package com.example.springsecuritydemo.service;


import com.example.springsecuritydemo.domain.Permission;

import java.util.List;

/**
 * 权限Service接口
 * 
 * @author ruoyi
 * @date 2020-12-23
 */
public interface IPermissionService 
{
    /**
     * 查询权限
     * 
     * @param id 权限ID
     * @return 权限
     */
    public Permission selectPermissionById(Long id);

    /**
     * 查询权限列表
     * 
     * @param permission 权限
     * @return 权限集合
     */
    public List<Permission> selectPermissionList(Permission permission);

    /**
     * 新增权限
     * 
     * @param permission 权限
     * @return 结果
     */
    public int insertPermission(Permission permission);

    /**
     * 修改权限
     * 
     * @param permission 权限
     * @return 结果
     */
    public int updatePermission(Permission permission);

    /**
     * 批量删除权限
     * 
     * @param ids 需要删除的数据ID
     * @return 结果
     */
    public int deletePermissionByIds(String ids);

    /**
     * 删除权限信息
     * 
     * @param id 权限ID
     * @return 结果
     */
    public int deletePermissionById(Long id);
}

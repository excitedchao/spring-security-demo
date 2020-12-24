package com.example.springsecuritydemo.service;


import com.example.springsecuritydemo.domain.RolePermission;

import java.util.List;

/**
 * 角色权限Service接口
 * 
 * @author ruoyi
 * @date 2020-12-23
 */
public interface IRolePermissionService 
{
    /**
     * 查询角色权限
     * 
     * @param roleId 角色权限ID
     * @return 角色权限
     */
    public RolePermission selectRolePermissionById(Long roleId);

    /**
     * 查询角色权限列表
     * 
     * @param rolePermission 角色权限
     * @return 角色权限集合
     */
    public List<RolePermission> selectRolePermissionList(RolePermission rolePermission);

    /**
     * 新增角色权限
     * 
     * @param rolePermission 角色权限
     * @return 结果
     */
    public int insertRolePermission(RolePermission rolePermission);

    /**
     * 修改角色权限
     * 
     * @param rolePermission 角色权限
     * @return 结果
     */
    public int updateRolePermission(RolePermission rolePermission);

    /**
     * 批量删除角色权限
     * 
     * @param ids 需要删除的数据ID
     * @return 结果
     */
    public int deleteRolePermissionByIds(String ids);

    /**
     * 删除角色权限信息
     * 
     * @param roleId 角色权限ID
     * @return 结果
     */
    public int deleteRolePermissionById(Long roleId);
}

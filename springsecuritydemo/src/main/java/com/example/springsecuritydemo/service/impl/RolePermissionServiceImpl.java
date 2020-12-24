package com.example.springsecuritydemo.service.impl;

import java.util.List;

import com.example.springsecuritydemo.commom.Convert;
import com.example.springsecuritydemo.domain.RolePermission;
import com.example.springsecuritydemo.mapper.RolePermissionMapper;
import com.example.springsecuritydemo.service.IRolePermissionService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * 角色权限Service业务层处理
 * 
 * @author ruoyi
 * @date 2020-12-23
 */
@Service
public class RolePermissionServiceImpl implements IRolePermissionService
{
    @Autowired
    private RolePermissionMapper rolePermissionMapper;

    /**
     * 查询角色权限
     * 
     * @param roleId 角色权限ID
     * @return 角色权限
     */
    @Override
    public RolePermission selectRolePermissionById(Long roleId)
    {
        return rolePermissionMapper.selectRolePermissionById(roleId);
    }

    /**
     * 查询角色权限列表
     * 
     * @param rolePermission 角色权限
     * @return 角色权限
     */
    @Override
    public List<RolePermission> selectRolePermissionList(RolePermission rolePermission)
    {
        return rolePermissionMapper.selectRolePermissionList(rolePermission);
    }

    /**
     * 新增角色权限
     * 
     * @param rolePermission 角色权限
     * @return 结果
     */
    @Override
    public int insertRolePermission(RolePermission rolePermission)
    {
        return rolePermissionMapper.insertRolePermission(rolePermission);
    }

    /**
     * 修改角色权限
     * 
     * @param rolePermission 角色权限
     * @return 结果
     */
    @Override
    public int updateRolePermission(RolePermission rolePermission)
    {
        return rolePermissionMapper.updateRolePermission(rolePermission);
    }

    /**
     * 删除角色权限对象
     * 
     * @param ids 需要删除的数据ID
     * @return 结果
     */
    @Override
    public int deleteRolePermissionByIds(String ids)
    {
        return rolePermissionMapper.deleteRolePermissionByIds(Convert.toStrArray(ids));
    }

    /**
     * 删除角色权限信息
     * 
     * @param roleId 角色权限ID
     * @return 结果
     */
    @Override
    public int deleteRolePermissionById(Long roleId)
    {
        return rolePermissionMapper.deleteRolePermissionById(roleId);
    }
}

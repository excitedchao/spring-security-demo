package com.example.springsecuritydemo.service.impl;

import java.util.List;

import com.example.springsecuritydemo.commom.Convert;
import com.example.springsecuritydemo.domain.Permission;
import com.example.springsecuritydemo.mapper.PermissionMapper;
import com.example.springsecuritydemo.service.IPermissionService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * 权限Service业务层处理
 * 
 * @author ruoyi
 * @date 2020-12-23
 */
@Service
public class PermissionServiceImpl implements IPermissionService
{
    @Autowired
    private PermissionMapper permissionMapper;

    /**
     * 查询权限
     * 
     * @param id 权限ID
     * @return 权限
     */
    @Override
    public Permission selectPermissionById(Long id)
    {
        return permissionMapper.selectPermissionById(id);
    }

    /**
     * 查询权限列表
     * 
     * @param permission 权限
     * @return 权限
     */
    @Override
    public List<Permission> selectPermissionList(Permission permission)
    {
        return permissionMapper.selectPermissionList(permission);
    }

    /**
     * 新增权限
     * 
     * @param permission 权限
     * @return 结果
     */
    @Override
    public int insertPermission(Permission permission)
    {
        return permissionMapper.insertPermission(permission);
    }

    /**
     * 修改权限
     * 
     * @param permission 权限
     * @return 结果
     */
    @Override
    public int updatePermission(Permission permission)
    {
        return permissionMapper.updatePermission(permission);
    }

    /**
     * 删除权限对象
     * 
     * @param ids 需要删除的数据ID
     * @return 结果
     */
    @Override
    public int deletePermissionByIds(String ids)
    {
        return permissionMapper.deletePermissionByIds(Convert.toStrArray(ids));
    }

    /**
     * 删除权限信息
     * 
     * @param id 权限ID
     * @return 结果
     */
    @Override
    public int deletePermissionById(Long id)
    {
        return permissionMapper.deletePermissionById(id);
    }
}

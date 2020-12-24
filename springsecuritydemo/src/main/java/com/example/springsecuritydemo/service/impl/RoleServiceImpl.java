package com.example.springsecuritydemo.service.impl;


import com.example.springsecuritydemo.commom.Convert;
import com.example.springsecuritydemo.domain.Role;
import com.example.springsecuritydemo.mapper.RoleMapper;
import com.example.springsecuritydemo.service.IRoleService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * 角色Service业务层处理
 * 
 * @author ruoyi
 * @date 2020-12-23
 */
@Service
public class RoleServiceImpl implements IRoleService
{
    @Autowired
    private RoleMapper roleMapper;

    /**
     * 查询角色
     * 
     * @param id 角色ID
     * @return 角色
     */
    @Override
    public Role selectRoleById(Long id)
    {
        return roleMapper.selectRoleById(id);
    }

    /**
     * 查询角色列表
     * 
     * @param role 角色
     * @return 角色
     */
    @Override
    public List<Role> selectRoleList(Role role)
    {
        return roleMapper.selectRoleList(role);
    }

    @Override
    public List<String> listByUserId(Long userId) {
        return listByUserId(userId);
    }

    /**
     * 新增角色
     * 
     * @param role 角色
     * @return 结果
     */
    @Override
    public int insertRole(Role role)
    {
        return roleMapper.insertRole(role);
    }

    /**
     * 修改角色
     * 
     * @param role 角色
     * @return 结果
     */
    @Override
    public int updateRole(Role role)
    {
        return roleMapper.updateRole(role);
    }

    /**
     * 删除角色对象
     * 
     * @param ids 需要删除的数据ID
     * @return 结果
     */
    @Override
    public int deleteRoleByIds(String ids)
    {
        return roleMapper.deleteRoleByIds(Convert.toStrArray(ids));
    }

    /**
     * 删除角色信息
     * 
     * @param id 角色ID
     * @return 结果
     */
    @Override
    public int deleteRoleById(Long id)
    {
        return roleMapper.deleteRoleById(id);
    }
}

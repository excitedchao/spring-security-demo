package com.example.springsecuritydemo.service.impl;

import com.example.springsecuritydemo.commom.Convert;
import com.example.springsecuritydemo.domain.UserRole;
import com.example.springsecuritydemo.service.IUserRoleService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.example.springsecuritydemo.mapper.UserRoleMapper;

import java.util.List;

/**
 * 用户角色Service业务层处理
 * 
 * @author ruoyi
 * @date 2020-12-23
 */
@Service
public class UserRoleServiceImpl implements IUserRoleService
{
    @Autowired
    private UserRoleMapper userRoleMapper;

    /**
     * 查询用户角色
     * 
     * @param id 用户角色ID
     * @return 用户角色
     */
    @Override
    public UserRole selectUserRoleById(Long id)
    {
        return userRoleMapper.selectUserRoleById(id);
    }

    /**
     * 查询用户角色列表
     * 
     * @param userRole 用户角色
     * @return 用户角色
     */
    @Override
    public List<UserRole> selectUserRoleList(UserRole userRole)
    {
        return userRoleMapper.selectUserRoleList(userRole);
    }

    /**
     * 新增用户角色
     * 
     * @param userRole 用户角色
     * @return 结果
     */
    @Override
    public int insertUserRole(UserRole userRole)
    {
        return userRoleMapper.insertUserRole(userRole);
    }

    /**
     * 修改用户角色
     * 
     * @param userRole 用户角色
     * @return 结果
     */
    @Override
    public int updateUserRole(UserRole userRole)
    {
        return userRoleMapper.updateUserRole(userRole);
    }

    /**
     * 删除用户角色对象
     * 
     * @param ids 需要删除的数据ID
     * @return 结果
     */
    @Override
    public int deleteUserRoleByIds(String ids)
    {
        return userRoleMapper.deleteUserRoleByIds(Convert.toStrArray(ids));
    }

    /**
     * 删除用户角色信息
     * 
     * @param id 用户角色ID
     * @return 结果
     */
    @Override
    public int deleteUserRoleById(Long id)
    {
        return userRoleMapper.deleteUserRoleById(id);
    }
}

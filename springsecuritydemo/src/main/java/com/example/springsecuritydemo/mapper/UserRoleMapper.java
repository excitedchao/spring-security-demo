package com.example.springsecuritydemo.mapper;

import com.example.springsecuritydemo.domain.UserRole;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

/**
 * 用户角色Mapper接口
 * 
 * @author ruoyi
 * @date 2020-12-23
 */
@Mapper
public interface UserRoleMapper 
{
    /**
     * 查询用户角色
     * 
     * @param id 用户角色ID
     * @return 用户角色
     */
    public UserRole selectUserRoleById(Long id);

    /**
     * 查询用户角色列表
     * 
     * @param userRole 用户角色
     * @return 用户角色集合
     */
    public List<UserRole> selectUserRoleList(UserRole userRole);

    /**
     * 新增用户角色
     * 
     * @param userRole 用户角色
     * @return 结果
     */
    public int insertUserRole(UserRole userRole);

    /**
     * 修改用户角色
     * 
     * @param userRole 用户角色
     * @return 结果
     */
    public int updateUserRole(UserRole userRole);

    /**
     * 删除用户角色
     * 
     * @param id 用户角色ID
     * @return 结果
     */
    public int deleteUserRoleById(Long id);

    /**
     * 批量删除用户角色
     * 
     * @param ids 需要删除的数据ID
     * @return 结果
     */
    public int deleteUserRoleByIds(String[] ids);
}

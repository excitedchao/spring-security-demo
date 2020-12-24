package com.example.springsecuritydemo.mapper;

import com.example.springsecuritydemo.domain.Role;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

/**
 * 角色Mapper接口
 * 
 * @author ruoyi
 * @date 2020-12-23
 */
@Mapper
public interface RoleMapper 
{
    /**
     * 查询角色
     * 
     * @param id 角色ID
     * @return 角色
     */
    public Role selectRoleById(Long id);

    /**
     * 查询角色列表
     * 
     * @param role 角色
     * @return 角色集合
     */
    public List<Role> selectRoleList(Role role);
    public List<String> listByUserId(Long userId);
    /**
     * 新增角色
     * 
     * @param role 角色
     * @return 结果
     */
    public int insertRole(Role role);

    /**
     * 修改角色
     * 
     * @param role 角色
     * @return 结果
     */
    public int updateRole(Role role);

    /**
     * 删除角色
     * 
     * @param id 角色ID
     * @return 结果
     */
    public int deleteRoleById(Long id);

    /**
     * 批量删除角色
     * 
     * @param ids 需要删除的数据ID
     * @return 结果
     */
    public int deleteRoleByIds(String[] ids);
}

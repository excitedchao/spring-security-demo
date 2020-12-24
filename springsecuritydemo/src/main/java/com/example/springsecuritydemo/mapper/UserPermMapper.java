package com.example.springsecuritydemo.mapper;


import com.example.springsecuritydemo.domain.UserPerm;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

/**
 * 用户权限Mapper接口
 * 
 * @author ruoyi
 * @date 2020-12-23
 */
@Mapper
public interface UserPermMapper 
{
    /**
     * 查询用户权限
     * 
     * @param id 用户权限ID
     * @return 用户权限
     */
    public UserPerm selectUserPermById(Long id);

    /**
     * 查询用户权限列表
     * 
     * @param userPerm 用户权限
     * @return 用户权限集合
     */
    public List<UserPerm> selectUserPermList(UserPerm userPerm);

    /**
     * 新增用户权限
     * 
     * @param userPerm 用户权限
     * @return 结果
     */
    public int insertUserPerm(UserPerm userPerm);

    /**
     * 修改用户权限
     * 
     * @param userPerm 用户权限
     * @return 结果
     */
    public int updateUserPerm(UserPerm userPerm);

    /**
     * 删除用户权限
     * 
     * @param id 用户权限ID
     * @return 结果
     */
    public int deleteUserPermById(Long id);

    /**
     * 批量删除用户权限
     * 
     * @param ids 需要删除的数据ID
     * @return 结果
     */
    public int deleteUserPermByIds(String[] ids);
}

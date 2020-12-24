package com.example.springsecuritydemo.service.impl;

import com.example.springsecuritydemo.commom.Convert;
import com.example.springsecuritydemo.domain.UserPerm;
import com.example.springsecuritydemo.mapper.UserPermMapper;
import com.example.springsecuritydemo.service.IUserPermService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * 用户权限Service业务层处理
 * 
 * @author ruoyi
 * @date 2020-12-23
 */
@Service
public class UserPermServiceImpl implements IUserPermService
{
    @Autowired
    private UserPermMapper userPermMapper;

    /**
     * 查询用户权限
     * 
     * @param id 用户权限ID
     * @return 用户权限
     */
    @Override
    public UserPerm selectUserPermById(Long id)
    {
        return userPermMapper.selectUserPermById(id);
    }

    /**
     * 查询用户权限列表
     * 
     * @param userPerm 用户权限
     * @return 用户权限
     */
    @Override
    public List<UserPerm> selectUserPermList(UserPerm userPerm)
    {
        return userPermMapper.selectUserPermList(userPerm);
    }

    /**
     * 新增用户权限
     * 
     * @param userPerm 用户权限
     * @return 结果
     */
    @Override
    public int insertUserPerm(UserPerm userPerm)
    {
        return userPermMapper.insertUserPerm(userPerm);
    }

    /**
     * 修改用户权限
     * 
     * @param userPerm 用户权限
     * @return 结果
     */
    @Override
    public int updateUserPerm(UserPerm userPerm)
    {
        return userPermMapper.updateUserPerm(userPerm);
    }

    /**
     * 删除用户权限对象
     * 
     * @param ids 需要删除的数据ID
     * @return 结果
     */
    @Override
    public int deleteUserPermByIds(String ids)
    {
        return userPermMapper.deleteUserPermByIds(Convert.toStrArray(ids));
    }

    /**
     * 删除用户权限信息
     * 
     * @param id 用户权限ID
     * @return 结果
     */
    @Override
    public int deleteUserPermById(Long id)
    {
        return userPermMapper.deleteUserPermById(id);
    }
}

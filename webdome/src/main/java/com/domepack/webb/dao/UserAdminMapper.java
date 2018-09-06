package com.domepack.webb.dao;

import java.util.List;

import com.domepack.webb.entity.UserAdmin;

public interface UserAdminMapper {
	
    int deleteByPrimaryKey(Long id);

    Long insert(UserAdmin record);

    int insertSelective(UserAdmin record);

    UserAdmin selectByPrimaryKey(Long id);

    int updateByPrimaryKeySelective(UserAdmin record);

    int updateByPrimaryKey(UserAdmin record);
    
    /**
     * 查询所有用户
     * @param contidions
     * @return
     */
    List<UserAdmin> selectUserAdmins(UserAdmin contidions);
    
    /**
     * 用户登录
     * @param name登录名，pwd 密码
     * @return
     */
    UserAdmin selectUserForLogin(String name,String pwd);
}
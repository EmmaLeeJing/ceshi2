package com.domepack.webb.dao;

import java.util.List;

import com.domepack.webb.entity.UserAdmin;

public interface UserAdminMapper {
    int deleteByPrimaryKey(Long id);

    int insert(UserAdmin record);

    int insertSelective(UserAdmin record);

    UserAdmin selectByPrimaryKey(Long id);

    int updateByPrimaryKeySelective(UserAdmin record);

    int updateByPrimaryKey(UserAdmin record);
    
    List<UserAdmin> selectUserAdmins(UserAdmin record);
}
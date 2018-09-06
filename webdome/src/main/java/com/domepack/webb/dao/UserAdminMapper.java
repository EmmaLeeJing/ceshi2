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
     * ��ѯ�����û�
     * @param contidions
     * @return
     */
    List<UserAdmin> selectUserAdmins(UserAdmin contidions);
    
    /**
     * �û���¼
     * @param name��¼����pwd ����
     * @return
     */
    UserAdmin selectUserForLogin(String name,String pwd);
}
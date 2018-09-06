package com.domepack.webb.service;

import java.util.List;

import com.domepack.webb.entity.UserAdmin;

public interface UserAdminService {
	
	String insert(UserAdmin user);
	
	String del(Long userId);
	
	String update(UserAdmin user);
	
	String updateFlag(Long userId,Integer flag);
	
	List<UserAdmin> userList(UserAdmin user);

}

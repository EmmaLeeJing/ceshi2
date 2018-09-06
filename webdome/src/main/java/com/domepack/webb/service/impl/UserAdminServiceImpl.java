package com.domepack.webb.service.impl;

import java.util.Date;
import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.domepack.webb.controller.UserController;
import com.domepack.webb.dao.UserAdminMapper;
import com.domepack.webb.entity.UserAdmin;
import com.domepack.webb.entity.enums.UserAdminEnum.UserFlag;
import com.domepack.webb.service.UserAdminService;
import com.domepack.webb.untils.FinalValues;
import com.domepack.webb.untils.MD5Utils;
import com.domepack.webb.untils.WebUtils;
@Service("userService")
public class UserAdminServiceImpl implements UserAdminService {
	
	@Autowired
	private UserAdminMapper userAdminMapper;
	
	final String DEFAULTPWD="000000";
	
	private static Logger log=LoggerFactory.getLogger(UserAdminServiceImpl.class);
	

	 
	@Override
	public String insert(UserAdmin user) {
		if (!WebUtils.isStrEmpty(user.getPassword())) {
			user.setPassword(MD5Utils.getPwd(user.getPassword()));
		}else{
			user.setPassword(MD5Utils.getPwd(DEFAULTPWD));
		}
		
		user.setCteadTime(new Date());
		user.setUseFlag(UserFlag.USING.getValue());
		
	    Long returnid = userAdminMapper.insert(user);
	    
	    if (returnid!=null) {
	    	log.info("新增ADMIN用户id:",returnid);
			return FinalValues.SUSSCE;
		}
		return FinalValues.FAIL;
	}

	@Override
	public String del(Long userId) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public String update(UserAdmin user) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public String updateFlag(Long userId, Integer flag) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<UserAdmin> userList(UserAdmin user) {
		
		return userAdminMapper.selectUserAdmins(user);
	}

}

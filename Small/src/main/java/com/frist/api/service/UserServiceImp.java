package com.frist.api.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.frist.api.dao.IUserDao;
import com.frist.api.model.user.User;

@Service("userserivce")
public class UserServiceImp implements IUserService{

	@Autowired
	private IUserDao userDao ;
	
	@Override
	public boolean isMobileExist(String username) {
		// TODO Auto-generated method stub
		String id = userDao.getIdByMobile(username);
		if (id!=null) {
			return true ;
		}
		return false;
	}

	@Override
	public User getUserByMobileAndPwd(String mobile, String password) {
		// TODO Auto-generated method stub
		return userDao.getUserByMobileAndPassword(mobile, password);
	}

}

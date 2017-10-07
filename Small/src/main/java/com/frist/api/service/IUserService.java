package com.frist.api.service;

import com.frist.api.model.user.User;

public interface IUserService {

	public boolean isMobileExist(String username);

	public User getUserByMobileAndPwd(String mobile,String password);
	
}

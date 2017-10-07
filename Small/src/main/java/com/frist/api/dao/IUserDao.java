package com.frist.api.dao;

import org.apache.ibatis.annotations.Param;

import com.frist.api.model.user.User;

public interface IUserDao {

	String getIdByMobile(@Param("mobile")String mobile);
	
	User getUserByMobileAndPassword(@Param("mobile")String mobile ,@Param("password")String password);
}

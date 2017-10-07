package com.frist.api.model.user;

import com.frist.api.model.BaseModel;

@SuppressWarnings("serial")
public class User extends BaseModel{
	private String id;//用户id
	private String userName;// 用户名
	private String mobile;// 手机号码
	private String photo ;//用户头像
	private String password ; //用户密码
	private String userRole;// 用户角色，登录时根据不同用户角色导向不同的管理页面ADMIN、BUYER、SELLER
	private String deviceid;//用户登录设备号		
	private String validateStatus;//未验证0 等待验证1 验证通过2 验证失败3
	private String modify;//是否修改过密码 0.未修改 1.已修改
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getUserName() {
		return userName;
	}
	public void setUserName(String userName) {
		this.userName = userName;
	}
	public String getMobile() {
		return mobile;
	}
	public void setMobile(String mobile) {
		this.mobile = mobile;
	}
	public String getPhoto() {
		return photo;
	}
	public void setPhoto(String photo) {
		this.photo = photo;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public String getUserRole() {
		return userRole;
	}
	public void setUserRole(String userRole) {
		this.userRole = userRole;
	}
	public String getDeviceid() {
		return deviceid;
	}
	public void setDeviceid(String deviceid) {
		this.deviceid = deviceid;
	}
	public String getValidateStatus() {
		return validateStatus;
	}
	public void setValidateStatus(String validateStatus) {
		this.validateStatus = validateStatus;
	}
	public String getModify() {
		return modify;
	}
	public void setModify(String modify) {
		this.modify = modify;
	}
	
	
}

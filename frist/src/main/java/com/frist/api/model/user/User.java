package com.frist.api.model.user;

import com.frist.api.model.BaseModel;

@SuppressWarnings("serial")
public class User extends BaseModel{
	private String id;//�û�id
	private String userName;// �û���
	private String mobile;// �ֻ�����
	private String photo ;//�û�ͷ��
	private String password ; //�û�����
	private String userRole;// �û���ɫ����¼ʱ���ݲ�ͬ�û���ɫ����ͬ�Ĺ���ҳ��ADMIN��BUYER��SELLER
	private String deviceid;//�û���¼�豸��		
	private String validateStatus;//δ��֤0 �ȴ���֤1 ��֤ͨ��2 ��֤ʧ��3
	private String modify;//�Ƿ��޸Ĺ����� 0.δ�޸� 1.���޸�
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

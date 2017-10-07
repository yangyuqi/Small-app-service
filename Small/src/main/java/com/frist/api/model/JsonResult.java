package com.frist.api.model;

import com.frist.api.config.ResultCode;

public class JsonResult {
	private String code;
	private String msg;
	private Object data = new Object();
	
	public void setCodeAndMsg(ResultCode resultCode) {
		code = resultCode.getCode();
		msg = resultCode.getMsg();
	}
	public void setMsg(String msg) {
		this.msg = msg;
	}
	public void setCode(String code) {
		this.code = code;
	}
	public String getCode() {
		return code;
	}
	
	public String getMsg() {
		return msg;
	}
	public Object getData() {
		return data;
		//return data.getClass().equals(Object.class) ? "": data;
	}
	public void setData(Object data) {
		this.data = data;
	}
}

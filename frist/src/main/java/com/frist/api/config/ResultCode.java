package com.frist.api.config;

public enum ResultCode {

	SUCCESS("200", "成功"),
	PARAMS_MISSING("201", "缺少参数"),
	UNKNOWN_ERROR("202", "未知错误"),
	TIME_PARSE_ERROR("203", "时间转化错误"),
	VALIDATE_ELIGIBLE("204","验证通过"),
	VALIDATE_FAILED("205","验证失败"),
	PARAMS_ERROR("206", "参数错误"),
	
	USER_EXIST("310", "用户已经存在"),
	USER_NOTEXIST("311", "用户不存在"),
	USERNAME_NULL("312","用户名空"),
	PWD_NOTMATCH_OLD("313", "原密码不正确"),
	PASSEWORD_NULL("314", "密码不能为空"),
	PWD_ERROR("315", "密码错误"),
	SMS_CODE_ERROR("316", "验证码错误"),
	REGIST_ERROR("317", "注册失败"),
	SEND_SMS_CODE_ERROR("318", "发送验证码失败"),
	USER_PWD_ERROR("319", "用户或密码错误"),
	LOGIN_ERROR("320", "登录出错"),
	UPDATE_PASSWORD_ERROR("321", "修改密码失败"),
	UPDATE_NICKNAME_ERROR("322", "修改昵称失败"),
	FIND_PASSWORD_ERROR("323", "找回密码失败"),
	USER_RIGHT_FORBID_FAILED("324", "此用户没有此权限"),
	UPDATE_USER_ICON_ERROR("325", "修改头像失败"),
	USER_NOT_BUYER("326", "该手机号不是普通消费者"),
	USER_NOT_MANAGER("327", "该手机号不是管理员"),
	SEND_SMS_CODE_OFTEN_ERROR("328", "发送验证码过于频繁,请稍后再试"),

	GET_DEFAULT_ADDRESS_FAILED("410", "获取默认地址失败"),
	ADD_ADDRESS_FAILED("411", "新增地址失败"),
	CAN_NOT_ADD_ADDRESS_FAILED("412", "超过最多地址数量"),
	GET_ADDRESS_LIST_FAILED("413", "获取地址列表失败"),
	GET_ADDRESS_DETAIL_FAILED("414", "获取地址详情失败"),
	MODIFY_ADDRESS_FAILED("415", "修改地址失败"),
	SET_DEFAULT_ADDRESS_FAILED("416", "设置默认地址失败"),

	ACCESSTOKEN_INVALID("1001", "accessToken无效"),
	REFRESH_ACCESSTOKEN_FAILD("1002", "刷新accessToken失败"),
	REFRESHTOKEN_INVALID("1005", "refreshToken无效"),
	
	ADD_FAILED("3004", "添加失败"),
	ROLE_ERROR("3005", "身份错误错误"),
	ROLE_NULL("3006", "身份不能为空"),
	
	GOODS_NOTEXIST("2002", "查不到指定商品"),
	id_NULL("2003", "id不能为空"),
	
	QRCODE_NOTEXIST("3001","二维码不存在"),
	MODIFY_FAILED("3002", "修改失败"),
	DELETE_FAILED("3003", "删除失败"),
	
	

	ADD_SHOPPING_FAILED("5000", "加入购物车失败"),
	DELETE_SHOPPING_FAILED("5001", "删除购物车失败"),
	MODIFY_SHOPPING_FAILED("5002", "修改购物车失败"),
	GOODS_STOCK_INSUFFICIENT("5100", "商品库存不足"),
	ADD_ORDER_FAILED("5200", "新增订单失败"),
	GET_ORDER_LIST_FAILED("5201", "获取订单列表失败"),
	GET_ORDER_DETAIL_FAILED("5202", "获取订单详情失败"),
	OPERATE_ORDER_FAILED("5203", "操作订单失败"),
	CHANGE_ORDER_DELIVER_PAY_FAILED("5204", "修改订单支付方式配送方式失败"),
	GET_ORDER_COUNT_FAILED("5205", "获取订单数量失败"),
	GET_CANCEL_ORDER_REASON_FAILED("5206", "获取取消订单原因失败"),
	GET_REFUND_ORDER_REASON_FAILED("5207", "获取退款原因失败"),
	REFUND_ORDER_FAILED("5208", "申请退款失败"),
	GET_REFUND_ORDER_DETAIL_FAILED("5209", "获取退款详情失败"),
	GET_CONSULT_HISTORY_FAILED("5210", "获取协商历史失败"),
	
	GET_DELIVERY_ORDERS_FAILED("5300", "获取订单列表失败"),
	SEARCH_DELIVERY_ORDERS_FAILED("5301", "搜索失败"),
	GET_DELIVERY_ORDER_DETAIL_FAILED("5302", "获取订单详情失败"),
	GET_REFUSE_ORDER_REASON_FAILED("5303", "获取拒单原因失败"),
	GET_ORDER_PAY_PARAMS_FAILED("5304", "获取支付参数失败"),
	
	ADD_EVALUATE_FAILED("5401", "评论失败"),
	GET_EVALUATE_LIST_FAILED("5402", "获取评论列表失败"),
	
	GET_TANKS_FAILED("6000", "获取资产列表失败"),
	SEARCH_TANKS_FAILED("6001", "搜索失败"),
	GET_TANK_DETAIL_FAILED("6002", "获取资产详情失败"),
	UPDATE_TANK_BARCODE_FAILED("6003", "补码失败"),
	UPDATE_TANK_STATUS_FAILED("6004", "修改瓶罐状态失败"),
	BARCODE_CANNOT_USE_FAILED("6005", "该条码不能使用"),
	BARCODE_NOT_USE_FAILED("6006", "该条码无绑定信息"),

	ADD_ATTESTATION_FAILED("6100", "新增认证失败"),
	MODIFY_ATTESTATION_FAILED("6101", "修改认证失败"),
	GET_ATTESTATION_DETAIL_FAILED("6102", "获取认证详情失败"),
	GET_MY_ATTESTATION_DETAIL_FAILED("6103", "获取我的认证失败"),
	GET_ATTESTATION_LIST_FAILED("6104", "获取认证列表失败"),
	PHONE_OR_IDCARD_ATTESTATION("6105", "此手机号或身份证已使用认证"),
	USER_NOT_ATTESTATION_FAILED("6106", "用户未实名认证")
	
	;
	
	
	private String code;
	private String msg;
	
	private ResultCode(String code, String msg) {
		this.code = code;
		this.msg = msg;
	}

	public String getCode() {
		return code;
	}

	public void setCode(String code) {
		this.code = code;
	}

	public String getMsg() {
		return msg;
	}

	public void setMsg(String msg) {
		this.msg = msg;
	}
}

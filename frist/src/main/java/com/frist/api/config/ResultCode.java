package com.frist.api.config;

public enum ResultCode {

	SUCCESS("200", "�ɹ�"),
	PARAMS_MISSING("201", "ȱ�ٲ���"),
	UNKNOWN_ERROR("202", "δ֪����"),
	TIME_PARSE_ERROR("203", "ʱ��ת������"),
	VALIDATE_ELIGIBLE("204","��֤ͨ��"),
	VALIDATE_FAILED("205","��֤ʧ��"),
	PARAMS_ERROR("206", "��������"),
	
	USER_EXIST("310", "�û��Ѿ�����"),
	USER_NOTEXIST("311", "�û�������"),
	USERNAME_NULL("312","�û�����"),
	PWD_NOTMATCH_OLD("313", "ԭ���벻��ȷ"),
	PASSEWORD_NULL("314", "���벻��Ϊ��"),
	PWD_ERROR("315", "�������"),
	SMS_CODE_ERROR("316", "��֤�����"),
	REGIST_ERROR("317", "ע��ʧ��"),
	SEND_SMS_CODE_ERROR("318", "������֤��ʧ��"),
	USER_PWD_ERROR("319", "�û����������"),
	LOGIN_ERROR("320", "��¼����"),
	UPDATE_PASSWORD_ERROR("321", "�޸�����ʧ��"),
	UPDATE_NICKNAME_ERROR("322", "�޸��ǳ�ʧ��"),
	FIND_PASSWORD_ERROR("323", "�һ�����ʧ��"),
	USER_RIGHT_FORBID_FAILED("324", "���û�û�д�Ȩ��"),
	UPDATE_USER_ICON_ERROR("325", "�޸�ͷ��ʧ��"),
	USER_NOT_BUYER("326", "���ֻ��Ų�����ͨ������"),
	USER_NOT_MANAGER("327", "���ֻ��Ų��ǹ���Ա"),
	SEND_SMS_CODE_OFTEN_ERROR("328", "������֤�����Ƶ��,���Ժ�����"),

	GET_DEFAULT_ADDRESS_FAILED("410", "��ȡĬ�ϵ�ַʧ��"),
	ADD_ADDRESS_FAILED("411", "������ַʧ��"),
	CAN_NOT_ADD_ADDRESS_FAILED("412", "��������ַ����"),
	GET_ADDRESS_LIST_FAILED("413", "��ȡ��ַ�б�ʧ��"),
	GET_ADDRESS_DETAIL_FAILED("414", "��ȡ��ַ����ʧ��"),
	MODIFY_ADDRESS_FAILED("415", "�޸ĵ�ַʧ��"),
	SET_DEFAULT_ADDRESS_FAILED("416", "����Ĭ�ϵ�ַʧ��"),

	ACCESSTOKEN_INVALID("1001", "accessToken��Ч"),
	REFRESH_ACCESSTOKEN_FAILD("1002", "ˢ��accessTokenʧ��"),
	REFRESHTOKEN_INVALID("1005", "refreshToken��Ч"),
	
	ADD_FAILED("3004", "���ʧ��"),
	ROLE_ERROR("3005", "��ݴ������"),
	ROLE_NULL("3006", "��ݲ���Ϊ��"),
	
	GOODS_NOTEXIST("2002", "�鲻��ָ����Ʒ"),
	id_NULL("2003", "id����Ϊ��"),
	
	QRCODE_NOTEXIST("3001","��ά�벻����"),
	MODIFY_FAILED("3002", "�޸�ʧ��"),
	DELETE_FAILED("3003", "ɾ��ʧ��"),
	
	

	ADD_SHOPPING_FAILED("5000", "���빺�ﳵʧ��"),
	DELETE_SHOPPING_FAILED("5001", "ɾ�����ﳵʧ��"),
	MODIFY_SHOPPING_FAILED("5002", "�޸Ĺ��ﳵʧ��"),
	GOODS_STOCK_INSUFFICIENT("5100", "��Ʒ��治��"),
	ADD_ORDER_FAILED("5200", "��������ʧ��"),
	GET_ORDER_LIST_FAILED("5201", "��ȡ�����б�ʧ��"),
	GET_ORDER_DETAIL_FAILED("5202", "��ȡ��������ʧ��"),
	OPERATE_ORDER_FAILED("5203", "��������ʧ��"),
	CHANGE_ORDER_DELIVER_PAY_FAILED("5204", "�޸Ķ���֧����ʽ���ͷ�ʽʧ��"),
	GET_ORDER_COUNT_FAILED("5205", "��ȡ��������ʧ��"),
	GET_CANCEL_ORDER_REASON_FAILED("5206", "��ȡȡ������ԭ��ʧ��"),
	GET_REFUND_ORDER_REASON_FAILED("5207", "��ȡ�˿�ԭ��ʧ��"),
	REFUND_ORDER_FAILED("5208", "�����˿�ʧ��"),
	GET_REFUND_ORDER_DETAIL_FAILED("5209", "��ȡ�˿�����ʧ��"),
	GET_CONSULT_HISTORY_FAILED("5210", "��ȡЭ����ʷʧ��"),
	
	GET_DELIVERY_ORDERS_FAILED("5300", "��ȡ�����б�ʧ��"),
	SEARCH_DELIVERY_ORDERS_FAILED("5301", "����ʧ��"),
	GET_DELIVERY_ORDER_DETAIL_FAILED("5302", "��ȡ��������ʧ��"),
	GET_REFUSE_ORDER_REASON_FAILED("5303", "��ȡ�ܵ�ԭ��ʧ��"),
	GET_ORDER_PAY_PARAMS_FAILED("5304", "��ȡ֧������ʧ��"),
	
	ADD_EVALUATE_FAILED("5401", "����ʧ��"),
	GET_EVALUATE_LIST_FAILED("5402", "��ȡ�����б�ʧ��"),
	
	GET_TANKS_FAILED("6000", "��ȡ�ʲ��б�ʧ��"),
	SEARCH_TANKS_FAILED("6001", "����ʧ��"),
	GET_TANK_DETAIL_FAILED("6002", "��ȡ�ʲ�����ʧ��"),
	UPDATE_TANK_BARCODE_FAILED("6003", "����ʧ��"),
	UPDATE_TANK_STATUS_FAILED("6004", "�޸�ƿ��״̬ʧ��"),
	BARCODE_CANNOT_USE_FAILED("6005", "�����벻��ʹ��"),
	BARCODE_NOT_USE_FAILED("6006", "�������ް���Ϣ"),

	ADD_ATTESTATION_FAILED("6100", "������֤ʧ��"),
	MODIFY_ATTESTATION_FAILED("6101", "�޸���֤ʧ��"),
	GET_ATTESTATION_DETAIL_FAILED("6102", "��ȡ��֤����ʧ��"),
	GET_MY_ATTESTATION_DETAIL_FAILED("6103", "��ȡ�ҵ���֤ʧ��"),
	GET_ATTESTATION_LIST_FAILED("6104", "��ȡ��֤�б�ʧ��"),
	PHONE_OR_IDCARD_ATTESTATION("6105", "���ֻ��Ż����֤��ʹ����֤"),
	USER_NOT_ATTESTATION_FAILED("6106", "�û�δʵ����֤")
	
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

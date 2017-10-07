package com.frist.api.controller.user;

import java.util.Map;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.frist.api.config.ResultCode;
import com.frist.api.controller.BaseController;
import com.frist.api.model.JsonResult;
import com.frist.api.model.user.User;
import com.frist.api.service.IUserService;
import com.frist.api.util.CommUtil;



@Controller
@RequestMapping("/")
public class UserController extends BaseController {

	@Autowired
	private IUserService userService ;
	
	@RequestMapping(value = {"api/app/v1/user/login"})
	@ResponseBody
	public JsonResult login(HttpServletRequest request ,HttpServletResponse response ,@RequestBody Map<String, Object> map){
		JsonResult jsonResult = new JsonResult();
		String username = (String)map.get("username");
		String password = (String)map.get("password");
		String type = (String)map.get("type");
		String device = (String)map.get("device");
		
		if(username != null && password != null && type != null && device != null ){
			if (!userService.isMobileExist(username)) {
				jsonResult.setCodeAndMsg(ResultCode.USER_NOTEXIST);
				return jsonResult;
			}
			User user = userService.getUserByMobileAndPwd(username, password);
			if (user!=null) {
				if(!"buyer".equals(type) && "BUYER".equals(user.getUserRole())){
					//Ïû·ÑÕßÕËºÅµÇÂ¼ÅäËÍÔ±¶Ë µÇÂ¼Ê§°Ü
					jsonResult.setCodeAndMsg(ResultCode.LOGIN_ERROR);
					return jsonResult;
				}
			}
			//Ë¢ÐÂtoken
			String accessToken = CommUtil.get32UUID();
			String refreshToken = CommUtil.get32UUID();
			
		}
		
		return null ;
	} 
}

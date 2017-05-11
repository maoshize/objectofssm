package main.java.com.msz.web;


import javax.servlet.http.HttpSession;

import main.java.com.msz.entity.UserDetail;
import main.java.com.msz.service.UserService;
import main.java.com.msz.utils.GetObject;

import org.springframework.context.ApplicationContext;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Component
@RequestMapping(value="loginS")
public class LoginSController {
	private static ApplicationContext app = GetObject.setUp();
	private static UserService userService = (UserService) app
			.getBean("userService");
	/**
	 * 页面跳转方法
	 * @return
	 */
	@RequestMapping(value="/turnToLoginS.do",method={RequestMethod.GET,RequestMethod.POST})
	public String turnToLoginS(){
		return "loginS";
	}
	@RequestMapping(value="/trunToMessage.do",method={RequestMethod.GET,RequestMethod.POST})
	public String turnToMessage(HttpSession session){
		Integer u_id = (Integer) session.getAttribute("u_id");
		UserDetail userDetail = userService.selectUserDetailById(u_id);
		session.setAttribute("toudishijian", userDetail.getUd_entryTime().toLocaleString());
		return "message";
	}
	@RequestMapping(value="/trunToExchange.do",method={RequestMethod.GET,RequestMethod.POST})
	public String trunToExchange(){
		return "exchange";
	}
	
}

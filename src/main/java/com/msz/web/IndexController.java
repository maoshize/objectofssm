package main.java.com.msz.web;

import javax.servlet.http.HttpSession;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
public class IndexController {
	@RequestMapping(value="/index.do",method=RequestMethod.GET)
	public String  trunToIndex() {
		return "index";
	}
	@RequestMapping(value="/indexlogin.do",method=RequestMethod.GET)
	public String turnToLogin() {
		return "login";
	}
	@RequestMapping(value="/indexregister.do",method=RequestMethod.GET)
	public String turnToRegister() {
		return "register";
	}
	@RequestMapping(value="/exitLogin.do",method={RequestMethod.GET,RequestMethod.POST})
	public String exitLogin(HttpSession session){
		session.setAttribute("u_id", "");
		session.setAttribute("u_name", "");
		return "index";
	}
	
}

package main.java.com.msz.web;

import javax.servlet.http.HttpSession;

import main.java.com.msz.entity.User;
import main.java.com.msz.service.UserService;
import main.java.com.msz.utils.GetObject;

import org.springframework.context.ApplicationContext;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class RegisterController {
	private static ApplicationContext app = GetObject.setUp();
	private static UserService userService = (UserService) app
			.getBean("userService");
	/**
	 * 注册方法
	 * @param session
	 * @param u_name
	 * @param u_pass
	 * @param rePass
	 * @param model
	 * @return
	 */
	@RequestMapping(value="/register.do")
	public String register(HttpSession session,String u_name,String u_pass,String rePass, Model model){
		String existUser = userService.existUser(u_name);
		if(existUser.equals("notexist")){
			if (u_pass.equals(rePass)) {
				User user = (User) app.getBean("user");
				user.setU_name(u_name);
				user.setU_pass(u_pass);
				user.setU_level(1);
				String insertUser = userService.insertUser(user);
				if (insertUser.equals("success")) {
					session.setAttribute("info", "恭喜您！注册成功！");
					
					return "index";
				}
			}
			model.addAttribute("error", "两次密码输入不一致！请重新输入！");
			return "register";
			
		}model.addAttribute("error", "该用户名已被注册！请重新输入！");
		return "register";
		
		
	}
}

package main.java.com.msz.web;

import javax.servlet.http.HttpServletRequest;


import main.java.com.msz.entity.User;

import main.java.com.msz.service.UserService;
import main.java.com.msz.utils.GetObject;
import org.springframework.context.ApplicationContext;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
@RequestMapping(value = "/login")
public class LoginController {
	private static ApplicationContext app = GetObject.setUp();
	private static UserService userService = (UserService) app
			.getBean("userService");

	/**
	 * 登录方法
	 * 
	 * @param request
	 * @param u_name
	 * @param u_pass
	 * @param model
	 * @return
	 */
	@RequestMapping(value = "/login.do", method = { RequestMethod.GET,
			RequestMethod.POST })
	public String login(HttpServletRequest request, String u_name,
			String u_pass, Model model) {
		if (userService.existUser(u_name).equals("exist")) {
			User selectUser = userService.selectUser(u_name);
			Integer u_level = selectUser.getU_level();
			String u_pass2 = selectUser.getU_pass();

			if (u_pass2.equals(u_pass)) {
				request.getSession().setAttribute("u_name", u_name);
				request.getSession().setAttribute("u_id", selectUser.getU_id());
				// 正式员工跳转到staff.jsp
				if (u_level == 2) {
					return "stuff";
				}
				if (u_level == 4) {
					return "manager";
				}
				if (u_level == 6) {
					return "admin";
				}
				// 非正式员工跳转到employee.jsp
				return "employee";
			}
			model.addAttribute("error", "用户名或者密码错误，请重新输入！");
			return "index";
		}
		model.addAttribute("error", "用户名或者密码错误，请重新输入！");
		return "index";
	}
}

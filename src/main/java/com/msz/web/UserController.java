package main.java.com.msz.web;

import java.util.Date;
import java.util.HashMap;
import java.util.LinkedList;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;


import main.java.com.msz.entity.Accepted;
import main.java.com.msz.entity.Department;
import main.java.com.msz.entity.Position;
import main.java.com.msz.entity.User;
import main.java.com.msz.entity.UserDetail;
import main.java.com.msz.service.ManagerService;
import main.java.com.msz.service.UserService;
import main.java.com.msz.utils.GetObject;

import org.springframework.context.ApplicationContext;
import org.springframework.stereotype.Component;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Component
@RequestMapping(value = "/user")
public class UserController {
	private static ApplicationContext app = GetObject.setUp();
	private static UserService userService = (UserService) app
			.getBean("userService");
	private static ManagerService managerService = (ManagerService) app
			.getBean("managerService");

	/**
	 * 简历信息页面分流方法
	 * 
	 * @param request
	 * @param model
	 * @return
	 */
	@RequestMapping(value = "/resumecheck.do", method = { RequestMethod.GET,
			RequestMethod.POST })
	public String turnToResume(HttpServletRequest request, Model model) {
		HttpSession session = request.getSession();
		Integer u_id = (Integer) session.getAttribute("u_id");
		System.out.println(u_id);
		String u_name = (String) session.getAttribute("u_name");
		System.out.println(u_name);
		User user = userService.selectUser(u_name);
		UserDetail userDetail = userService.selectUserDetailById(u_id);
		LinkedList<Department> listOfDepartments = userService
				.getAllDepartment();
		System.out.println(listOfDepartments);
		LinkedList<Position> listOfPositions = userService.getAllPosition();
		System.out.println(listOfPositions);
		session.setAttribute("listOfDepartment", listOfDepartments);
		session.setAttribute("listOfPosition", listOfPositions);
		if (userDetail == null) {
			return "addresume";
		}
		Integer ud_p_id = userDetail.getUd_p_id();
		Integer department = ud_p_id / 10;
		Integer position = ud_p_id % 10;
		String oldposistion = userService.getDepartmentById(department)
				+ userService.getPosition(position);
		session.setAttribute("oldposition", oldposistion);
		session.setAttribute("user", user);
		session.setAttribute("userDetail", userDetail);
		LinkedList<Department> listOfDepartments1 = userService
				.getAllDepartment();
		System.out.println(listOfDepartments);
		LinkedList<Position> listOfPositions1 = userService.getAllPosition();
		System.out.println(listOfPositions);
		session.setAttribute("listOfDepartment", listOfDepartments1);
		session.setAttribute("listOfPosition", listOfPositions1);
		return "changeresume";
	}

	/**
	 * 添加新用户的个人详情
	 * 
	 * @param session
	 * @param detail
	 * @param department
	 * @param position
	 * @return
	 */
	@RequestMapping(value = "/insertDetail.do", method = { RequestMethod.GET,
			RequestMethod.POST })
	public String insertUserDetail(HttpSession session, UserDetail detail,
			Integer department, Integer position) {
		String u_name = (String) session.getAttribute("u_name");
		Integer u_id = (Integer) session.getAttribute("u_id");
		String userDetail = userService.insertUserDetail(detail, u_name,
				department, position);
		LinkedList<UserDetail> allUserDetails = managerService
				.getAllUserDetails();
		Accepted accepted = (Accepted) app.getBean("accepted");
		
		for (UserDetail userDetail2 : allUserDetails) {
			System.out.println(userDetail2.toString());
			if (userDetail2.getUd_u_id().equals(u_id)) {
				accepted.setA_ud_id(userDetail2.getUd_id());
				accepted.setA_manager(userDetail2.getUd_p_id()/10);
			}
		}
		System.out.println(accepted.getA_ud_id());
		accepted.setA_deliverTime(new java.sql.Timestamp(new Date().getTime()) );
		accepted.setA_check("n");
		accepted.setA_hire("n");
		accepted.setA_interview("n");
		accepted.setA_delete("n");
		managerService.insertAccepted(accepted);
		System.out.println(userDetail);
		return "redirect:/login/resumecheck.do";

	}

	@RequestMapping(value = "/updateDetail.do", method = { RequestMethod.GET,
			RequestMethod.POST })
	public String updateUserDetail(HttpSession session, UserDetail userDetail,
			Integer department, Integer position) {
		System.out.println(department);
		System.out.println(position);
		String u_name = (String) session.getAttribute("u_name");
		Integer u_id = (Integer) session.getAttribute("u_id");
		userService.updateUserDetail(userDetail, u_name, department, position);
		Accepted accepted = (Accepted) app.getBean("accepted");
		LinkedList<UserDetail> allUserDetails = managerService
				.getAllUserDetails();
		for (UserDetail userDetail2 : allUserDetails) {
			System.out.println(userDetail2.toString());
			if (userDetail2.getUd_u_id().equals(u_id)) {
				accepted.setA_ud_id(userDetail2.getUd_id());
				accepted.setA_manager(userDetail2.getUd_p_id()/10);
			}
		}
		accepted.setA_deliverTime(new java.sql.Timestamp(new Date().getTime()));
		accepted.setA_check("n");
		accepted.setA_hire("n");
		accepted.setA_interview("n");
		accepted.setA_delete("n");
		
		managerService.insertAccepted(accepted);
		System.out.println(userDetail);
		return "redirect:/user/resumecheck.do";

	}

	@RequestMapping(value = "/checkUserDetail.do")
	public String checkUserDetail(HttpSession session) {
		Integer u_id = (Integer) session.getAttribute("u_id");
		UserDetail userDetail = userService.selectUserDetailById(u_id);
		session.setAttribute("userDetail", userDetail);
		return "employeeinformation";
	}
	/**
	 * 查询应聘者消息方法
	 * @param session
	 * @return
	 */
	@RequestMapping(value="/checkMessage")
	public String checkMessage(HttpSession session){
		Integer u_id= (Integer) session.getAttribute("u_id");
		LinkedList<Accepted> checkMessage = userService.checkMessage(u_id);
				
		System.out.println(checkMessage);
		session.setAttribute("checkMessage", checkMessage);
		
		return "message";
		
	}
	@RequestMapping(value="/cheangepassword.do")
	public String changePassword(HttpSession session, String oldU_pass ,String newU_pass ,String reU_pass){
		HashMap<String, String> map= new HashMap<String, String>();
		String  u_name = (String) session.getAttribute("u_name");
		User selectUser = userService.selectUser(u_name);
		if (selectUser.getU_pass().equals(oldU_pass)) {
			if (newU_pass .equals(reU_pass)) {
				map.clear();
				map.put("u_name", u_name);
				map.put("newpassword", newU_pass);	
				userService.changePassword(map);
			}
		}
		return "changepassword";
	}
	@RequestMapping(value="/trunToChangePassword.do")
	public String turnToChangePassword() {
		return "changepassword";
	}
}

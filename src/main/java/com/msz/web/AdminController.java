package main.java.com.msz.web;

import java.util.LinkedList;

import javax.servlet.http.HttpSession;

import main.java.com.msz.entity.Department;
import main.java.com.msz.entity.Position;
import main.java.com.msz.entity.PositionAndDepartment;

import main.java.com.msz.entity.UserDetail;
import main.java.com.msz.service.AdminService;

import main.java.com.msz.utils.GetObject;

import org.springframework.context.ApplicationContext;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping(value = "/admin")
public class AdminController {
	private static ApplicationContext app = GetObject.setUp();
	private static AdminService adminService = (AdminService) app
			.getBean("adminservice");

	@RequestMapping(value = "/turnToStuff.do")
	public String turnToEmployee(HttpSession session) {
		Integer u_id = (Integer) session.getAttribute("u_id");
		LinkedList<UserDetail> allUserDetails = adminService
				.getAllUserDetails();
		session.setAttribute("listOfUserDetail", allUserDetails);
		return "fireemployee";
	}

	@RequestMapping(value = "/firestuff.do")
	public String fireStuff(Integer u_id, HttpSession session) {
		LinkedList<UserDetail> fireStuff = adminService.fireStuff(u_id);
		session.setAttribute("listOfUserDetail", fireStuff);
		return "fireemployee";
	}

	@RequestMapping(value = "/checkPositionAndStuff.do")
	public String checkPositionAndStuff(Integer department, Integer position,
			HttpSession session) {
		System.out.println(department);
		System.out.println(position);
		LinkedList<UserDetail> listOfDetails = adminService
				.checkPositionAndStuff();
		session.setAttribute("listOfUserDetail", listOfDetails);
		return "fireemployee";
	}

	@RequestMapping(value = "/turnToChargeStuff.do")
	public String turnToChargeStuff(HttpSession session) {
		/*LinkedList<Department> listOfDepartments = adminService
				.getAllDepartment();
		System.out.println(listOfDepartments);
		LinkedList<Position> listOfPositions = adminService.getAllPosition();
		System.out.println(listOfPositions);
		session.setAttribute("listOfDepartment", listOfDepartments);
		session.setAttribute("listOfPosition", listOfPositions);*/
		return "chargestuff";
	}

	@RequestMapping(value = "/turnToChargeEmployee.do")
	public String turnToChargeEmployee(HttpSession session) {
		LinkedList<UserDetail> listOfUserDetails = adminService
				.getAllUserDetails();
		session.setAttribute("listOfUserDetail", listOfUserDetails);
		return "accepted";
	}
	@RequestMapping(value="/turnToChargePosition.do")
	public String turnToChargePosition(HttpSession session){
		LinkedList<PositionAndDepartment> listOfPositionAndDepartments = adminService.getAllPosotionAndDepartment();
		session.setAttribute("listOfPositionAndDepartment", listOfPositionAndDepartments);
		return "chargeposition";
	}
	@RequestMapping(value="/turnToAddPosition.do")
	public String turnToAddPosition(HttpSession session){
		LinkedList<Department> listOfDepartments = adminService
				.getAllDepartment();
		session.setAttribute("listOfDepartment", listOfDepartments);
		return "addposition";
	}
	@RequestMapping(value="/deletePosition.do")
	public String deletePosition(Integer p_id){
		adminService.deletePosition(p_id);
		return "redirect:/admin/turnToChargePosition.do ";
	}
	@RequestMapping(value="/addposition.do")
	public String addPosition( String p_position, Integer p_d_id, Double p_salary){
		Position position = (Position) app.getBean("position");
		position.setP_d_id(p_d_id);
		position.setP_position(p_position);
		position.setP_salary(p_salary);
		adminService.addposition(position);
		return "redirect:/admin/turnToChargePosition.do ";
		
		
	}
}

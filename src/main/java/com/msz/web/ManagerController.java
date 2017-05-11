package main.java.com.msz.web;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.LinkedList;

import javax.servlet.http.HttpSession;

import main.java.com.msz.entity.UserDetail;
import main.java.com.msz.entity.Work;
import main.java.com.msz.service.ManagerService;
/*import main.java.com.msz.service.UserService;*/
import main.java.com.msz.utils.GetObject;

import org.springframework.context.ApplicationContext;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.RequestMapping;

@Component
@RequestMapping(value = "/manager")
public class ManagerController {
	private static ApplicationContext app = GetObject.setUp();
	/*private static UserService userService = (UserService) app
			.getBean("userService");*/
	public static ManagerService managerService = (ManagerService) app
			.getBean("managerService");
	/**
	 * 经理查看投递的简历方法
	 * @return
	 */
	@RequestMapping(value = "/checkAccepted.do")
	public String checkAccepted(HttpSession session) {
		LinkedList<UserDetail> checkedUserDetails = managerService
				.checkDetails((Integer) session.getAttribute("u_id"));
		
		session.setAttribute("listOfUserDetail", checkedUserDetails);
		return "accepted";
	}
	/**
	 * 面试信息更新
	 * @param ud_id
	 * @param dateString
	 * @return
	 * @throws ParseException
	 */
	@RequestMapping(value = "/updateInterviewMessage.do")
	public String updateInterviewMessage(Integer ud_id, String dateString ) throws ParseException{
		 SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
		Date date = dateFormat.parse(dateString);
		managerService.updateInterviewMessage(ud_id, date);
		return "redirect:/manager/checkAccepted.do";
	}
	/**
	 * 录取信息更新
	 * @param ud_id
	 * @param dateString
	 * @return
	 * @throws ParseException
	 */
	@RequestMapping(value="/updateHireMessage.do")
	public String hireThisEmployee(Integer u_id){
		managerService.updateHireMessage(u_id);
		return "redirect:/manager/checkAccepted.do";
	}
	/**
	 * 应聘者应聘考试
	 * @param session
	 * @return
	 */
	@RequestMapping(value="/test.do")
	public String employeeTest(HttpSession session){
		Integer u_id = (Integer) session.getAttribute("u_id");
		System.out.println(u_id);
		return "test";
	}
	/**
	 * 应聘者应聘考试判定
	 * @param session
	 * @return
	 */
	@RequestMapping(value="/chargeTest.do")
	public String employeeChargeTest(HttpSession session){
		
		Integer u_id = (Integer) session.getAttribute("u_id");
		System.out.println(u_id);
		return "test";
	}
	/**
	 * 查询已录用员工
	 * @param session
	 * @return
	 */
	@RequestMapping(value="/checkStuff.do")
	public String  checkStuff(HttpSession session) {
		Integer u_id = (Integer) session.getAttribute("u_id");
		session.setAttribute("checkstufflist", managerService.checkStuff(u_id));
		return "checkstuff";
	}
	/**
	 * 开除员工
	 * @param u_id
	 * @return
	 */
	@RequestMapping(value="/firestuff.do")
	public String firestuff(Integer u_id){
		managerService.fireStuff(u_id);
		return "redirect:/manager/checkStuff.do";
	}
	/**
	 * 跳转到结算工资页面
	 * @param u_id
	 * @return
	 */
	@RequestMapping(value="/turnToAddWage.do")
	public String turnToAddWage(Integer stuff_id ,HttpSession session){
		LinkedList<Work> listOfWorks = managerService.getWorkRecord(stuff_id);
		session.setAttribute("listOfWorkRecord", listOfWorks);
		session.setAttribute("stuff_id", stuff_id);
		return "addwages";
	}
	@RequestMapping(value="/addWages.do")
	public String AddWages(){
		return "addwages";
		
	}
}

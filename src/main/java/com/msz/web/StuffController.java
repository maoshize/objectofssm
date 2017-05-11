package main.java.com.msz.web;


import java.sql.Date;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.LinkedList;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import main.java.com.msz.entity.Dissent;
import main.java.com.msz.entity.Rewards;
import main.java.com.msz.entity.Wages;
import main.java.com.msz.entity.Work;
import main.java.com.msz.service.StuffService;
import main.java.com.msz.utils.GetObject;

import org.springframework.context.ApplicationContext;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping(value = "/stuff")
public class StuffController {
	private static ApplicationContext app = GetObject.setUp();
	private static StuffService stuffService = (StuffService) app
			.getBean("stuffservice");

	/**
	 * 上班签到
	 * 
	 * @param session
	 * @return
	 */
	@RequestMapping(value = "/onwork.do")
	public String onWork(HttpSession session) {
		Integer u_id = (Integer) session.getAttribute("u_id");
		stuffService.onWork(u_id);
		return "stuff";
	}

	/**
	 * 下班打卡
	 * 
	 * @param session
	 * @return
	 */
	@RequestMapping(value = "/offwork.do")
	public String offWork(HttpSession session) {
		Integer u_id = (Integer) session.getAttribute("u_id");
		stuffService.offWork(u_id);
		return "stuff";
	}

	/**
	 * 查询考勤记录
	 * 
	 * @param session
	 * @return
	 */
	@RequestMapping(value = "/checkworkrecord.do")
	public String checkWorkRecord(HttpSession session) {
		Integer u_id = (Integer) session.getAttribute("u_id");
		LinkedList<Work> listofwr = stuffService.checkWorkRecord(u_id);
		for (Work work : listofwr) {
			System.out.println(work.getW_off().toString() + "#####"
					+ work.getW_on().toString());
		}
		session.setAttribute("checkworkrecordlist", listofwr);
		return "workrecord";
	}

	@RequestMapping(value = "/turnToRewards.do")
	public String turnToRewards() {
		return "checkrewards";
	}

	/**
	 * 查询奖惩记录
	 * 
	 * @param session
	 * @param work_rewards_year
	 * @param work_rewards_month
	 * @return
	 */
	@RequestMapping(value = "/checkrewards.do")
	public String checkRewards(HttpSession session, Integer work_rewards_year,
			Integer work_rewards_month) {
		Integer u_id = (Integer) session.getAttribute("u_id");
		LinkedList<Rewards> listOfRewards = stuffService.checkRewards(
				work_rewards_month, work_rewards_year, u_id);
		session.setAttribute("listOfRewards", listOfRewards);
		return "checkrewards";
	}

	@RequestMapping(value = "/checkUserWage.do")
	public String checkUserWage(HttpSession session, Integer work_wages_year,
			Integer work_wages_month) {
		Integer u_id = (Integer) session.getAttribute("u_id");
		LinkedList<Wages> listOfWages = stuffService.checkWages(
				work_wages_month, work_wages_year, u_id);
		session.setAttribute("listOfWages", listOfWages);
		return "checkwages";
	}

	@RequestMapping(value = "/turnToWages.do")
	public String turnToWages() {
		return "checkwages";
	}

	@RequestMapping(value = "/addDissent.do")
	public String turnToAddDissent(HttpSession session,
			HttpServletRequest request, String wagetime, String reason) {
		
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM");
		Integer u_id = (Integer) session.getAttribute("u_id");
		Date wageDate = null;

		java.util.Date date = null;
		try {
			date = sdf.parse(wagetime);
		} catch (ParseException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		wageDate = new Date(date.getTime());

		stuffService.addDissent(wageDate, reason, u_id);

		return "redirect:/stuff/turnToDissent.do";
	}

	@RequestMapping(value = "/turnToDissent")
	public String turnToDissent(HttpSession session) {
		Integer u_id = (Integer) session.getAttribute("u_id");
		LinkedList<Dissent> listOfDissent = stuffService.checkDissent(u_id);
		session.setAttribute("listOfDissent", listOfDissent);
		return "dissent";
	}
}

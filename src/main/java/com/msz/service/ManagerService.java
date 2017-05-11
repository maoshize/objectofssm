package main.java.com.msz.service;

import java.util.Date;
import java.util.HashMap;
import java.util.LinkedList;

import main.java.com.msz.dao.AdminDao;
import main.java.com.msz.dao.ManagerDao;
import main.java.com.msz.dao.StuffDao;
import main.java.com.msz.dao.UserDao;
import main.java.com.msz.entity.Accepted;
import main.java.com.msz.entity.UserDetail;
import main.java.com.msz.entity.Work;
import main.java.com.msz.utils.GetObject;

import org.springframework.context.ApplicationContext;
import org.springframework.stereotype.Service;

@Service(value = "managerService")
public class ManagerService {
	private static ApplicationContext app = GetObject.setUp();
	private static ManagerDao managerDao = (ManagerDao) app
			.getBean("managerDao");
	private static UserDao userDao = (UserDao) app.getBean("userDao");
	private static AdminDao adminDao = (AdminDao) app.getBean("admindao");
	private static StuffDao stuffDao = (StuffDao) app.getBean("stuffdao");
	// 一些跳转方法
	public LinkedList<UserDetail> getAllUserDetails() {
		return managerDao.getAllusDetails();
	}

	public int updateCheck(Integer a_ud_id) {
		return managerDao.updateCheck(a_ud_id);
	}

	public int insertAccepted(Accepted accepted) {
		return managerDao.insertAccepted(accepted);
	}

	/**
	 * 返回此经理管理的申请者，并且把看过的检查字段变为y
	 * 
	 * @return
	 */
	public LinkedList<UserDetail> checkDetails(Integer managerid) {
		UserDetail detail = userDao.findUserDetailById(managerid);
		Integer ud_p_id = detail.getUd_p_id();
		Integer departmentid = ud_p_id / 10;
		LinkedList<UserDetail> listOfUserDetailByManager = managerDao
				.getListOfUserDetailByManager(departmentid);
		System.out.println(managerDao.updateCheck(departmentid));
		return listOfUserDetailByManager;
	}

	/**
	 * 确定面试后更新面试消息
	 * 
	 * @param ud_id
	 * @param date
	 * @return
	 */
	public int updateInterviewMessage(Integer ud_id, Date date) {
		HashMap<String, Object> map = new HashMap<String, Object>();
		map.put("a_ud_id", ud_id);
		map.put("a_interviewTime", date);
		System.out.println(map.get("a_ud_id"));
		System.out.println(map.get("a_interviewTime"));
		return managerDao.updateInterviewMessage(map);
	}

	/**
	 * 更新录用信息
	 * 
	 * @param ud_id
	 * @return
	 */
	public int updateHireMessage(Integer ud_id) {
		Integer u_id = 0;
		HashMap<String, Object> map = new HashMap<String, Object>();
		map.put("a_ud_id", ud_id);
		map.put("a_hireTime", new Date());
		LinkedList<UserDetail> allusDetails = managerDao.getAllusDetails();
		for (UserDetail userDetail : allusDetails) {
			if (userDetail.getUd_id().equals(ud_id)) {
				u_id = userDetail.getUd_u_id();
			}
		}
		managerDao.updateUserLevel(u_id);
		return managerDao.updateHireMessage(map);
	}

	/**
	 * 员工查看自己信息
	 */
	public LinkedList<UserDetail> checkStuff(Integer u_id) {
		return managerDao.checkStuff(u_id);

	}

	public LinkedList<UserDetail> fireStuff(Integer u_id) {
		// TODO Auto-generated method stub
		adminDao.fireStuff(u_id);
		adminDao.deleteUserDetail(u_id);
		return null;
	}

	public LinkedList<Work> getWorkRecord(Integer u_id) {
		// TODO Auto-generated method stub
		return stuffDao.getWorkRecordByUid(u_id);
	}
}

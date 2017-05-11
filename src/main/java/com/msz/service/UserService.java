package main.java.com.msz.service;


import java.util.Date;
import java.util.HashMap;
import java.util.LinkedList;

import main.java.com.msz.dao.UserDao;
import main.java.com.msz.entity.Accepted;
import main.java.com.msz.entity.User;
import main.java.com.msz.entity.UserDetail;
import main.java.com.msz.utils.GetObject;

import org.springframework.context.ApplicationContext;
import org.springframework.stereotype.Service;

@Service(value = "userService")
public class UserService extends AdminService{
	private static ApplicationContext app = GetObject.setUp();
	private static UserDao userDao = (UserDao) app.getBean("userDao");

	/**
	 * 是否存在确定用户
	 * 
	 * @param u_name
	 * @return
	 */
	public String existUser(String u_name) {
		User user = userDao.findUserByName(u_name);
		if (user != null) {
			return "exist";
		}
		return "notexist";
	}

	/**
	 * 得到确定用户
	 * 
	 * @param u_name
	 * @return
	 */
	public User selectUser(String u_name) {
		return userDao.findUserByName(u_name);
	}

	/**
	 * 插入注册用户
	 * 
	 * @param user
	 * @return
	 */
	public String insertUser(User user) {
		int resultOfInsertUser = userDao.insertUser(user);
		System.out.println(resultOfInsertUser);
		if (resultOfInsertUser == 1) {
			return "success";
		}
		return "fail";
	}

	/**
	 * 查询确定用户简历信息
	 * 
	 * @param u_id
	 * @return
	 */
	public UserDetail selectUserDetailById(Integer u_id) {
		return userDao.findUserDetailById(u_id);
	}
	public String getDepartmentById(Integer department){
		return userDao.getDepartmentById(department);
		
	}
	public String getPosition(Integer position){
		return userDao.getPositionById(position);
		
	}

	/**
	 * 插入确定用户简历信息
	 * 
	 * @param u_id
	 * @return
	 */
	public String insertUserDetail(UserDetail userDetail, String u_name,
			Integer department, Integer position) {
		Integer dp = department * 10 + position;
		userDetail.setUd_p_id(dp);
		userDetail.setUd_entryTime(new Date());
		User user = selectUser(u_name);
		userDetail.setUd_u_id(user.getU_id());
		System.out.println(userDetail.toString());
		if (userDao.insertUserDetail(userDetail) == 1) {
			return "success";
		}
		return "fail";
	}

	/**
	 * 修改确定用户简历信息
	 * 
	 * @param u_id
	 * @return
	 */
	public String updateUserDetail(UserDetail userDetail, String u_name,
			Integer department, Integer position) {
		Integer dp = department * 10 + position;
		userDetail.setUd_p_id(dp);
		userDetail.setUd_entryTime(new Date());
		User user = selectUser(u_name);
		userDetail.setUd_u_id(user.getU_id());
		System.out.println(userDetail.toString());
		if (userDao.updateUserDetail(userDetail) == 1) {
			return "success";
		}
		return "fail";
	}
	/**
	 * 应聘者查询消息
	 * @param u_id
	 * @return
	 */
	public LinkedList<Accepted> checkMessage(Integer u_id) {
		LinkedList<Accepted> checkMessage = userDao.checkMessage(u_id);
		System.out.println(checkMessage);
		return checkMessage;
	}
	/**
	 * 修改密码方法
	 * @param u_name
	 * @param newU_pass
	 */
	

	public void changePassword(HashMap<String, String> map) {
		// TODO Auto-generated method stub
			userDao.changePassword(map);
	}
}
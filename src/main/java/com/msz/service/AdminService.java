package main.java.com.msz.service;

import java.util.LinkedList;

import main.java.com.msz.dao.AdminDao;
import main.java.com.msz.entity.Department;
import main.java.com.msz.entity.Position;
import main.java.com.msz.entity.PositionAndDepartment;
import main.java.com.msz.entity.Training;
import main.java.com.msz.entity.UserDetail;

import main.java.com.msz.utils.GetObject;

import org.springframework.context.ApplicationContext;
import org.springframework.stereotype.Service;

@Service(value="adminservice")
public class AdminService  extends ManagerService{
	private static ApplicationContext app = GetObject.setUp();
	private static AdminDao adminDao = (AdminDao) app.getBean("admindao");
	
	public LinkedList<UserDetail> fireStuff(Integer u_id) {
		adminDao.fireStuff(u_id);
		adminDao.deleteUserDetail(u_id);
		return super.getAllUserDetails();
		
	}
	public LinkedList<UserDetail> checkPositionAndStuff() {
		
		return adminDao.checkPositionAndStuff();
	}
	public LinkedList<Department> getAllDepartment() {
		// TODO Auto-generated method stub
		return adminDao.getAllDepartment();
	}
	public LinkedList<Position> getAllPosition() {
		// TODO Auto-generated method stub
		return adminDao.getAllPosition();
	}
	public LinkedList<Training> getAllTrainings() {
		// TODO Auto-generated method stub
		return adminDao.getAllTraining();
	}
	public LinkedList<PositionAndDepartment> getAllPosotionAndDepartment() {
		// TODO Auto-generated method stub
		return adminDao.getAllPositionAndDepartment();
	}
	public void deletePosition(Integer p_id) {
		 adminDao.deletePosition(p_id);
	}
	public void addposition(Position position) {
		// TODO Auto-generated method stub
		adminDao.addPosition(position);
	}
}

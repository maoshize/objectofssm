package main.java.com.msz.dao;

import java.util.LinkedList;

import main.java.com.msz.entity.Department;
import main.java.com.msz.entity.Position;
import main.java.com.msz.entity.PositionAndDepartment;
import main.java.com.msz.entity.Training;
import main.java.com.msz.entity.UserDetail;
import main.java.com.msz.mapperinterface.AdminMapper;

import main.java.com.msz.utils.GetObject;

import org.springframework.context.ApplicationContext;
import org.springframework.stereotype.Repository;

@Repository(value="admindao")
public class AdminDao {
	private static ApplicationContext app = GetObject.setUp();
	private static AdminMapper adminMapper = (AdminMapper) app
			.getBean("adminMapper");
	public void fireStuff(Integer u_id) {
		// TODO Auto-generated method stub
		adminMapper.fireStuff(u_id);
	}
	
	public void deleteUserDetail(Integer u_id){
       adminMapper.deleteUserDetail(u_id);		
	}

	public LinkedList<UserDetail> checkPositionAndStuff() {
		// TODO Auto-generated method stub
		return adminMapper.checkPositionAndStuff();
	}

	public LinkedList<Department> getAllDepartment() {
		// TODO Auto-generated method stub
		return adminMapper.getAllDepartment();
	}

	public LinkedList<Position> getAllPosition() {
		// TODO Auto-generated method stub
		return adminMapper.getAllPosition();
	}

	public LinkedList<Training> getAllTraining() {
		// TODO Auto-generated method stub
		return adminMapper.getAllTraining();
	}

	public LinkedList<PositionAndDepartment> getAllPositionAndDepartment() {
		// TODO Auto-generated method stub
		return adminMapper.getAllPositionAndDepartment();
	}

	public void deletePosition(Integer p_id) {
		// TODO Auto-generated method stub
		 adminMapper.deletePosition(p_id);
	}

	public void addPosition(Position position) {
		// TODO Auto-generated method stub
		adminMapper.addPosition(position);
	}

}

package main.java.com.msz.dao;

import java.util.HashMap;
import java.util.LinkedList;

import main.java.com.msz.entity.Accepted;
import main.java.com.msz.entity.UserDetail;
import main.java.com.msz.mapperinterface.ManagerMapper;
import main.java.com.msz.utils.GetObject;

import org.springframework.context.ApplicationContext;
import org.springframework.stereotype.Repository;

@Repository(value = "managerDao")
public class ManagerDao {
	private static ApplicationContext app = GetObject.setUp();
	private static ManagerMapper managerMapper = (ManagerMapper) app
			.getBean("managerMapper");

	public int insertAccepted(Accepted accepted) {
		return managerMapper.insertAccepted(accepted);
	}

	public int updateCheck(Integer managerid) {
		return managerMapper.updateCheck(managerid);
	}

	public int updateInterviewMessage(HashMap<String, Object> map) {
		return managerMapper.updateInterviewMessage(map);
	}
	public int updateHireMessage(HashMap<String, Object> map) {
		return managerMapper.updateHireMessage(map);
	}

	public LinkedList<UserDetail> getAllusDetails() {
		return managerMapper.getAllUserDetails();
	}

	public String getDepartmentById(Integer department) {

		return managerMapper.getDepartmentById(department);
	}

	public String getPositionById(Integer position) {

		return managerMapper.getPosition(position);
	}

	public LinkedList<UserDetail> getListOfUserDetailByManager(Integer managerId) {
		return managerMapper.getListOfUserDetailByManager(managerId);
	}
	public int updateUserLevel(Integer u_id){
		return managerMapper.updateUserLevel(u_id);
		
	}

	public LinkedList<UserDetail> checkStuff(Integer u_id) {
		// TODO Auto-generated method stub
		return managerMapper.checkStuff(u_id);
	}
	
}

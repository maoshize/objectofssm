package main.java.com.msz.mapperinterface;

import java.util.HashMap;
import java.util.LinkedList;

import main.java.com.msz.entity.Accepted;
import main.java.com.msz.entity.UserDetail;

public interface ManagerMapper {
	//对accepted表的一系列操作
		//插入记录
		public int insertAccepted(Accepted accepted);
		//修改查看字段
		public int updateCheck(Integer managerid);
		//修改是否面试相关状态
		public int updateInterviewMessage(HashMap<String, Object> map);
		//修改是否录用相关状态
		public int updateHireMessage(HashMap<String, Object> map);
		//查询全部投递的简历
		public LinkedList<UserDetail> getAllUserDetails();
		//查询部门
		public String getDepartmentById(Integer department);
		//查询职位
		public String getPosition(Integer position);
		//按照managerid查询相应的应聘者简历
		public LinkedList<UserDetail> getListOfUserDetailByManager(Integer managerId);
		//修改应聘者用户等级
		public int updateUserLevel(Integer u_id);
		public LinkedList<UserDetail> checkStuff(Integer u_id);
		
}

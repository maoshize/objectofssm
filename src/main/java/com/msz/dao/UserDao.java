package main.java.com.msz.dao;

import java.util.HashMap;
import java.util.LinkedList;

import main.java.com.msz.entity.Accepted;
import main.java.com.msz.entity.User;
import main.java.com.msz.entity.UserDetail;
import main.java.com.msz.mapperinterface.UserMapper;
import main.java.com.msz.utils.GetObject;



import org.springframework.context.ApplicationContext;
import org.springframework.stereotype.Repository;


@Repository(value="userDao")
public class UserDao  {
	private static ApplicationContext app =GetObject.setUp();
	private static UserMapper userMapper =(UserMapper)app.getBean("userMapper");
	public LinkedList<User> findAllUser(){
		
		return userMapper.findAllUsers();
	}
	public int insertUser(User user){
		return userMapper.insertUser(user);
	}
	public User findUserByName(String u_name){
		return userMapper.findUserByName(u_name);
	}
	public UserDetail findUserDetailById(Integer u_id){
		return userMapper.findDetailById(u_id);
	}
	public int insertUserDetail(UserDetail userDetail){
		return userMapper.insertUserDetail(userDetail);	
	}
	public int updateUserDetail(UserDetail userDetail){
		return userMapper.updateUserDetail(userDetail);
	}
public String getDepartmentById(Integer department){
		
		return userMapper.getDepartmentById(department);
	}
public String getPositionById(Integer position){
		
		return userMapper.getPosition(position);
	}
public LinkedList<Accepted> checkMessage(Integer u_id){
	return userMapper.checkMessage(u_id);
}
public int changePassword(HashMap<String, String> map) {
	return userMapper.changePassword(map);
	
}
}

package main.java.com.msz.mapperinterface;



import java.util.HashMap;
import java.util.LinkedList;

import main.java.com.msz.entity.Accepted;
import main.java.com.msz.entity.User;
import main.java.com.msz.entity.UserDetail;

public interface UserMapper {
	//查询全部用户
	public LinkedList<User> findAllUsers();
	//查询指定用户
	public User findUserByName(String u_name);
	//插入用户
	public int insertUser(User user);
	//查询detail
	public UserDetail findDetailById(Integer u_id);
	//插入userdetail
	public int insertUserDetail(UserDetail userDetail);
	//修改userdetail
	public int updateUserDetail(UserDetail userDetail);
	//查询部门
	public String getDepartmentById(Integer department);
    //查询职位
	public String getPosition(Integer position);
	//查询message
	public LinkedList<Accepted> checkMessage(Integer u_id);
	//修改用户密码
	public int changePassword(HashMap<String, String> map);
}

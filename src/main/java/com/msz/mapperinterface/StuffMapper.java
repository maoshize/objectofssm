package main.java.com.msz.mapperinterface;

import java.util.HashMap;
import java.util.LinkedList;

import main.java.com.msz.entity.Dissent;
import main.java.com.msz.entity.Rewards;
import main.java.com.msz.entity.Wages;
import main.java.com.msz.entity.Work;

public interface StuffMapper {
	// 员工上班打卡
	public int changeOnWork(HashMap<String, Object> map);

	// 员工下班打卡
	public int changeOffWork(HashMap<String, Object> map);

	// 查询员工的考勤记录
	public LinkedList<Work> getWorkRecordByUid(Integer u_id);

	// 获得u_id员工的奖惩记录
	public LinkedList<Rewards> getAllRewards(Integer u_id);

	// 获得u_id员工的工资记录
	public LinkedList<Wages> getAllWages(Integer u_id);

	// 获得员工提出的工资异议
	public LinkedList<Dissent> checkDissent(Integer u_id);

	// 插入员工的工资异议
	public void addDissent(HashMap<String, Object> map);
}

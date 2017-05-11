package main.java.com.msz.dao;

import java.util.HashMap;
import java.util.LinkedList;

import main.java.com.msz.entity.Dissent;
import main.java.com.msz.entity.Rewards;
import main.java.com.msz.entity.Wages;
import main.java.com.msz.entity.Work;
import main.java.com.msz.mapperinterface.StuffMapper;
import main.java.com.msz.utils.GetObject;

import org.springframework.context.ApplicationContext;
import org.springframework.stereotype.Repository;

@Repository(value="stuffdao")
public class StuffDao {
	private static ApplicationContext app =GetObject.setUp();
	private static StuffMapper stuffMapper =(StuffMapper)app.getBean("stuffMapper");
	public int onWork(HashMap<String, Object> map) {
		return stuffMapper.changeOnWork(map);	
	}
	public int offWork(HashMap<String, Object> map) {
		// TODO Auto-generated method stub
		return stuffMapper.changeOffWork(map);
	}
	public LinkedList<Work> getWorkRecordByUid(Integer u_id) {
		// TODO Auto-generated method stub
		return stuffMapper.getWorkRecordByUid(u_id);
	}
	public LinkedList<Rewards> getAllRewards(Integer u_id) {
		// TODO Auto-generated method stub
		return stuffMapper.getAllRewards(u_id);
	}
	public LinkedList<Wages> getAllWages(Integer u_id) {
		// TODO Auto-generated method stub
		return stuffMapper.getAllWages(u_id);
	}
	public LinkedList<Dissent> checkDissent(Integer u_id) {
		// TODO Auto-generated method stub
		return stuffMapper.checkDissent(u_id);
	}
	public void addDissent(HashMap<String, Object> map) {
		// TODO Auto-generated method stub
		stuffMapper.addDissent(map);
	}

}

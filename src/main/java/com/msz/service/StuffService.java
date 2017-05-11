package main.java.com.msz.service;

import java.sql.Time;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.sql.Date;
import java.util.HashMap;
import java.util.LinkedList;

import main.java.com.msz.dao.StuffDao;
import main.java.com.msz.entity.Dissent;
import main.java.com.msz.entity.Rewards;
import main.java.com.msz.entity.Wages;
import main.java.com.msz.entity.Work;

import main.java.com.msz.utils.GetObject;

import org.springframework.context.ApplicationContext;
import org.springframework.stereotype.Service;

@Service(value = "stuffservice")
public class StuffService {
	private static ApplicationContext app = GetObject.setUp();
	private static StuffDao stuffDao = (StuffDao) app.getBean("stuffdao");

	public int onWork(Integer u_id) {
		HashMap<String, Object> map = new HashMap<String, Object>();

		java.util.Date daytime = new java.util.Date();
		Long daytimeLong = daytime.getTime();
		Time time = new Time(daytimeLong);
		Date date = new Date(daytimeLong);
		map.put("u_id", u_id);
		map.put("date", date);
		map.put("time", time);
		SimpleDateFormat sdf = new SimpleDateFormat("hh:MM:ss");
		java.util.Date yqdate = null;
		try {
			yqdate = sdf.parse("08:00:00");
		} catch (ParseException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		if (time.after(yqdate)) {
			map.put("w_late", "y");
		} else {
			map.put("w_late", "n");
		}
		return stuffDao.onWork(map);

	}

	public int offWork(Integer u_id) {
		HashMap<String, Object> map = new HashMap<String, Object>();
		java.util.Date daytime = new java.util.Date();
		Long daytimeLong = daytime.getTime();
		Time time = new Time(daytimeLong);
		Date date = new Date(daytimeLong);
		map.put("u_id", u_id);
		map.put("date", date);
		map.put("time", time);
		SimpleDateFormat sdf = new SimpleDateFormat("hh:MM:ss");
		java.util.Date yqdate = null;
		try {
			yqdate = sdf.parse("18:00:00");
		} catch (ParseException e) {
			e.printStackTrace();
		}
		if (time.before(yqdate)) {
			map.put("w_early", "y");
		} else {
			map.put("w_early", "n");
		}
		return stuffDao.offWork(map);
	}

	public LinkedList<Work> checkWorkRecord(Integer u_id) {
		return stuffDao.getWorkRecordByUid(u_id);
	}

	// 按照年月份查找奖惩记录
	public LinkedList<Rewards> checkRewards(Integer work_rewards_month,
			Integer work_rewards_year, Integer u_id) {
		LinkedList<Rewards> listOfreRewards = new LinkedList<Rewards>();
		listOfreRewards.clear();
		LinkedList<Rewards> listOfAllRewards = stuffDao.getAllRewards(u_id);
		for (Rewards rewards : listOfAllRewards) {
			Date date = rewards.getR_time();
			SimpleDateFormat sdf = new SimpleDateFormat();
			sdf.applyPattern("yyyy");
			String formatyear = sdf.format(date);
			System.out.println(formatyear);
			sdf.applyPattern("MM");
			String formatmonth = sdf.format(date);
			System.out.println(formatmonth);
			Integer year = new Integer(formatyear);
			Integer month = new Integer(formatmonth);
			if (work_rewards_month.equals(month)
					&& work_rewards_year.equals(year)) {
				listOfreRewards.add(rewards);
			}
		}
		return listOfreRewards;
	}

	public LinkedList<Wages> checkWages(Integer work_wages_month,
			Integer work_wages_year, Integer u_id) {
		LinkedList<Wages> listOfWages = new LinkedList<Wages>();
		listOfWages.clear();
		LinkedList<Wages> listOfAllWages = stuffDao.getAllWages(u_id);
		for (Wages wages : listOfAllWages) {
			Date date = wages.getW_time();
			SimpleDateFormat sdf = new SimpleDateFormat();
			sdf.applyPattern("yyyy");
			String formatyear = sdf.format(date);
			System.out.println(formatyear);
			sdf.applyPattern("MM");
			String formatmonth = sdf.format(date);
			System.out.println(formatmonth);
			Integer year = new Integer(formatyear);
			Integer month = new Integer(formatmonth);
			if (work_wages_month.equals(month) && work_wages_year.equals(year)) {
				listOfWages.add(wages);
			}
		}
		return listOfWages;
	}

	public LinkedList<Dissent> checkDissent(Integer u_id) {
		// TODO Auto-generated method stub
		return stuffDao.checkDissent(u_id);

	}

	public void addDissent(Date wageDate, String reason, Integer u_id) {
		HashMap<String, Object> map = new HashMap<String, Object>();
		Date now = new Date(new java.util.Date().getTime());
		map.put("wageDate", wageDate);
		map.put("reason", reason);
		map.put("u_id", u_id);
		map.put("now", now);
		stuffDao.addDissent(map);
	}
}

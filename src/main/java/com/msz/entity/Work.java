package main.java.com.msz.entity;

import java.io.Serializable;
import java.sql.Date;
import java.sql.Time;

import org.springframework.stereotype.Component;
@Component(value="work")
public class Work implements Serializable{
	/**
	 * 
	 */
	private static final long serialVersionUID = -7001182672583881609L;
	private Date w_day;
	private Time w_on;
	private Time w_off;
	private String w_late;
	private String w_early;
	private Integer w_u_id;
	public Date getW_day() {
		return w_day;
	}
	public void setW_day(Date w_day) {
		this.w_day = w_day;
	}
	public Time getW_on() {
		return w_on;
	}
	public void setW_on(Time w_on) {
		this.w_on = w_on;
	}
	public Time getW_off() {
		return w_off;
	}
	public void setW_off(Time w_off) {
		this.w_off = w_off;
	}
	public String getW_late() {
		return w_late;
	}
	public void setW_late(String w_late) {
		this.w_late = w_late;
	}
	public String getW_early() {
		return w_early;
	}
	public void setW_early(String w_early) {
		this.w_early = w_early;
	}
	public Integer getW_u_id() {
		return w_u_id;
	}
	public void setW_u_id(Integer w_u_id) {
		this.w_u_id = w_u_id;
	}
	@Override
	public String toString() {
		return "Work [w_day=" + w_day + ", w_on=" + w_on + ", w_off=" + w_off
				+ ", w_late=" + w_late + ", w_early=" + w_early + ", w_u_id="
				+ w_u_id + "]";
	}
	
}

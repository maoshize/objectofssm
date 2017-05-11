package main.java.com.msz.entity;

import java.io.Serializable;

import java.util.Date;

import org.springframework.stereotype.Component;
@Component(value="accepted")
public class Accepted implements Serializable{
	/**
	 * 
	 */
	private static final long serialVersionUID = -7651148099948961780L;
	private Integer a_ud_id;
	private Date a_deliverTime;
	private String a_check;
	private String a_interview;
	private Date a_interviewTime;
	private String a_hire;
	private Date a_hireTime;
	private String a_delete;
	private Integer a_manager;
	public Integer getA_ud_id() {
		return a_ud_id;
	}
	public void setA_ud_id(Integer a_ud_id) {
		this.a_ud_id = a_ud_id;
	}
	public Date getA_deliverTime() {
		return a_deliverTime;
	}
	public void setA_deliverTime(Date date) {
		this.a_deliverTime =  date;
	}
	public String getA_check() {
		return a_check;
	}
	public void setA_check(String a_check) {
		this.a_check = a_check;
	}
	public String getA_interview() {
		return a_interview;
	}
	public void setA_interview(String a_interview) {
		this.a_interview = a_interview;
	}
	public Date getA_interviewTime() {
		return a_interviewTime;
	}
	public void setA_interviewTime(Date a_interviewTime) {
		this.a_interviewTime = a_interviewTime;
	}
	public String getA_hire() {
		return a_hire;
	}
	public void setA_hire(String a_hire) {
		this.a_hire = a_hire;
	}
	public Date getA_hireTime() {
		return a_hireTime;
	}
	public void setA_hireTime(Date a_hireTime) {
		this.a_hireTime = a_hireTime;
	}
	public String getA_delete() {
		return a_delete;
	}
	public void setA_delete(String a_delete) {
		this.a_delete = a_delete;
	}
	public Integer getA_manager() {
		return a_manager;
	}
	public void setA_manager(Integer a_manager) {
		this.a_manager = a_manager;
	}
	@Override
	public String toString() {
		return "Accepted [a_ud_id=" + a_ud_id + ", a_deliverTime="
				+ a_deliverTime + ", a_check=" + a_check + ", a_interview="
				+ a_interview + ", a_interviewTime=" + a_interviewTime
				+ ", a_hire=" + a_hire + ", a_hireTime=" + a_hireTime
				+ ", a_delete=" + a_delete + ", a_manager=" + a_manager + "]";
	}
	
	
}

package main.java.com.msz.entity;

import java.io.Serializable;

public class PositionAndDepartment implements Serializable{
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 5097481274479400775L;
	private String p_position;
	 private Double p_salary;
	 private Integer p_id;
	 private String d_department;
	public String getP_position() {
		return p_position;
	}
	public void setP_position(String p_position) {
		this.p_position = p_position;
	}
	public Double getP_salary() {
		return p_salary;
	}
	public void setP_salary(Double p_salary) {
		this.p_salary = p_salary;
	}
	public Integer getP_id() {
		return p_id;
	}
	public void setP_id(Integer p_id) {
		this.p_id = p_id;
	}
	public String getD_department() {
		return d_department;
	}
	public void setD_department(String d_department) {
		this.d_department = d_department;
	}
	@Override
	public String toString() {
		return "PositionAndDepartment [p_position=" + p_position
				+ ", p_salary=" + p_salary + ", p_id=" + p_id
				+ ", d_department=" + d_department + "]";
	}
	
	 
}

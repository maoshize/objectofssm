package main.java.com.msz.entity;

import java.io.Serializable;

import org.springframework.stereotype.Component;

@Component(value="department")
public class Department implements Serializable{
	/**
	 * 
	 */
	private static final long serialVersionUID = -7420920804283223553L;
	private Integer d_id;
	private String d_department;

	public String getD_department() {
		return d_department;
	}

	public void setD_department(String d_department) {
		this.d_department = d_department;
	}
	@Override
	public String toString() {
		return "Department [d_id=" + d_id + ", d_department=" + d_department
				+ "]";
	}

	public Integer getD_id() {
		return d_id;
	}

	public void setD_id(Integer d_id) {
		this.d_id = d_id;
	}
	
}

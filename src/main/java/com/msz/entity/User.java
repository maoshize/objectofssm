package main.java.com.msz.entity;

import java.io.Serializable;

import org.springframework.stereotype.Component;
@Component(value="user")
public class User implements Serializable {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1455002630558020103L;
	private Integer u_id;
	private String u_name;
	private String u_pass;
	private Integer u_level;
	public String getU_name() {
		return u_name;
	}
	public void setU_name(String u_name) {
		this.u_name = u_name;
	}
	public String getU_pass() {
		return u_pass;
	}
	public void setU_pass(String u_pass) {
		this.u_pass = u_pass;
	}
	public Integer getU_level() {
		return u_level;
	}
	public void setU_level(Integer u_level) {
		this.u_level = u_level;
	}
	@Override
	public String toString() {
		return "User [u_name=" + u_name + ", u_pass=" + u_pass + ", u_level="
				+ u_level + "]";
	}
	public Integer getU_id() {
		return u_id;
	}
	public void setU_id(Integer u_id) {
		this.u_id = u_id;
	}
	
}

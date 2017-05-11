package main.java.com.msz.entity;

import java.io.Serializable;
import java.sql.Date;

import org.springframework.stereotype.Component;
@Component(value="dissent")
public class Dissent implements Serializable{
	/**
	 * 
	 */
	private static final long serialVersionUID = -8458363577045860184L;
	private Date d_time;
	private Date d_w_time;
	private String d_dissent;
	private Integer d_u_id;
	public Date getD_time() {
		return d_time;
	}
	public void setD_time(Date d_time) {
		this.d_time = d_time;
	}
	public Date getD_w_time() {
		return d_w_time;
	}
	public void setD_w_time(Date d_w_time) {
		this.d_w_time = d_w_time;
	}
	public String getD_dissent() {
		return d_dissent;
	}
	public void setD_dissent(String d_dissent) {
		this.d_dissent = d_dissent;
	}
	public Integer getD_u_id() {
		return d_u_id;
	}
	public void setD_u_id(Integer d_u_id) {
		this.d_u_id = d_u_id;
	}
	@Override
	public String toString() {
		return "Dissent [d_time=" + d_time + ", d_w_time=" + d_w_time
				+ ", d_dissent=" + d_dissent + ", d_u_id=" + d_u_id + "]";
	}
	
}

package main.java.com.msz.entity;

import java.io.Serializable;
import java.sql.Date;

import org.springframework.stereotype.Component;
@Component(value="training")
public class Training implements Serializable{
	/**
	 * 
	 */
	private static final long serialVersionUID = -1752293373517858441L;
	private String t_name;
	private Date t_time;
	private Integer t_d_id;
	public String getT_name() {
		return t_name;
	}
	public void setT_name(String t_name) {
		this.t_name = t_name;
	}
	public Date getT_time() {
		return t_time;
	}
	public void setT_time(Date t_time) {
		this.t_time = t_time;
	}
	public Integer getT_d_id() {
		return t_d_id;
	}
	public void setT_d_id(Integer t_d_id) {
		this.t_d_id = t_d_id;
	}
	@Override
	public String toString() {
		return "Training [t_name=" + t_name + ", t_time=" + t_time
				+ ", t_d_id=" + t_d_id + "]";
	}
	
}

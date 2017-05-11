package main.java.com.msz.entity;

import java.io.Serializable;
import java.sql.Date;

import org.springframework.stereotype.Component;

@Component(value="wages")
public class Wages implements Serializable{
	/**
	 * 
	 */
	private static final long serialVersionUID = -8646072673741673197L;
	private Double w_wages;
	private Double w_performance;
	private Double w_over;
	private Double w_rewards;
	private Date w_time;
	private Double w_count;
	private Integer w_u_id;
	public Double getW_wages() {
		return w_wages;
	}
	public void setW_wages(Double w_wages) {
		this.w_wages = w_wages;
	}
	public Double getW_performance() {
		return w_performance;
	}
	public void setW_performance(Double w_performance) {
		this.w_performance = w_performance;
	}
	public Double getW_over() {
		return w_over;
	}
	public void setW_over(Double w_over) {
		this.w_over = w_over;
	}
	public Double getW_rewards() {
		return w_rewards;
	}
	public void setW_rewards(Double w_rewards) {
		this.w_rewards = w_rewards;
	}
	public Date getW_time() {
		return w_time;
	}
	public void setW_time(Date w_time) {
		this.w_time = w_time;
	}
	public Double getW_count() {
		return w_count;
	}
	public void setW_count(Double w_count) {
		this.w_count = w_count;
	}
	public Integer getW_u_id() {
		return w_u_id;
	}
	public void setW_u_id(Integer w_u_id) {
		this.w_u_id = w_u_id;
	}
	@Override
	public String toString() {
		return "Wages [w_wages=" + w_wages + ", w_performance=" + w_performance
				+ ", w_over=" + w_over + ", w_rewards=" + w_rewards
				+ ", w_time=" + w_time + ", w_count=" + w_count + ", w_u_id="
				+ w_u_id + "]";
	}
	
}

package main.java.com.msz.entity;

import java.io.Serializable;

import org.springframework.stereotype.Component;

@Component(value="performance")
public class Performance implements Serializable{
	/**
	 * 
	 */
	private static final long serialVersionUID = 3461496746111681411L;
	private String p_performance;
	private Double p_rewards;
	private String p_time;
	private Integer p_u_id;
	public String getP_performance() {
		return p_performance;
	}
	public void setP_performance(String p_performance) {
		this.p_performance = p_performance;
	}
	public Double getP_rewards() {
		return p_rewards;
	}
	public void setP_rewards(Double p_rewards) {
		this.p_rewards = p_rewards;
	}
	public String getP_time() {
		return p_time;
	}
	public void setP_time(String p_time) {
		this.p_time = p_time;
	}
	public Integer getP_u_id() {
		return p_u_id;
	}
	public void setP_u_id(Integer p_u_id) {
		this.p_u_id = p_u_id;
	}
	@Override
	public String toString() {
		return "Performance [p_performance=" + p_performance + ", p_rewards="
				+ p_rewards + ", p_time=" + p_time + ", p_u_id=" + p_u_id + "]";
	}
	
}

package main.java.com.msz.entity;

import java.io.Serializable;
import java.sql.Date;

import org.springframework.stereotype.Component;
@Component(value="rewards")
public class Rewards implements Serializable{
/**
	 * 
	 */
	private static final long serialVersionUID = 3681697550085516265L;
private String r_reason;
private Double r_rewards;
private Date r_time;
private String r_type;
private Integer r_u_id;
public String getR_reason() {
	return r_reason;
}
public void setR_reason(String r_reason) {
	this.r_reason = r_reason;
}
public Double getR_rewards() {
	return r_rewards;
}
public void setR_rewards(Double r_rewards) {
	this.r_rewards = r_rewards;
}
public Date getR_time() {
	return r_time;
}
public void setR_time(Date r_time) {
	this.r_time = r_time;
}
public String getR_type() {
	return r_type;
}
public void setR_type(String r_type) {
	this.r_type = r_type;
}
public Integer getR_u_id() {
	return r_u_id;
}
public void setR_u_id(Integer r_u_id) {
	this.r_u_id = r_u_id;
}
@Override
public String toString() {
	return "Rewards [r_reason=" + r_reason + ", r_rewards=" + r_rewards
			+ ", r_time=" + r_time + ", r_type=" + r_type + ", r_u_id="
			+ r_u_id + "]";
}


}

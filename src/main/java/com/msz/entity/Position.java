package main.java.com.msz.entity;

import java.io.Serializable;

import org.springframework.stereotype.Component;

@Component(value="position")
public class Position implements Serializable{
 /**
	 * 
	 */
	private static final long serialVersionUID = 7144482582225177273L;
private String p_position;
 private Double p_salary;
 private Integer p_d_id;
 private Integer p_id;
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
public Integer getP_d_id() {
	return p_d_id;
}
public void setP_d_id(Integer p_d_id) {
	this.p_d_id = p_d_id;
}
@Override
public String toString() {
	return "Position [p_position=" + p_position + ", p_salary=" + p_salary
			+ ", p_d_id=" + p_d_id + "]";
}
public Integer getP_id() {
	return p_id;
}
public void setP_id(Integer p_id) {
	this.p_id = p_id;
}
 
}

package main.java.com.msz.entity;

import java.io.Serializable;
import java.util.Date;

import org.springframework.stereotype.Component;
@Component(value="userDetail")
public class UserDetail implements Serializable{
	/**
	 * 
	 */
	private static final long serialVersionUID = 6243304731511557204L;
	private Integer ud_id;
	private String ud_realName;
	private Integer ud_age;
	private String ud_gender;
	private String ud_nation;
	private String ud_native;
	private String ud_education;
	private String ud_experience;
	private String ud_school;
	private String ud_health;
	private String ud_phone;
	private String ud_email;
	private String ud_address;
	private String ud_hobby;
	private Date ud_entryTime;
	private Date ud_leaveTime;
	private Integer ud_p_id;
	private Integer ud_u_id;
	public String getUd_realName() {
		return ud_realName;
	}
	public void setUd_realName(String ud_realName) {
		this.ud_realName = ud_realName;
	}
	public Integer getUd_age() {
		return ud_age;
	}
	public void setUd_age(Integer ud_age) {
		this.ud_age = ud_age;
	}
	public String getUd_gender() {
		return ud_gender;
	}
	public void setUd_gender(String ud_gender) {
		this.ud_gender = ud_gender;
	}
	public String getUd_nation() {
		return ud_nation;
	}
	public void setUd_nation(String ud_nation) {
		this.ud_nation = ud_nation;
	}
	public String getUd_native() {
		return ud_native;
	}
	public void setUd_native(String ud_native) {
		this.ud_native = ud_native;
	}
	public String getUd_education() {
		return ud_education;
	}
	public void setUd_education(String ud_education) {
		this.ud_education = ud_education;
	}
	public String getUd_experience() {
		return ud_experience;
	}
	public void setUd_experience(String ud_experience) {
		this.ud_experience = ud_experience;
	}
	public String getUd_school() {
		return ud_school;
	}
	public void setUd_school(String ud_school) {
		this.ud_school = ud_school;
	}
	public String getUd_health() {
		return ud_health;
	}
	public void setUd_health(String ud_health) {
		this.ud_health = ud_health;
	}
	public String getUd_phone() {
		return ud_phone;
	}
	public void setUd_phone(String ud_phone) {
		this.ud_phone = ud_phone;
	}
	public String getUd_email() {
		return ud_email;
	}
	public void setUd_email(String ud_email) {
		this.ud_email = ud_email;
	}
	public String getUd_address() {
		return ud_address;
	}
	public void setUd_address(String ud_address) {
		this.ud_address = ud_address;
	}
	public String getUd_hobby() {
		return ud_hobby;
	}
	public void setUd_hobby(String ud_hobby) {
		this.ud_hobby = ud_hobby;
	}
	public Date getUd_entryTime() {
		return ud_entryTime;
	}
	public void setUd_entryTime(Date date) {
		this.ud_entryTime = date;
	}
	public Date getUd_leaveTime() {
		return ud_leaveTime;
	}
	public void setUd_leaveTime(Date ud_leaveTime) {
		this.ud_leaveTime = ud_leaveTime;
	}
	public Integer getUd_p_id() {
		return ud_p_id;
	}
	public void setUd_p_id(Integer ud_p_id) {
		this.ud_p_id = ud_p_id;
	}
	public Integer getUd_u_id() {
		return ud_u_id;
	}
	public void setUd_u_id(Integer ud_u_id) {
		this.ud_u_id = ud_u_id;
	}
	@Override
	public String toString() {
		return "UserDetail [ud_realName=" + ud_realName + ", ud_age=" + ud_age
				+ ", ud_gender=" + ud_gender + ", ud_nation=" + ud_nation
				+ ", ud_native=" + ud_native + ", ud_education=" + ud_education
				+ ", ud_experience=" + ud_experience + ", ud_school="
				+ ud_school + ", ud_health=" + ud_health + ", ud_phone="
				+ ud_phone + ", ud_email=" + ud_email + ", ud_address="
				+ ud_address + ", ud_hobby=" + ud_hobby + ", ud_entryTime="
				+ ud_entryTime + ", ud_leaveTime=" + ud_leaveTime
				+ ", ud_p_id=" + ud_p_id + ", ud_u_id=" + ud_u_id + "]";
	}
	public Integer getUd_id() {
		return ud_id;
	}
	public void setUd_id(Integer ud_id) {
		this.ud_id = ud_id;
	}
	
	
	
}

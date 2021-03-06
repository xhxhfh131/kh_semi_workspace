package appr.dto;

import java.util.Date;

public class Appr {

	private int apprl_no;
	private int user_no;
	private int mid_auth;
	private int final_auth;
	private int aprvl_state;
	private Date create_date;
	private Date final_date;
	private int aprvl_type;
	private String aprvl_title;
	private String aprvl_article;
	private int table_no;
	private int send_user_no;
	@Override
	public String toString() {
		return "Appr [apprl_no=" + apprl_no + ", user_no=" + user_no + ", mid_auth=" + mid_auth + ", final_auth="
				+ final_auth + ", aprvl_state=" + aprvl_state + ", create_date=" + create_date + ", final_date="
				+ final_date + ", aprvl_type=" + aprvl_type + ", aprvl_title=" + aprvl_title + ", aprvl_article="
				+ aprvl_article + ", table_no=" + table_no + ", send_user_no=" + send_user_no + "]";
	}
	public int getApprl_no() {
		return apprl_no;
	}
	public void setApprl_no(int apprl_no) {
		this.apprl_no = apprl_no;
	}
	public int getUser_no() {
		return user_no;
	}
	public void setUser_no(int user_no) {
		this.user_no = user_no;
	}
	public int getMid_auth() {
		return mid_auth;
	}
	public void setMid_auth(int mid_auth) {
		this.mid_auth = mid_auth;
	}
	public int getFinal_auth() {
		return final_auth;
	}
	public void setFinal_auth(int final_auth) {
		this.final_auth = final_auth;
	}
	public int getAprvl_state() {
		return aprvl_state;
	}
	public void setAprvl_state(int aprvl_state) {
		this.aprvl_state = aprvl_state;
	}
	public Date getCreate_date() {
		return create_date;
	}
	public void setCreate_date(Date create_date) {
		this.create_date = create_date;
	}
	public Date getFinal_date() {
		return final_date;
	}
	public void setFinal_date(Date final_date) {
		this.final_date = final_date;
	}
	public int getAprvl_type() {
		return aprvl_type;
	}
	public void setAprvl_type(int aprvl_type) {
		this.aprvl_type = aprvl_type;
	}
	public String getAprvl_title() {
		return aprvl_title;
	}
	public void setAprvl_title(String aprvl_title) {
		this.aprvl_title = aprvl_title;
	}
	public String getAprvl_article() {
		return aprvl_article;
	}
	public void setAprvl_article(String aprvl_article) {
		this.aprvl_article = aprvl_article;
	}
	public int getTable_no() {
		return table_no;
	}
	public void setTable_no(int table_no) {
		this.table_no = table_no;
	}
	public int getSend_user_no() {
		return send_user_no;
	}
	public void setSend_user_no(int send_user_no) {
		this.send_user_no = send_user_no;
	}

	
	
	
}

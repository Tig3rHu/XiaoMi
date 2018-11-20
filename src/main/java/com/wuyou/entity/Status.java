package com.wuyou.entity;

import java.io.Serializable;

public class Status implements Serializable {
	private static final long serialVersionUID = -903932493645375749L;
	private int statusCode;
	private String message;
	private Integer userid;
	public Integer getUserid() {
		return userid;
	}
	public void setUserid(Integer userid) {
		this.userid = userid;
	}
	public int getStatusCode() {
		return statusCode;
	}
	public void setStatusCode(int statusCode) {
		this.statusCode = statusCode;
	}
	public String getMessage() {
		return message;
	}
	public void setMessage(String message) {
		this.message = message;
	}
}

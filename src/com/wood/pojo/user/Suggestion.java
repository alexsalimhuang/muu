package com.wood.pojo.user;

import java.io.Serializable;

/**
 * @类名：Suggestion
 * @功能：建议PO 
 * @作者：吴迪
 * @时间：2016年4月22日
 * @地点：成都
 */
public class Suggestion implements Serializable{

	/**
	 * @desc 建议ID
	 */
	private Integer suID;
	
	/**
	 * @desc 建议内容
	 */
	private String suContent;
	
	/**
	 * @desc 用户PO
	 */
	private User user;

	public Integer getSuID() {
		return suID;
	}

	public void setSuID(Integer suID) {
		this.suID = suID;
	}

	public String getSuContent() {
		return suContent;
	}

	public void setSuContent(String suContent) {
		this.suContent = suContent;
	}

	public User getUser() {
		return user;
	}

	public void setUser(User user) {
		this.user = user;
	}
	
}

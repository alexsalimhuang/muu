package com.wood.pojo.game;

import java.io.Serializable;
/**
 * 
 * @类名：Account
 * @功能：体验账户PO
 * @作者：黄博
 * @时间：2016年4月22日
 * @地点：成都
 *
 */
public class Account implements Serializable {
	/**
	 * @desc 体验账户ID
	 */
	private Integer acID;
	
	/**
	 * @desc 体验账户名
	 */
	private String acName;
	
	/**
	 * @desc 体验账户密码
	 */
	private String acPass;
	
	/**
	 * @desc 游戏ID
	 */
	private Integer gID;
	
	/**
	 * @desc 体验账户开始时间
	 */
	private java.sql.Date acStartDate;
	
	/**
	 * @desc 体验账户结束时间
	 */
	private java.sql.Date acEndDate;

	public Integer getAcID() {
		return acID;
	}

	public void setAcID(Integer acID) {
		this.acID = acID;
	}

	public String getAcName() {
		return acName;
	}

	public void setAcName(String acName) {
		this.acName = acName;
	}

	public String getAcPass() {
		return acPass;
	}

	public void setAcPass(String acPass) {
		this.acPass = acPass;
	}

	public Integer getgID() {
		return gID;
	}

	public void setgID(Integer gID) {
		this.gID = gID;
	}

	public java.sql.Date getAcStartDate() {
		return acStartDate;
	}

	public void setAcStartDate(java.sql.Date acStartDate) {
		this.acStartDate = acStartDate;
	}

	public java.sql.Date getAcEndDate() {
		return acEndDate;
	}

	public void setAcEndDate(java.sql.Date acEndDate) {
		this.acEndDate = acEndDate;
	}
	
	
}

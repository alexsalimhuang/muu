package com.wood.pojo.user;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
/**
 * 
 * @类名：User
 * @功能：用户PO
 * @作者：黄博
 * @时间：2016年4月22日
 * @地点：成都
 *
 */
public class User implements Serializable {
	/**
	 * @desc 用户ID
	 */
	private Integer userID;
	
	/**
	 * @desc 用户名
	 */
	private String userName;
	
	/**
	 * @desc 用户密码
	 */
	private String userPass;
	
	/**
	 * @desc 用户积分
	 */
	private Integer userScore;
	
	/**
	 * @desc 用户等级
	 */
	private String userLvl;
	
	/**
	 * @desc 用户Email
	 */
	private String userEmail;
	
	/**
	 * @desc 用户信誉度
	 */
	private String userReputation;
	
	/**
	 * @desc 用户昵称
	 */
	private String userNickname;
	
	/**
	 * @desc 用户默认付款方式
	 */
	private String userDefaultPayType;
	
	/**
	 * @desc 用户性别
	 */
	private String userSex;
	
	/**
	 * @desc 用户头像
	 */
	private String userAvatar;
	
	/**
	 * @desc 用户电话
	 */
	private String userPhone;
	
	/**
	 * @desc 用户在线状态
	 */
	private Integer userStatus;
	
	/**
	 * @desc 用户身份证号
	 */
	private String userCardID;

	public Integer getUserID() {
		return userID;
	}

	public void setUserID(Integer userID) {
		this.userID = userID;
	}

	public String getUserName() {
		return userName;
	}

	public void setUserName(String userName) {
		this.userName = userName;
	}

	public String getUserPass() {
		return userPass;
	}

	public void setUserPass(String userPass) {
		this.userPass = userPass;
	}

	public Integer getUserScore() {
		return userScore;
	}

	public void setUserScore(Integer userScore) {
		this.userScore = userScore;
	}

	public String getUserLvl() {
		return userLvl;
	}

	public void setUserLvl(String userLvl) {
		this.userLvl = userLvl;
	}

	public String getUserEmail() {
		return userEmail;
	}

	public void setUserEmail(String userEmail) {
		this.userEmail = userEmail;
	}

	public String getUserReputation() {
		return userReputation;
	}

	public void setUserReputation(String userReputation) {
		this.userReputation = userReputation;
	}

	public String getUserNickname() {
		return userNickname;
	}

	public void setUserNickname(String userNickname) {
		this.userNickname = userNickname;
	}

	public String getUserDefaultPayType() {
		return userDefaultPayType;
	}

	public void setUserDefaultPayType(String userDefaultPayType) {
		this.userDefaultPayType = userDefaultPayType;
	}

	public String getUserSex() {
		return userSex;
	}

	public void setUserSex(String userSex) {
		this.userSex = userSex;
	}

	public String getUserAvatar() {
		return userAvatar;
	}

	public void setUserAvatar(String userAvatar) {
		this.userAvatar = userAvatar;
	}

	public String getUserPhone() {
		return userPhone;
	}

	public void setUserPhone(String userPhone) {
		this.userPhone = userPhone;
	}

	public Integer getUserStatus() {
		return userStatus;
	}

	public void setUserStatus(Integer userStatus) {
		this.userStatus = userStatus;
	}

	public String getUserCardID() {
		return userCardID;
	}

	public void setUserCardID(String userCardID) {
		this.userCardID = userCardID;
	}
	
	
}

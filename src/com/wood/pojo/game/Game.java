package com.wood.pojo.game;

import java.io.Serializable;

/**
 * 
 * @类名：Game
 * @功能：游戏PO
 * @作者：黄博
 * @时间：2016年4月22日
 * @地点：成都
 *
 */
public class Game implements Serializable {

	/**
	 * 
	 * @desc 游戏ID
	 */
	private Integer gID;

	/**
	 * 
	 * @desc 游戏名
	 */
	private String gName;

	/**
	 * 
	 * @desc 游戏简介
	 */
	private String gDesc;

	/**
	 * 
	 * @desc 游戏类型ID
	 */
	private Integer gtID;

	/**
	 * 
	 * @desc 游戏原价
	 */
	private Double gPrice;

	/**
	 * 
	 * @desc 游戏出租价格与原价的百分比
	 */
	private Double gRate;

	/**
	 * 
	 * @desc 游戏上架时间
	 */
	private java.sql.Date gOnDate;

	/**
	 * 
	 * @desc 游戏下架时间
	 */
	private java.sql.Date gOffDate;

	/**
	 * 
	 * @desc 游戏修改时间
	 */
	private java.util.Date gAlterTime;

	/**
	 * 
	 * @desc 游戏状态，上架/下架
	 */
	private Integer gStatus;

	/**
	 * 
	 * @desc 游戏发行商
	 */
	private Integer firmID;

	/**
	 * 
	 * @desc 游戏发售日期
	 */
	private java.sql.Date gSaleDate;

	public Integer getgID() {
		return gID;
	}

	public void setgID(Integer gID) {
		this.gID = gID;
	}

	public String getgName() {
		return gName;
	}

	public void setgName(String gName) {
		this.gName = gName;
	}

	public String getgDesc() {
		return gDesc;
	}

	public void setgDesc(String gDesc) {
		this.gDesc = gDesc;
	}

	public Integer getGtID() {
		return gtID;
	}

	public void setGtID(Integer gtID) {
		this.gtID = gtID;
	}

	public Double getgPrice() {
		return gPrice;
	}

	public void setgPricce(Double gPrice) {
		this.gPrice = gPrice;
	}

	public Double getgRate() {
		return gRate;
	}

	public void setgRate(Double gRate) {
		this.gRate = gRate;
	}

	public java.sql.Date getgOnDate() {
		return gOnDate;
	}

	public void setgOnDate(java.sql.Date gOnDate) {
		this.gOnDate = gOnDate;
	}

	public java.sql.Date getgOffDate() {
		return gOffDate;
	}

	public void setgOffDate(java.sql.Date gOffDate) {
		this.gOffDate = gOffDate;
	}

	public java.util.Date getgAlterTime() {
		return gAlterTime;
	}

	public void setgAlterTime(java.util.Date gAlterTime) {
		this.gAlterTime = gAlterTime;
	}

	public Integer getgStatus() {
		return gStatus;
	}

	public void setgStatus(Integer gStatus) {
		this.gStatus = gStatus;
	}

	public Integer getFirmID() {
		return firmID;
	}

	public void setFirmID(Integer firmID) {
		this.firmID = firmID;
	}

	public java.sql.Date getgSaleDate() {
		return gSaleDate;
	}

	public void setgSaleDate(java.sql.Date gSaleDate) {
		this.gSaleDate = gSaleDate;
	}

}
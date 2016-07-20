package com.wood.pojo.game;

import java.io.Serializable;
/**
 * 
 * @类名：GameType
 * @功能：游戏类型PO
 * @作者：黄博
 * @时间：2016年4月22日
 * @地点：成都
 *
 */
public class GameType implements Serializable {
	/**
	 * 
	 * @desc 游戏类型ID
	 */
	private Integer gtID;
	
	/**
	 * 
	 * @desc 游戏类型名称
	 */
	private	String gtName;
	
	/**
	 * 
	 * @desc 游戏类型描述
	 */
	private String gtDesc;

	public Integer getGtID() {
		return gtID;
	}

	public void setGtID(Integer gtID) {
		this.gtID = gtID;
	}

	public String getGtName() {
		return gtName;
	}

	public void setGtName(String gtName) {
		this.gtName = gtName;
	}

	public String getGtDesc() {
		return gtDesc;
	}

	public void setGtDesc(String gtDesc) {
		this.gtDesc = gtDesc;
	}
	
	
}

package com.wood.pojo.game;

import java.io.Serializable;
/**
 * 
 * @类名：Firm
 * @功能：发行商PO
 * @作者：黄博
 * @时间：2016年4月22日
 * @地点：成都
 *
 */
public class Firm implements Serializable {
	/**
	 * @desc 发行商ID
	 */
	private Integer firmID;
	
	/**
	 * @desc 发行商名
	 */
	private String firmName;

	public Integer getFirmID() {
		return firmID;
	}

	public void setFirmID(Integer firmID) {
		this.firmID = firmID;
	}

	public String getFirmName() {
		return firmName;
	}

	public void setFirmName(String firmName) {
		this.firmName = firmName;
	}
}

package com.wood.pojo.user;

import java.io.Serializable;
/**
 * 
 * @类名：Transaction
 * @功能：交易记录PO
 * @作者：黄博
 * @时间：2016年4月22日
 * @地点：成都
 *
 */
public class Transaction implements Serializable {
	/**
	 * @desc 交易记录编号
	 */
	private Integer txID;
	
	/**
	 * @desc 已付费的订单号
	 */ 
	private Integer orID;

	public Integer getTxID() {
		return txID;
	}

	public void setTxID(Integer txID) {
		this.txID = txID;
	}

	public Integer getOrID() {
		return orID;
	}

	public void setOrID(Integer orID) {
		this.orID = orID;
	}
	
	
}

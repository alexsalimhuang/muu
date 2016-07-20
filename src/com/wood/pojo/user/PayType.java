package com.wood.pojo.user;

import java.io.Serializable;

/**
 * @类名：PayType
 * @功能： 支付方式PO
 * @作者：吴迪
 * @时间：2016年4月22日
 * @地点：成都
 */
public class PayType implements Serializable{

	/**
	 * @desc 支付方式ID
	 */
	private Integer ptID;
	
	/**
	 * @desc 第三方支付技术提供商
	 */
	private String payCompany;

	public Integer getPtID() {
		return ptID;
	}

	public void setPtID(Integer ptID) {
		this.ptID = ptID;
	}

	public String getPayCompany() {
		return payCompany;
	}

	public void setPayCompany(String payCompany) {
		this.payCompany = payCompany;
	}
	
}

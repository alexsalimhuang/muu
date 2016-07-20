package com.wood.pojo.user;

import java.io.Serializable;

/**
 * @类名：Order
 * @功能： 订单PO
 * @作者：吴迪
 * @时间：2016年4月22日
 * @地点：成都
 */
public class Order implements Serializable{

	/**
	 * @desc 订单号
	 */
	private Integer orId;
	
	/**
	 * @desc 已经提交的购物车
	 */
	private Cart cart;
	
	/**
	 * @desc 订单结算状态
	 */
	private String orIsPaid; 
	
}

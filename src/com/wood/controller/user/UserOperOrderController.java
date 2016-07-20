package com.wood.controller.user;

import com.opensymphony.xwork2.ActionSupport;
import com.sun.net.httpserver.Authenticator.Success;

/**
 * @类名：UserOperOrderAction
 * @功能： 用户对订单所有交互的功能
 * @作者：吴迪
 * @时间：2016年4月22日
 * @地点：成都
 */
public class UserOperOrderController extends ActionSupport {

	/**
	 * @desc 页面传过来需要操作的订单号
	 */
	private String orderId;
	
	/**
	 * @desc 页面传过来是否需要清空订单信息的
	 */
	private String orderEmpty;
	
	/**
	 * @desc 展示用户所有的订单
	 * @return	跳转到订单详情页面
	 */
	public String viewOrder(){
		return SUCCESS;
	}
	
	/**
	 * @desc 用户提交订单，添加到订单数据表
	 * @return	跳转到结算页面
	 */
	public String submitOrder(){
		return SUCCESS;
	}
	
	/**
	 * @desc	用户删除订单信息
	 * @return 显示删除成功信息
	 */
	public String deleteOrder(){
		return SUCCESS;
	}
	
	/**
	 * @desc	用户清空订单信息
	 * @return	显示清空成功信息
	 */
	public String empty(){
		return SUCCESS;
	}
}

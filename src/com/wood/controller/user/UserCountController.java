package com.wood.controller.user;

import com.opensymphony.xwork2.ActionSupport;

/**
 * @类名：UserCountAction
 * @功能： 对出租和出售的游戏分别进行热门排行
 * @作者：刘宇山
 * @时间：2016年4月22日
 * @地点：成都
 */
public class UserCountController extends ActionSupport {

	/**
	 * @author 刘宇山
	 * @desc 对所有能够出租的游戏进行分页展示
	 * @return 转到出租排行展示页面
	 */
	public String countRent() {
		
		return SUCCESS;
	}
	
	/**
	 * @author 刘宇山
	 * @desc 对所有能够出售的游戏进行分页展示
	 * @return 转到出售排行展示页面
	 */
	public String countSale() {
		
		return SUCCESS;
	}

}

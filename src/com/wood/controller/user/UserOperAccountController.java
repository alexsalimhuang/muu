package com.wood.controller.user;

import com.opensymphony.xwork2.ActionSupport;
import com.wood.pojo.user.User;

/**
 * @类名：UserOperAccountAction
 * @功能： 用户个人中心的所有操作的功能
 * @作者：刘宇山
 * @时间：2016年4月22日
 * @地点：成都
 */
public class UserOperAccountController extends ActionSupport {
	/**
	 * @author 刘宇山
	 * @desc 页面传入的个人信息
	 */
	private User user;

	/**
	 * @author 刘宇山
	 * @desc 对用户信息进行展示
	 * @return 转到用户信息展示页面
	 */
	public String updateInfo() {
		
		return SUCCESS;
	}
	
	/**
	 * @author 刘宇山
	 * @desc 对所有订单进行分页展示
	 * @return 转到订单管理展示页面
	 */
	public String orderManage() {
		
		return SUCCESS;
	}
	
	/**
	 * @author 刘宇山
	 * @desc 对密码更改页的展示
	 * @return 转到用户密码更改展示页面
	 */
	public String updatePass() {
		
		return SUCCESS;
	}
	
	/**
	 * @author 刘宇山
	 * @desc 对最近浏览的游戏进行分页展示
	 * @return 转到商品浏览的历史记录展示页面
	 */
	public String destory() {
		
		return SUCCESS;
	}
	
	/**
	 * @author 刘宇山
	 * @desc 对登录页展示
	 * @return 转到登录页面
	 */
	public String logout() {
		
		return SUCCESS;
	}

}

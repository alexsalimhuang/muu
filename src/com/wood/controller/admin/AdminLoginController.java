package com.wood.controller.admin;

import com.opensymphony.xwork2.ActionSupport;

public class AdminLoginController extends ActionSupport {

	/**
	 * @author 何辉
	 * @desc 管理员登录
	 * @return 一个字符串
	 */
	public String login(){
		
		return SUCCESS;
	}
	
	/**
	 * @author 何辉
	 * @desc 变更管理员
	 * @return 一个字符串
	 */
	public String changeAdmin(){
		
		return SUCCESS;
	}
	
	/**
	 * @author 何辉
	 * @desc 退出
	 * @return 一个字符串
	 */
	public String logout(){
		
		return SUCCESS;
	}
	
	/**
	 * @author 何辉
	 * @desc 换个账号
	 * @return 一个字符串
	 */
	public String otherAdmin(){
		
		return SUCCESS;
	}
	
}

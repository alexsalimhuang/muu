package com.wood.controller.user;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.opensymphony.xwork2.ActionSupport;
import com.wood.pojo.user.User;
import com.wood.service.UserService;

/**
 * @类名：UserLoginAction
 * @功能： 用户登录、注销
 * @作者：吴迪
 * @时间：2016年4月22日
 * @地点：成都
 */
@Controller
public class UserLoginController extends ActionSupport {

	@Autowired
	UserService userService;
	/**
	 * @desc 用户登录功能
	 * @return	成功转到主页，否则依然在登录页面
	 */
	@RequestMapping(value="/login",method=RequestMethod.GET)
	public String login(){
		return "login";
	}
	
	@RequestMapping(value="/login",method=RequestMethod.POST)
	public String login(User user){
		if(userService.login(user.getUserName(),user.getUserPass())){
			return "redirect:/grid";
		}
		return "login";
	}
	@RequestMapping(value="/grid",method=RequestMethod.GET)
	public String toGrid(){
		return "grid";
	}
	/**
	 * @desc 用户注销功能
	 * @return 转到主页
	 */
	public String logout(){
		return SUCCESS;
	}
}

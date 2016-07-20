package com.wood.controller.user;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.opensymphony.xwork2.ActionSupport;
import com.sun.net.httpserver.Authenticator.Success;
import com.wood.pojo.user.User;
import com.wood.service.UserService;

/**
 * @类名：UserRegAction
 * @功能： 用户注册
 * @作者：吴迪
 * @时间：2016年4月22日
 * @地点：成都
 */
@Controller
public class UserRegController extends ActionSupport {

	/**
	 * @desc 用户注册的个人信息，一个用户对象
	 */
	@Autowired
	UserService userService;
	/**
	 * @desc 用户注册
	 * @return	转到主页
	 */
	@RequestMapping(value="/reg",method=RequestMethod.GET)
	public String reg(){
		return "login";
	}
	@RequestMapping(value="/reg",method=RequestMethod.POST)
	public String reg(User user) {
		try {
			System.out.println("密码：" + user.getUserPass());
			userService.registUser(user);
		} catch (Exception e) {
			e.printStackTrace();
			return ERROR;
		}
		return "grid";
	}
}

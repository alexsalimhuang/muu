package com.wood.controller.user;

/**
 * @类名：UserViewNotice
 * @功能： 公告显示
 * @作者：吴迪
 * @时间：2016年4月22日
 * @地点：成都
 */
public class UserViewNoticeController {

	/**
	 * @desc 展示管理员发布的公告信息
	 * @return 转到公告页面
	 */
	public String viewNotice(){
		return "notice";
	}
}

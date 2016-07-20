package com.wood.controller.user;

import com.opensymphony.xwork2.ActionSupport;

/**
 * @类名：UserCommentAction
 * @功能： 用户对所购买的游戏进行评论和评分
 * @作者：吴迪
 * @时间：2016年4月22日
 * @地点：成都
 */
public class UserCommentController extends ActionSupport {

	
	/**
	 * @desc 用户的评论内容
	 */
	public String commentComment;
	
	/**
	 * @desc 用户的评分
	 */
	public String commentScore;
	
	/**
	 * @desc 提交用户对游戏做出的评价和评分
	 * @return	显示出评论成功的信息提示
	 */
	public String submitComment(){
		return SUCCESS;
	}
}

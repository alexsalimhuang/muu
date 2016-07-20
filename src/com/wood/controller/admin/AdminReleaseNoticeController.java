package com.wood.controller.admin;

import com.opensymphony.xwork2.ActionSupport;
import com.wood.pojo.company.Announcement;
import com.wood.service.AdminService;
/**
 * @author 何辉
 * @desc 管理员对公告的操作
 * @date 2016-04-22
 */
public class AdminReleaseNoticeController extends ActionSupport {

	/**
	 * @author 何辉
	 * @desc AdminService对象（注入）
	 */
	private AdminService adminService;
	
	/**
	 * @author 何辉
	 * @desc 公告
	 */
	private Announcement announcement;
	
	public Announcement getAnnouncement() {
		return announcement;
	}

	public void setAnnouncement(Announcement announcement) {
		this.announcement = announcement;
	}

	public AdminService getAdminService() {
		return adminService;
	}

	public void setAdminService(AdminService adminService) {
		this.adminService = adminService;
	}


	/**
	 * @author 何辉
	 * @desc 发布公告：
	 * @param 公告（announcement）
	 * @return 添加成功：返回SUCCESS
	 * @return 添加失败：返回ERROR
	 */
	public String releaseNotice(){
		if(adminService.releaseNotice(announcement) == true){
			return SUCCESS;
		}
		return ERROR;
	}
	
}

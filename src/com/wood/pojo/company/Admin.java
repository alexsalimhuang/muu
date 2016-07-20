package com.wood.pojo.company;

import java.io.Serializable;
/**
 * 
 * @类名：Admin
 * @功能：管理员PO
 * @作者：黄博
 * @时间：2016年4月22日
 * @地点：成都
 *
 */
public class Admin implements Serializable{

	/**
	 * @desc 管理员ID
	 */
	private Integer adminID;
	/**
	 * @desc 部门编号
	 */
	private Employee empNO;
	/**
	 * @desc 管理员密码
	 */
	private String adminPass;
	/**
	 * @desc 管理员权限
	 */
	private String adminAuthority;
	public Integer getAdminID() {
		return adminID;
	}
	public void setAdminID(Integer adminID) {
		this.adminID = adminID;
	}
	public Employee getEmpNO() {
		return empNO;
	}
	public void setEmpNO(Employee empNO) {
		this.empNO = empNO;
	}
	public String getAdminPass() {
		return adminPass;
	}
	public void setAdminPass(String adminPass) {
		this.adminPass = adminPass;
	}
	public String getAdminAuthority() {
		return adminAuthority;
	}
	public void setAdminAuthority(String adminAuthority) {
		this.adminAuthority = adminAuthority;
	}
	
	
}

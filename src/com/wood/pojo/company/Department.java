package com.wood.pojo.company;

import java.io.Serializable;
/**
 * 
 * @类名：Department
 * @功能：部门PO
 * @作者：黄博
 * @时间：2016年4月22日
 * @地点：成都
 *
 */
public class Department implements Serializable{

	/**
	 * @desc 部门ID
	 */
	private Integer deptID;
	/**
	 * @desc 部门名称
	 */
	private String deptName;
	
	public Integer getDeptID() {
		return deptID;
	}
	public void setDeptID(Integer deptID) {
		this.deptID = deptID;
	}
	public String getDeptName() {
		return deptName;
	}
	public void setDeptName(String deptName) {
		this.deptName = deptName;
	}
	
	
}

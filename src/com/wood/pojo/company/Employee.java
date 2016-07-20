package com.wood.pojo.company;

import java.io.Serializable;
/**
 * 
 * @类名：Employee
 * @功能：员工PO
 * @作者：黄博
 * @时间：2016年4月22日
 * @地点：成都
 *
 */
public class Employee implements Serializable{

	/**
	 * @desc 员工ID
	 */
	private Integer empID;
	/**
	 * @desc 员工工号
	 */
	private Integer empNO;
	/**
	 * @desc 部门ID
	 */
	private Department deptID;
	
	public Integer getEmpID() {
		return empID;
	}
	public void setEmpID(Integer empID) {
		this.empID = empID;
	}
	public Integer getEmpNO() {
		return empNO;
	}
	public void setEmpNO(Integer empNO) {
		this.empNO = empNO;
	}
	public Department getDeptID() {
		return deptID;
	}
	public void setDeptID(Department deptID) {
		this.deptID = deptID;
	}
	
	
}

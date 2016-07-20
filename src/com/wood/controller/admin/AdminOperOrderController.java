package com.wood.controller.admin;

import java.util.List;

import com.opensymphony.xwork2.ActionSupport;
import com.wood.common.PageList;
import com.wood.pojo.user.Order;
import com.wood.service.AdminService;
/**
 * @author 何辉
 * @desc 管理员对用户订单的操作
 * @date 2016-04-22
 */
public class AdminOperOrderController extends ActionSupport {

	/**
	 * @author 何辉
	 * @desc AdminService对象（注入）
	 */
	private AdminService adminService;
	
	/**
	 * @author 何辉
	 * @desc 查询条件
	 */
	private String id;
	
	/**
	 * @author 何辉
	 * @desc 当前页数
	 */
	private Integer index;
	
	/**
	 * @author 何辉
	 * @desc 每页显示的条数
	 */
	private Integer size;
	
	/**
	 * @author 何辉
	 * @desc 分页数据
	 */
	private PageList pageList;
	
	/**
	 * @author 何辉
	 * @desc 订单
	 */
	private Order order;
	
	/**
	 * @author 何辉
	 * @desc 删除订单的id集合
	 */
	private List<Integer> list;
	
	public Order getOrder() {
		return order;
	}

	public void setOrder(Order order) {
		this.order = order;
	}

	public List<Integer> getList() {
		return list;
	}

	public void setList(List<Integer> list) {
		this.list = list;
	}
	
	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public Integer getIndex() {
		return index;
	}

	public void setIndex(Integer index) {
		this.index = index;
	}

	public Integer getSize() {
		return size;
	}

	public void setSize(Integer size) {
		this.size = size;
	}

	public PageList getPageList() {
		return pageList;
	}

	public void setPageList(PageList pageList) {
		this.pageList = pageList;
	}

	public AdminService getAdminService() {
		return adminService;
	}

	public void setAdminService(AdminService adminService) {
		this.adminService = adminService;
	}
	
	/**
	 * @author 何辉
	 * @desc 查询订单：index（当前页数）size（每页显示条数）id（查询条件）
	 * @desc         根据以上条件执行分页查询，如果id为null，则全部查询
	 * @desc         如果id不为空，则执行按条件查询
	 * @return 执行成功，返回：SUCCESS
	 */
	public String searchOrder(){
		if (index == null || index < 1) {
			index = 1;
		}
		if (size == null) {
			size = 5;
		}
		if(id == null){
			this.pageList = adminService.searchOrder(index, size);
		}else{
			this.pageList = adminService.searchOrder(index, size, id);
		}
		return SUCCESS;
	}
	
	/**
	 * @author 何辉
	 * @desc 过期订单删除：根据主键（id）删除
	 * @desc 	传入一个List集合，里面放要删除的订单的id
	 * @return 下架成功：返回SUCCESS
	 * @return 下架失败：返回ERROR
	 */
	public String deleteOutdatedOrder(){
		if(adminService.deleteOutdatedOrder(list) == true){
			return SUCCESS;
		}
		return ERROR;
	}
	
}

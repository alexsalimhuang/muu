package com.wood.controller.admin;

import java.util.List;

import com.opensymphony.xwork2.ActionSupport;


import com.wood.common.PageList;
import com.wood.pojo.game.Game;
import com.wood.service.AdminService;
/**
 * @author 何辉
 * @desc 管理员对游戏的操作
 * @date 2016-04-22
 */
public class AdminOperGameController extends ActionSupport {

	/**
	 * @author 何辉
	 * @desc 游戏
	 */
	private Game game;
	
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
	 * @desc AdminService对象（注入）
	 */
	private AdminService adminService;
	
	/**
	 * @author 何辉
	 * @desc 上下架游戏的id集合
	 */
	private List<Integer> list;
	
	public List<Integer> getList() {
		return list;
	}

	public void setList(List<Integer> list) {
		this.list = list;
	}

	public AdminService getAdminService() {
		return adminService;
	}

	public void setAdminService(AdminService adminService) {
		this.adminService = adminService;
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public PageList getPageList() {
		return pageList;
	}

	public void setPageList(PageList pageList) {
		this.pageList = pageList;
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

	public Game getGame() {
		return game;
	}

	public void setGame(Game game) {
		this.game = game;
	}

	/**
	 * @author 何辉
	 * @desc 查询游戏：index（当前页数）size（每页显示条数）id（查询条件）
	 * @desc         根据以上条件执行分页查询，如果id为null，则全部查询
	 * @desc         如果id不为空，则执行按条件查询
	 * @return 执行成功，返回：SUCCESS
	 */
	public String searchGame(){
		if (index == null || index < 1) {
			index = 1;
		}
		if (size == null) {
			size = 5;
		}
		if(id == null){
			this.pageList = adminService.searchGame(index, size);
		}else{
			this.pageList = adminService.searchGame(index, size, id);
		}
		return SUCCESS;
	}
	
	/**
	 * @author 何辉
	 * @desc 添加一个游戏：以一个Game对象为参数，执行添加
	 * @return 添加成功：返回SUCCESS
	 * @return 添加失败：返回ERROR
	 */
	public String addGame(){
		if(adminService.addGame(game) == true){
			return SUCCESS;
		}
		return ERROR;
	}
	
	/**
	 * @author 何辉
	 * @desc 修改一个游戏（游戏展示信息）
	 * @desc    根据游戏的主键来修改其他信息，主键不允许被修改 
	 * @return 修改成功：返回SUCCESS
	 * @return 修改失败：返回ERROR
	 */
	public String updateGame(){
		if(adminService.updateGame(game) == true){
			return SUCCESS;
		}
		return ERROR;
	}
	
	/**
	 * @author 何辉
	 * @desc 上架游戏（支持批量上架）
	 * @desc 	传入一个要上架游戏的List集合，里面放要上架游戏的id
	 * @return 上架成功：返回SUCCESS
	 * @return 上架失败：返回ERROR
	 */
	public String onGame(){
		if(adminService.onGame(list) == true){
			return SUCCESS;
		}
		return ERROR;
	}
	
	/**
	 * @author 何辉
	 * @desc 下架游戏（支持批量下架）
	 * @desc 	传入一个要下架游戏的List集合，里面放要下架游戏的id
	 * @return 下架成功：返回SUCCESS
	 * 		        下架失败：返回ERROR
	 */
	public String offGame(){
		if(adminService.offGame(list) == true){
			return SUCCESS;
		}
		return ERROR;
	}
}

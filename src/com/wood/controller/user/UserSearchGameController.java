package com.wood.controller.user;


import com.opensymphony.xwork2.ActionSupport;

public class UserSearchGameController extends ActionSupport {

	/**
	 * @author 吴迪
	 * @desc 页面传入的当前页数
	 */
	private String index;

	/**
	 * @desc 搜索的关键字
	 */
	private String key;

	/**
	 * @desc 按游戏类型搜索
	 */
	private String gameType;

	/**
	 * @desc 按发售日期搜索
	 */
	private String saleDate;
	
	/**
	 * @desc 按厂商搜索
	 */
	private String firm;
	
	/**
	 * @desc 按游戏主题搜索
	 */
	private String gameTheme;
	
	public String getIndex() {
		return index;
	}

	public void setIndex(String index) {
		this.index = index;
	}

	public String getKey() {
		return key;
	}

	public void setKey(String key) {
		this.key = key;
	}

	public String getGameType() {
		return gameType;
	}

	public void setGameType(String gameType) {
		this.gameType = gameType;
	}

	public String getSaleDate() {
		return saleDate;
	}

	public void setSaleDate(String saleDate) {
		this.saleDate = saleDate;
	}

	public String getFirm() {
		return firm;
	}

	public void setFirm(String firm) {
		this.firm = firm;
	}

	public String getGameTheme() {
		return gameTheme;
	}

	public void setGameTheme(String gameTheme) {
		this.gameTheme = gameTheme;
	}

	/**
	 * @author 吴迪
	 * @desc 对所有能够出售的游戏进行分页展示
	 * @return 转到出售展示页面
	 */
	public String viewSaleGame() {
		return SUCCESS;
	}

	/**
	 * @author 吴迪
	 * @desc 对所有能够出租的游戏进行分页展示
	 * @return 转到出租展示页面
	 */
	public String viewRentGame() {
		return SUCCESS;
	}
	
	/**
	 * @author 吴迪
	 * @desc 对搜索到的能够出租或者出售的游戏进行分页展示
	 * @return 转到出租、出售展示页面
	 */
	public String searchGame() {
		
		return SUCCESS;
	}
}

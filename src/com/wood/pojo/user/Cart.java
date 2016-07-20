package com.wood.pojo.user;

import java.io.Serializable;
import java.util.Date;

import com.wood.pojo.game.Game;

/**
 * @类名：Cart
 * @功能： 购物车PO
 * @作者：吴迪
 * @时间：2016年4月22日
 * @地点：成都
 */
/**
 * @类名：Cart
 * @功能： 
 * @作者：吴迪
 * @时间：2016年4月22日
 * @地点：成都
 */
public class Cart implements Serializable{
	
	/**
	 * @desc 购物车装的游戏数量
	 */
	private Integer cartCount;
	
	/**
	 * @desc 购物车ID
	 */
	private Integer cartID;
	
	/**
	 * @desc 游戏PO
	 */
	private Game game;
	
	/**
	 * @desc 用户PO
	 */
	private User user;
	
	/**
	 * @desc 购物车提交状态
	 */
	private String cartIsPaid;
	
	/**
	 * @desc 过期时间
	 */
	private Date cartOutTime;
	
	/**
	 * @desc 购物车装的游戏分别是需要租的还是买的
	 */
	private String cartStatus;

	public Integer getCartCount() {
		return cartCount;
	}

	public void setCartCount(Integer cartCount) {
		this.cartCount = cartCount;
	}

	public Integer getCartID() {
		return cartID;
	}

	public void setCartID(Integer cartID) {
		this.cartID = cartID;
	}

	public Game getGame() {
		return game;
	}

	public void setGame(Game game) {
		this.game = game;
	}

	public User getUser() {
		return user;
	}

	public void setUser(User user) {
		this.user = user;
	}

	public String getCartIsPaid() {
		return cartIsPaid;
	}

	public void setCartIsPaid(String cartIsPaid) {
		this.cartIsPaid = cartIsPaid;
	}

	public Date getCartOutTime() {
		return cartOutTime;
	}

	public void setCartOutTime(Date cartOutTime) {
		this.cartOutTime = cartOutTime;
	}

	public String getCartStatus() {
		return cartStatus;
	}

	public void setCartStatus(String cartStatus) {
		this.cartStatus = cartStatus;
	}
	
}

package com.wood.controller.user;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

import com.opensymphony.xwork2.ActionContext;
import com.opensymphony.xwork2.ActionSupport;
import com.wood.pojo.user.Cart;

/**
 * @类名: UserOperCartAction
 * @功能: 用户操作购物车的方法类。
	 * 		   查询购物车：跳转购物车页面
	 * 		   新增商品	
	 * 		   修改商品数量
	 * 		   删除商品
	 * 		   清空商品
	 *		   跳转结算页面
 * @作者: 周雅伦
 * @时间: 2016年04
 * @地点: 成都
 */
public class UserOperCartController extends ActionSupport {
	/**
	 * @author 周雅伦
	 * @desc 购物车实体
	 */
	private Cart cart;
	/**
	 * @author 周雅伦
	 * @desc 购物车里某款商品的id
	 */
	private String cartID;
	/**
	 * @author 周雅伦
	 * @desc 购物车商品的数量
	 */
	private String gameCount;
	
	
	
	public String getCartID() {
		return cartID;
	}

	public void setCartID(String cartID) {
		this.cartID = cartID;
	}

	public String getGameCount() {
		return gameCount;
	}

	public void setGameCount(String gameCount) {
		this.gameCount = gameCount;
	}

	public Cart getCart() {
		return cart;
	}

	public void setCart(Cart cart) {
		this.cart = cart;
	}

	/**
	 * @author 周雅伦
	 * @desc 查询用户已加入购物车的产品并展示
	 * @return 跳转购物车界面cart.jsp
	 */
	public String viewCart() {
		return SUCCESS;

	}

	/**
	 * @author 周雅伦
	 * @desc 添加购物车信息
	 * @return 添加成功
	 */
	public String addToCart() {
		return SUCCESS;
	}

	/**
	 * @author 周雅伦
	 * @desc 修改购物车信息(数量)
	 * @param 需要参数：
	 * 		修改的购物车商品id：cartID
	 * 		修改的数量：gameCount
	 * @return 修改成功
	 */
	public String updateGameNo(String cartID, String gameCount) {
		return SUCCESS;
	}

	/**
	 * @author 周雅伦
	 * @desc 购物车游戏删除
	 * @param 需要参数：
	 * 		删除的购物车商品id：cartID
	 * @return 删除成功
	 */
	public String deleteGame(String cartID) {
		return SUCCESS;
	}

	/**
	 * @author 周雅伦
	 * @desc 购物车清空
	 * @return 清空成功
	 */
	public String emptyCart() {
		return SUCCESS;
	}

	/**
	 * @author 周雅伦
	 * @desc 购物车结算
	 * @return 成功跳转至结算界面checkOut.jsp
	 */
	public String checkOut() {
		return SUCCESS;
	}
}

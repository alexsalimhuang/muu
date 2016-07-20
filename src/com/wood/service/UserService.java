package com.wood.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

import com.wood.dao.UserDao;
import com.wood.pojo.game.Game;
import com.wood.pojo.user.Order;
import com.wood.pojo.user.User;

/**
 * @类名：UserService 
 * @功能： 用户对沐游网站的整个交互的所有功能。
 * @作者：吴迪
 * @时间：2016年4月22日 @地点：成都
 * 
 */
public class UserService {

	UserDao userDao;
	
	public UserDao getUserDao() {
		return userDao;
	}

	public void setUserDao(UserDao userDao) {
		this.userDao = userDao;
	}

	/**
	 * @desc 用户登录功能
	 * @param 用户对象
	 * @return 成功转到主页，否则依然在登录页面
	 */
	public boolean login(String userName,String userPass) {
		if(userDao.selectByName(userName) != null && userDao.selectByName(userName).getUserPass().equals(userPass)){
			return true;
		}
		return false;
	}

	public void registUser(User user) {

		if (user.getUserName().length() != 0
				&& user.getUserPass().length() != 0) {

			userDao.save(user);
		}else{
			throw new RuntimeException("用户名或密码不能为空");
		}

	}
	
	/**
	 * @desc 用户注销功能
	 * @return 转到主页
	 */
	public void logout() {

	}

	/**
	 * @desc 用户注册
	 * @param 用户注册信息
	 * @return 转到主页
	 */
	public boolean reg(User user) {
		return true;
	}

	/**
	 * @author 吴迪
	 * @desc 对所有能够出售的游戏进行分页查询
	 * @return 所有能够出售的游戏
	 */
	public List<Game> viewSaleGame() {
		List<Game> games = new ArrayList<Game>();
		return games;
	}

	/**
	 * @author 吴迪
	 * @desc 对所有能够出租的游戏进行分页查询
	 * @return 所有能够出租的游戏
	 */
	public List<Game> viewRentGame() {
		List<Game> games = new ArrayList<Game>();
		return games;
	}

	/**
	 * @author 吴迪
	 * @desc 对搜索到的能够出租或者出售的游戏进行分页查询
	 * @return 模糊查询出来的所有能够出租和出售的游戏
	 */
	public List<Game> searchGame() {

		List<Game> games = new ArrayList<Game>();
		return games;
	}

	/**
	 * @desc 提交用户对游戏做出的评价和评分
	 * @return 提交成功还是失败
	 */
	public boolean submitComment() {
		return true;
	}

	/**
	 * @author 刘宇山
	 * @desc 对top10的热门出租游戏进行查询
	 * @return 出租量top10的game
	 */
	public List<Game> countRent() {
		List<Game> games = new ArrayList<Game>();
		return games;
	}

	/**
	 * @author 刘宇山
	 * @desc 对top10的热门出售游戏进行查询
	 * @return 出售量top10的game
	 */
	public List<Game> countSale() {
		List<Game> games = new ArrayList<Game>();
		return games;
	}

	/**
	 * @author 刘宇山
	 * @desc 对用户信息进行展示
	 * @return 用户对象
	 */
	public User updateInfo() {
		User user = new User();
		return user;
	}

	/**
	 * @author 刘宇山
	 * @desc 对最近浏览的游戏进行分页展示
	 * @return 最近浏览的几款游戏
	 */
	public List<Game> distory() {
		List<Game> games = new ArrayList<Game>();
		return games;
	}

	/**
	 * @author 周雅伦
	 * @desc 查询用户已加入购物车的产品并展示
	 * @return 购物车内游戏
	 */
	public List<Game> viewCart() {
		List<Game> games = new ArrayList<Game>();
		return games;
	}

	/**
	 * @author 周雅伦
	 * @desc 添加购物车信息
	 * @param 添加的游戏
	 * @return 添加成功
	 */
	public boolean addToCart(Game game) {
		return true;
	}

	/**
	 * @author 周雅伦
	 * @desc 修改购物车信息(数量)
	 * @param 需要参数：
	 *            修改的购物车商品id：cartID 修改的数量：gameCount
	 * @return 修改成功
	 */
	public boolean updateGameNo(String cartID, String gameCount) {
		return true;
	}

	/**
	 * @author 周雅伦
	 * @desc 购物车游戏删除
	 * @param 需要参数：
	 *            删除的购物车商品id：cartID
	 * @return 删除成功
	 */
	public boolean deleteGame(String cartID) {
		return true;
	}

	/**
	 * @author 周雅伦
	 * @desc 购物车清空
	 * @return 清空成功
	 */
	public boolean emptyCart() {
		return true;
	}

	/**
	 * @author 周雅伦
	 * @desc 购物车结算
	 * @param 购物车id
	 * @return true则支付成功
	 */
	public boolean checkOut(String cartID) {
		return true;
	}

	/**
	 * @desc 查询用户所有的订单
	 * @param 订单号
	 * @return 订单
	 */
	public List<Order> viewOrder(String orderId) {
		List<Order> orders = new ArrayList<Order>();
		return orders;
	}

	/**
	 * @desc 用户提交订单，添加到订单数据表
	 * @param 订单号
	 * @return true添加到订单表
	 */
	public boolean submitOrder(String orderId) {
		return true;
	}

	/**
	 * @desc 用户删除订单信息
	 * @return true删除成功
	 */
	public boolean deleteOrder(String orderId) {
		return true;
	}

	/**
	 * @desc 用户清空订单信息
	 * @return 清空状态
	 */
	public boolean empty(String orderId) {
		return true;
	}

	/**
	 * @desc 展示管理员发布的公告信息
	 * @return 公告信息
	 */
	public String viewNotice() {

		return "notice";
	}

}

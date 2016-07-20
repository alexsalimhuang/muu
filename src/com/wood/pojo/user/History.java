package com.wood.pojo.user;

import java.io.Serializable;

import com.wood.pojo.game.Game;

/**
 * @类名：History
 * @功能： 历史PO
 * @作者：吴迪
 * @时间：2016年4月22日
 * @地点：成都
 */
public class History implements Serializable{

	/**
	 * @desc 历史ID
	 */
	private Integer hisID;
	
	/**
	 * @desc 游戏PO
	 */
	private Game game;
	
	/**
	 * @desc 用户PO
	 */
	private User user;

	public Integer getHisID() {
		return hisID;
	}

	public void setHisID(Integer hisID) {
		this.hisID = hisID;
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
	
}

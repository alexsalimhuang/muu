package com.wood.service;

import java.util.List;

import com.wood.common.PageList;
import com.wood.pojo.company.Announcement;
import com.wood.pojo.game.Game;

/**
 * @类名：AdminService
 * @功能： 管理员的所有操作的功能
 * @作者：吴迪
 * @时间：2016年4月22日
 * @地点：成都
 */
public class AdminService {

	public PageList searchGame(Integer index, Integer size) {
		// TODO Auto-generated method stub
		return null;
	}

	public PageList searchGame(Integer index, Integer size, String id) {
		// TODO Auto-generated method stub
		return null;
	}

	public boolean addGame(Game game) {
		// TODO Auto-generated method stub
		return false;
	}

	public boolean updateGame(Game game) {
		// TODO Auto-generated method stub
		return false;
	}

	public boolean onGame(List<Integer> list) {
		// TODO Auto-generated method stub
		return false;
	}

	public boolean offGame(List<Integer> list) {
		// TODO Auto-generated method stub
		return false;
	}

	public PageList searchOrder(Integer index, Integer size) {
		// TODO Auto-generated method stub
		return null;
	}

	public PageList searchOrder(Integer index, Integer size, String id) {
		// TODO Auto-generated method stub
		return null;
	}

	public boolean deleteOutdatedOrder(List<Integer> list) {
		// TODO Auto-generated method stub
		return false;
	}

	public boolean releaseNotice(Announcement announcement) {
		// TODO Auto-generated method stub
		return false;
	}

	
}

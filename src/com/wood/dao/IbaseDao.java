package com.wood.dao;



/**
 * @类名：IbaseDao
 * @功能： 定义一般方法
 * @作者：吴迪
 * @时间：2016年4月22日
 * @地点：成都
 */
public interface IbaseDao<T> {

	/**
	 * @desc 添加
	 * @param 需要添加的对象
	 * @return 添加状态
	 */
	boolean add(T t);
	
	/**
	 * @desc 删除
	 * @param 需要删除的对象
	 * @return 删除状态
	 */
	boolean delete(T t);
	
	/**
	 * @desc 修改
	 * @param 需要修改的对象
	 * @return 修改状态
	 */
	boolean update(T t);

	
}

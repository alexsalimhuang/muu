package com.wood.dao;

import java.io.Serializable;
import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.List;

import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.orm.hibernate3.support.HibernateDaoSupport;
import org.springframework.stereotype.Repository;
import org.springframework.web.bind.annotation.InitBinder;

import com.wood.pojo.game.Game;
import com.wood.pojo.user.User;
public class BaseDao<T> extends HibernateDaoSupport implements IbaseDao<T> {

	//用于构造实体的时候获得泛型T代表的具体实体类型
	private Class<?> entityClass;
	
	
	
	/**
	 * 获取具体的实体类的对象
	 */
	public BaseDao(){
		//获取泛型T的具体类型
		ParameterizedType clazz = (ParameterizedType)this.getClass().getGenericSuperclass();
		Type[] types = clazz.getActualTypeArguments();
		entityClass = (Class)types[0];
	}
		
	@Override
	public boolean add(T t) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean delete(T t) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean update(T t) {
		// TODO Auto-generated method stub
		return false;
	}

	/**
	 * @desc 查询对应实体类的信息
	 * @return 查询后的实体信息集合
	 */
	public List<T> select(){
		List<T> list = new ArrayList<T>();
		return list;
	}
	
	public User selectById(Serializable userName) {
		User user =null;
		user = (User)this.getHibernateTemplate().find("from user where userName=?",userName);
		return user;
	}
}

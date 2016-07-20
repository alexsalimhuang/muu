package com.wood.dao;

import java.io.Serializable;
import java.util.List;

import org.hibernate.Criteria;
import org.hibernate.SessionFactory;
import org.hibernate.criterion.DetachedCriteria;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.orm.hibernate3.support.HibernateDaoSupport;
import org.springframework.stereotype.Repository;
import org.springframework.web.bind.annotation.InitBinder;

import com.wood.pojo.user.User;

public class UserDao extends HibernateDaoSupport{

	
	public void save(User user){
		this.getHibernateTemplate().save(user);
	}
	
	public User selectByName(Serializable userName) {
		User user = null;
		user = (User)this.getHibernateTemplate().find("from User where userName=?",userName).get(0);
//		user = (User)this.getSessionFactory().getCurrentSession().createCriteria(User.class).uniqueResult();
		return user;
	}
}

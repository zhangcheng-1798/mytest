package org.tarena.dao.impl;

import java.util.List;

import org.apache.ibatis.session.SqlSession;
import org.tarena.dao.UserDao;
import org.tarena.entity.User;
import org.tarena.util.SqlSessionUtil;

public class UserDaoImpl implements UserDao {

	@Override
	public void addUser(User user) {
		//获取session
		SqlSession session = 
				SqlSessionUtil.getSession();
/*		User user = new User();
		user.setId(1);
		user.setName("mybaties");
		user.setSex("man");
		user.setSalary(6000.0);*/
		session.insert("addUser",user);
		//提交事务，关闭session
		session.commit();
		session.close();
		
	}

	@Override
	public void deleteUser(int id) {
		// 删除
		SqlSession session = SqlSessionUtil.getSession();
		session.delete("delete",1);
		session.commit();
		session.close();
	}

	@Override
	public void updateUser(User user) {
		SqlSession session = SqlSessionUtil.getSession();
		session.update("update",user);
		session.commit();
		session.close();
		
	}

	@Override
	public User findByID(int id) {
		SqlSession session = SqlSessionUtil.getSession();
		//返回一个对象 selectOne
		User user = session.selectOne("findById",id);
//		session.commit();不需要commit
		session.close();
		
		return user;
	}

	@Override
	public List<User> findAll() {
		SqlSession session = SqlSessionUtil.getSession();
		List<User> list = session.selectList("findAll");
		session.close();
		return list;
	}

}















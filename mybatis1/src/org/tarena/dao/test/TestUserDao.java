package org.tarena.dao.test;

import java.util.List;

import org.tarena.dao.UserDao;
import org.tarena.dao.impl.UserDaoImpl;
import org.tarena.entity.User;

public class TestUserDao {

	public static void main(String[] args) {
		
		UserDao userDao = new UserDaoImpl();
	
		User user = new User();
		user.setId(2);
		user.setName("zhangcheng");
		user.setSex("m");
		user.setSalary(4000.0);
	
/*		userDao.addUser(user);
		System.out.println("添加一个新用户"+user.getName());*/
		
/*		userDao.deleteUser(4);
		System.out.println("删除一个用户");*/
		
/*		userDao.updateUser(user);
		System.out.println("获取ID"+user.getId());*/
			
/*		User users = userDao.findByID(3);
		System.out.println(users.getName());*/
		
		List<User> list = userDao.findAll();
		for(User u:list){
			System.out.println("name"+u.getName()+" "+u.getSalary());
		}
		
	}
	
}

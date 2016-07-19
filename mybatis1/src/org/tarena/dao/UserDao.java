package org.tarena.dao;

import java.util.List;

import org.tarena.entity.User;

public interface UserDao {

	public void addUser(User user);
	
	public void deleteUser(int id);
	
	public void updateUser(User user);
	
	public User findByID(int id);
	
	//list
	public List<User> findAll();
	
}

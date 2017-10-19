package com.bridgeit.dao;

import java.util.List;

import com.bridgeit.model.User;

public interface Dao {


	User findById(int id);

	User findByName(String name);

	void saveUser(User user);

	void updateUser(User user);

	void deleteUserById(int id);

	List<User> findAllUsers();
	
}


package com.bridgeit.service;

import java.util.List;

import com.bridgeit.model.User;

public interface UserService {


	User findById(int id);

	User findByName(String name);

	void saveUser(User user);

	void updateUser(User user);

	void deleteUserById(int id);

	List<User> findAllUsers();

}


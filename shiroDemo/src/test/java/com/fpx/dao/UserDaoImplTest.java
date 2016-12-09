package com.fpx.dao;

import org.junit.Test;

import com.fpx.entity.User;

public class UserDaoImplTest {
	
	private UserDao userDao = new UserDaoImpl();
	
	@Test
	public void createUserTest(){
		User user = new User("wang","123");

		userDao.createUser(user);
	}
	
	@Test
	public void findOneTest(){
		System.out.println(userDao.findOne(1l).toString());;
	}
}

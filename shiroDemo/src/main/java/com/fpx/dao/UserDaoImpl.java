package com.fpx.dao;

import java.util.Set;

import org.springframework.jdbc.core.JdbcTemplate;

import com.fpx.entity.User;

public class UserDaoImpl implements UserDao{
	
	@Override
	public User createUser(User user) {
		return null;
	}

	@Override
	public void updateUser(User user) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void deleteUser(Long userId) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void correlationRoles(Long userId, Long... roleIds) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void uncorrelationRoles(Long userId, Long... roleIds) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public User findOne(Long userId) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public User findByUsername(String username) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Set<String> findRoles(String username) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Set<String> findPermissions(String username) {
		// TODO Auto-generated method stub
		return null;
	}
	
	
}

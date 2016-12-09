package com.fpx.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.List;
import java.util.Set;

import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.PreparedStatementCreator;
import org.springframework.jdbc.support.GeneratedKeyHolder;

import com.fpx.entity.User;
import com.fpx.utils.JdbcTemplateUtils;

public class UserDaoImpl implements UserDao{

	private JdbcTemplate jdbcTemplate = JdbcTemplateUtils.jdbcTemplate();
	
	@Override
	public User createUser(final User user) {
		final String sql = "insert into sys_users(username,password,password_salt,locked) values(?,?,?,?)";
		
		GeneratedKeyHolder keyHolder = new GeneratedKeyHolder();
		jdbcTemplate.update(new PreparedStatementCreator() {
			
			@Override
			public PreparedStatement createPreparedStatement(Connection connection) throws SQLException {
				PreparedStatement psm = connection.prepareStatement(sql, new String[]{"id"});
				psm.setString(1,user.getUsername());
				psm.setString(2, user.getPassword());
				psm.setString(3, user.getSalt());
				psm.setInt(4, user.getLocked());
				return psm;
			}
		}, keyHolder);
		
		user.setId(keyHolder.getKey().longValue());
		return user;
	}

	@Override
	public void updateUser(User user) {
		String sql = "";
	}

	@Override
	public void deleteUser(Long userId) {
		
	}

	@Override
	public void correlationRoles(Long userId, Long... roleIds) {
		
	}

	@Override
	public void uncorrelationRoles(Long userId, Long... roleIds) {
		
	}

	@Override
	public User findOne(Long userId) {
		String sql = "select * from sys_users where id=?";
		List<User> user = jdbcTemplate.query(sql, new BeanPropertyRowMapper(User.class),userId);
		if(user.size()==0){
			return null;
		}
		return user.get(0);
	}

	@Override
	public User findByUsername(String username) {
		String sql="select * from sys_users where username=?";
		
		List<User> user = jdbcTemplate.query(sql, new BeanPropertyRowMapper(User.class), username);
		if(user.size()==0){
			return null;
		}
		return user.get(0);
	}

	@Override
	public Set<String> findRoles(String username) {
		String sql = "";
		return null;
	}

	@Override
	public Set<String> findPermissions(String username) {
		// TODO Auto-generated method stub
		return null;
	}
	
	
}

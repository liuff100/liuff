package com.fpx.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.PreparedStatementCreator;
import org.springframework.jdbc.support.GeneratedKeyHolder;

import com.fpx.entity.Permission;
import com.fpx.utils.JdbcTemplateUtils;

public class PermissionDaoImpl implements PermissionDao{

	JdbcTemplate jdbcTemplate = JdbcTemplateUtils.jdbcTemplate();
	
	@Override
	public Permission createPermission(final Permission permission) {
		
final String sql = "insert into sys_permissions(permission,description,aviliable) values(?,?,?)";
		
		GeneratedKeyHolder generatedKeyHolder = new GeneratedKeyHolder();
		jdbcTemplate.update(new PreparedStatementCreator() {
			
			@Override
			public PreparedStatement createPreparedStatement(Connection connection) throws SQLException {
				PreparedStatement psm = connection.prepareStatement(sql, new String[]{"id"});
				psm.setString(1, permission.getPermission());
				psm.setString(2, permission.getDescription());
				psm.setInt(3, permission.getAviliable());
				return psm;
			}
		}, generatedKeyHolder); 
		
		permission.setId(generatedKeyHolder.getKey().longValue());
		return permission;

	}

	@Override
	public void deletePermission(Long permissionId) {
		
	}

}

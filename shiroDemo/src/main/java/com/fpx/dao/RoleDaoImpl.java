package com.fpx.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.PreparedStatementCreator;
import org.springframework.jdbc.support.GeneratedKeyHolder;

import com.fpx.entity.Role;
import com.fpx.utils.JdbcTemplateUtils;

public class RoleDaoImpl implements RoleDao{
	
	private JdbcTemplate jdbcTemplate = JdbcTemplateUtils.jdbcTemplate();
	@Override
	public Role createRole(final Role role) {
		
		final String sql = "insert into sys_roles(role,description,aviliable) values(?,?,?)";
		
		GeneratedKeyHolder generatedKeyHolder = new GeneratedKeyHolder();
		jdbcTemplate.update(new PreparedStatementCreator() {
			
			@Override
			public PreparedStatement createPreparedStatement(Connection connection) throws SQLException {
				PreparedStatement psm = connection.prepareStatement(sql, new String[]{"id"});
				psm.setString(1, role.getRole());
				psm.setString(2, role.getDescription());
				psm.setInt(3, role.getAviliable());
				return psm;
			}
		}, generatedKeyHolder);
		
		role.setId(generatedKeyHolder.getKey().longValue());
		return role;
	}

	@Override
	public void deleteRole(Long roleId) {
		
	}

	@Override
	public void correlationPermissions(Long roleId, Long... permissionIds) {
		
	}

	@Override
	public void uncorrelationPermissions(Long roleId, Long... permissionIds) {
		
	}

}

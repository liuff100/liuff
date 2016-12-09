package com.fpx.dao;

import org.junit.Test;

import com.fpx.entity.Role;

public class RoleDaoImplTest {
	
	private RoleDao roleDao = new RoleDaoImpl();
	
	@Test
	public void createRoleTest(){
		Role role = new Role("超级管理员","拥有系统的所有权限");
		roleDao.createRole(role);
	}
}

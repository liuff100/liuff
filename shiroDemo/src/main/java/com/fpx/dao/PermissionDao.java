package com.fpx.dao;

import com.fpx.entity.Permission;

public interface PermissionDao {
	
    public Permission createPermission(Permission permission);

    public void deletePermission(Long permissionId);
}

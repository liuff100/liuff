package com.fpx.entity;

public class UserRole {
	
	private Long UserId;
	private Long RoleId;
	public UserRole() {
		super();
	}
	public Long getUserId() {
		return UserId;
	}
	public void setUserId(Long userId) {
		UserId = userId;
	}
	public Long getRoleId() {
		return RoleId;
	}
	public void setRoleId(Long roleId) {
		RoleId = roleId;
	}
	@Override
	public String toString() {
		return "UserRole [UserId=" + UserId + ", RoleId=" + RoleId + "]";
	}
	
	
}

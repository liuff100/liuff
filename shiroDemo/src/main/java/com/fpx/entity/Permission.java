package com.fpx.entity;

public class Permission {
	
	private Long id;
	private String permission;
	private String description;
	private int aviliable = 0;
	
	public Permission() {}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getPermission() {
		return permission;
	}

	public void setPermission(String permission) {
		this.permission = permission;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public int getAviliable() {
		return aviliable;
	}

	public void setAviliable(int aviliable) {
		this.aviliable = aviliable;
	}

	@Override
	public String toString() {
		return "Permission [id=" + id + ", permission=" + permission + ", description=" + description + ", aviliable="
				+ aviliable + "]";
	}
	
	
}

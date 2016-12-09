package com.fpx.entity;

public class Role {
	
	private Long id;
	private String role;
	private String description;
	private int aviliable = 0;
	
	public Role() {}
	
	

	public Role(String role, String description) {
		super();
		this.role = role;
		this.description = description;
	}



	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getRole() {
		return role;
	}

	public void setRole(String role) {
		this.role = role;
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
		return "Role [id=" + id + ", role=" + role + ", description=" + description + ", aviliable=" + aviliable + "]";
	}
	
	
	
}

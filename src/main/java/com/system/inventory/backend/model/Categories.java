package com.system.inventory.backend.model;

public class Categories {
	private Integer category_id;
	private String category_name;
	private String description;
	public Categories(Integer category_id, String category_name, String description) {
		super();
		this.category_id = category_id;
		this.category_name = category_name;
		this.description = description;
	}
	public Integer getCategory_id() {
		return category_id;
	}
	public void setCategory_id(Integer category_id) {
		this.category_id = category_id;
	}
	public String getCategory_name() {
		return category_name;
	}
	public void setCategory_name(String category_name) {
		this.category_name = category_name;
	}
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	@Override
	public String toString() {
		return "Categories [category_id=" + category_id + ", category_name=" + category_name + ", description="
				+ description + "]";
	}
	
}

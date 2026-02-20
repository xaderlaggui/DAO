package com.system.inventory.backend.model;

public class Products {
	private Integer product_id;
	private String product_name;
	private Integer category_id;
	private Integer quantity;
	private Integer price;
	private String supplier;
	public Products(Integer product_id, String product_name, Integer category_id, Integer quantity, Integer price,
			String supplier) {
		super();
		this.product_id = product_id;
		this.product_name = product_name;
		this.category_id = category_id;
		this.quantity = quantity;
		this.price = price;
		this.supplier = supplier;
	}
	public Products() {
		// TODO Auto-generated constructor stub
	}
	public Integer getProduct_id() {
		return product_id;
	}
	public void setProduct_id(Integer product_id) {
		this.product_id = product_id;
	}
	public String getProduct_name() {
		return product_name;
	}
	public void setProduct_name(String product_name) {
		this.product_name = product_name;
	}
	public Integer getCategory_id() {
		return category_id;
	}
	public void setCategory_id(Integer category_id) {
		this.category_id = category_id;
	}
	public Integer getQuantity() {
		return quantity;
	}
	public void setQuantity(Integer quantity) {
		this.quantity = quantity;
	}
	public Integer getPrice() {
		return price;
	}
	public void setPrice(Integer price) {
		this.price = price;
	}
	public String getSupplier() {
		return supplier;
	}
	public void setSupplier(String supplier) {
		this.supplier = supplier;
	}
	@Override
	public String toString() {
		return "Products [product_id=" + product_id + ", product_name=" + product_name + ", category_id=" + category_id
				+ ", quantity=" + quantity + ", price=" + price + ", supplier=" + supplier + "]";
	}
}

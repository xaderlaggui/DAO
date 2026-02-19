package com.system.inventory.backend.model;

public class InventoryTransactions {
	private Integer transaction_id;
	private Integer product_id;
	private Integer user_id;
	private String transaction_type;
	private Integer quantity;
	public InventoryTransactions(Integer transaction_id, Integer product_id, Integer user_id, String transaction_type,
			Integer quantity) {
		super();
		this.transaction_id = transaction_id;
		this.product_id = product_id;
		this.user_id = user_id;
		this.transaction_type = transaction_type;
		this.quantity = quantity;
	}
	public Integer getTransaction_id() {
		return transaction_id;
	}
	public void setTransaction_id(Integer transaction_id) {
		this.transaction_id = transaction_id;
	}
	public Integer getProduct_id() {
		return product_id;
	}
	public void setProduct_id(Integer product_id) {
		this.product_id = product_id;
	}
	public Integer getUser_id() {
		return user_id;
	}
	public void setUser_id(Integer user_id) {
		this.user_id = user_id;
	}
	public String getTransaction_type() {
		return transaction_type;
	}
	public void setTransaction_type(String transaction_type) {
		this.transaction_type = transaction_type;
	}
	public Integer getQuantity() {
		return quantity;
	}
	public void setQuantity(Integer quantity) {
		this.quantity = quantity;
	}
	@Override
	public String toString() {
		return "InventoryTransactions [transaction_id=" + transaction_id + ", product_id=" + product_id + ", user_id="
				+ user_id + ", transaction_type=" + transaction_type + ", quantity=" + quantity + "]";
	}
}

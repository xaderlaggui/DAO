package com.system.inventory.backend.model.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import com.system.inventory.backend.model.Database;
import com.system.inventory.backend.model.Products;

public class ProductsDAOImpl implements ProductsDAO{

	@Override
	public Products get(int id) throws SQLException {
		
		Products products = null;
		Connection con = Database.getConnection();
		
		String sql = "select * from products where id = ? ";
		
		PreparedStatement ps = con.prepareStatement(sql);
		ps.setInt(1, id);
		ResultSet rs = ps.executeQuery();
		
		if (rs.next()){
			products = new Products();
			products.setProduct_id(rs.getInt("product_id"));
			products.setProduct_name(rs.getString("product_name"));
			products.setCategory_id(rs.getInt("category_id"));
			products.setQuantity(rs.getInt("quantity"));
			products.setPrice(rs.getInt("price"));
			products.setSupplier(rs.getString("supplier"));
			
		}
		return products;
	}

	@Override
	public List<Products> getALL() throws SQLException {
		Products products = null;
		List<Products> list = new ArrayList<>();
		Connection con = Database.getConnection();
		
		String sql = "select * from products ORDER BY id DESC ";
		
		PreparedStatement ps = con.prepareStatement(sql);
		ResultSet rs = ps.executeQuery();
		
		if (rs.next()){
			products = new Products();
			products.setProduct_id(rs.getInt("product_id"));
			products.setProduct_name(rs.getString("product_name"));
			products.setCategory_id(rs.getInt("category_id"));
			products.setQuantity(rs.getInt("quantity"));
			products.setPrice(rs.getInt("price"));
			products.setSupplier(rs.getString("supplier"));
			
			list.add(products);
		}
		return list;
	}

	@Override
	public int save(Products user) throws SQLException {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public int insert(Products user) throws SQLException {
		Connection con = Database.getConnection();
		String sql = "insert into products (product_name, category_id, quantity, price, supplier) values (?,?,?,?,?)";
		
		PreparedStatement ps = con.prepareStatement(sql);
		ps.setString(1, user.getProduct_name());
		ps.setInt(2, user.getCategory_id());
		ps.setInt(3, user.getQuantity());
		ps.setInt(4, user.getPrice());
		ps.setString(5, user.getSupplier());
		return ps.executeUpdate();
	}

	@Override
	public int update(Products user) throws SQLException {
		Connection con = Database.getConnection();
		String sql = "update products set product_name=?, category_id=?, quantity=?, price=?, supplier-? where product_id=?";
		
		PreparedStatement ps = con.prepareStatement(sql);
		ps.setString(1, user.getProduct_name());
		ps.setInt(2, user.getCategory_id());
		ps.setInt(3, user.getQuantity());
		ps.setInt(4, user.getPrice());
		ps.setString(5, user.getSupplier());
		ps.setInt(6, user.getProduct_id());
		return ps.executeUpdate();
	}

	@Override
	public int delete(Products user) throws SQLException {
		Connection con = Database.getConnection();
		String sql = "delete from products where product_id=?";
		PreparedStatement ps = con.prepareStatement(sql);
		ps.setInt(1, user.getProduct_id());
		return ps.executeUpdate();
	}

}

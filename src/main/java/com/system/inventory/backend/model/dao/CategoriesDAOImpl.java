package com.system.inventory.backend.model.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import com.system.inventory.backend.model.Categories;
import com.system.inventory.backend.model.Database;

public class CategoriesDAOImpl implements CategoriesDAO{

	@Override
	public Categories get(int category_id) throws SQLException {
		
		Connection con = Database.getConnection();
		Categories categories = null;
		
		String sql = "SELECT * FROM categories where category_id = ?";
		
		PreparedStatement ps = con.prepareStatement(sql);
		ps.setInt(1, category_id);
		
		ResultSet rs = ps.executeQuery();
		
		if(rs.next()) {
			categories = new Categories();
			categories.setCategory_id(rs.getInt("category_id"));
			categories.setCategory_name(rs.getString("category_name"));
			categories.setDescription(rs.getString("description"));
			
		}
		return categories;
	}

	@Override
	public List<Categories> getALL() throws SQLException {
		Connection con = Database.getConnection();
		List <Categories> list = new ArrayList<>();
		
		String sql = "SELECT * FROM categories ORDER BY category_id DESC";
		
		PreparedStatement ps = con.prepareStatement(sql);
		ResultSet rs = ps.executeQuery();
		
		while (rs.next()){
			Categories categories = new Categories();
			categories.setCategory_id(rs.getInt("category_id"));
			categories.setCategory_name(rs.getString("category_name"));
			categories.setDescription(rs.getString("description"));
			
			list.add(categories);
			
		}
		
		return list;
	}

	@Override
	public int save(Categories user) throws SQLException {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public int insert(Categories user) throws SQLException {
		Connection con = Database.getConnection();
		
		String sql = "insert into categories (category_id, category_name, description) values (?,?,?)";
		
		PreparedStatement ps = con.prepareStatement(sql);
		ps.setInt(1, user.getCategory_id());
		ps.setString(2, user.getCategory_name());
		ps.setString(3, user.getDescription());
		
		return ps.executeUpdate();
	}

	@Override
	public int update(Categories user) throws SQLException {
		Connection con = Database.getConnection();
		
		String sql = "update categories set category_name=?, description=? where category_id=?";
		
		PreparedStatement ps = con.prepareStatement(sql);
		ps.setString(1, user.getCategory_name());
		ps.setString(2, user.getDescription());
		ps.setInt(3, user.getCategory_id());
		
		return ps.executeUpdate();
	}

	@Override
	public int delete(Categories user) throws SQLException {
		Connection con = Database.getConnection();
		String sql = "delete from categories where category_id=?";
		
		PreparedStatement ps = con.prepareStatement(sql);
		ps.setInt(1, user.getCategory_id());
		
		return ps.executeUpdate();
	}
	

}

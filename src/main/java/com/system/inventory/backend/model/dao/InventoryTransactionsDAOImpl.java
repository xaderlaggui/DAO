package com.system.inventory.backend.model.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import com.system.inventory.backend.model.Database;
import com.system.inventory.backend.model.InventoryTransactions;

public class InventoryTransactionsDAOImpl implements InventoryTransactionsDAO {

	@Override
	public InventoryTransactions get(int transaction_id) throws SQLException {
		Connection con = Database.getConnection();
		InventoryTransactions inventory = null;

		String sql = "select * from inventory_transaction where transaction_id=?";

		PreparedStatement ps = con.prepareStatement(sql);
		ps.setInt(1, transaction_id);

		ResultSet rs = ps.executeQuery();
		while (rs.next()) {
			inventory = new InventoryTransactions();
			inventory.setTransaction_id(rs.getInt("transaction_id"));
			inventory.setProduct_id(rs.getInt("product_id"));
			inventory.setUser_id(rs.getInt("user_id"));
			inventory.setTransaction_type(rs.getString("transaction_type"));
			inventory.setQuantity(rs.getInt("quantity"));
		}
		return inventory;
	}

	@Override
	public List<InventoryTransactions> getALL() throws SQLException {
		Connection con = Database.getConnection();
		List<InventoryTransactions> list = new ArrayList<>();
		
		String sql = "select * from inventory_transactions";
		
		PreparedStatement ps = con.prepareStatement(sql);
		ResultSet rs = ps.executeQuery();
		
		while (rs.next()) {
			InventoryTransactions inventory = new InventoryTransactions();
			inventory.setTransaction_id(rs.getInt("transaction_id"));
			inventory.setProduct_id(rs.getInt("product_id"));
			inventory.setUser_id(rs.getInt("user_id"));
			inventory.setTransaction_type(rs.getString("transaction_type"));
			inventory.setQuantity(rs.getInt("quantity"));
			
			list.add(inventory);
		}
		
		return list;
	}

	@Override
	public int save(InventoryTransactions user) throws SQLException {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public int insert(InventoryTransactions user) throws SQLException {
		Connection con = Database.getConnection();

		String sql = "insert into inventory_transactions (product_id, user_id, transaction_type, quantity) values (?,?,?,?)";
		
		PreparedStatement ps = con.prepareStatement(sql);
		ps.setInt(1, user.getProduct_id());
		ps.setInt(2, user.getUser_id());
		ps.setString(3, user.getTransaction_type());
		ps.setInt(4, user.getQuantity());
		
		return ps.executeUpdate();
	}

	@Override
	public int update(InventoryTransactions user) throws SQLException {
		Connection con = Database.getConnection();
		
		String sql = "update inventory_transactions set product_id=?, user_id=?, transaction_type=?, quantity_id where transaction_id =? ";
		
		PreparedStatement ps = con.prepareStatement(sql);
		ps.setInt(1, user.getProduct_id());
		ps.setInt(2, user.getUser_id());
		ps.setString(3, user.getTransaction_type());
		ps.setInt(4, user.getQuantity());
		ps.setInt(5, user.getTransaction_id());
		
		return ps.executeUpdate();
	}

	@Override
	public int delete(InventoryTransactions user) throws SQLException {
		Connection con = Database.getConnection();
		
		String sql = "delete from inventory_transactions where transaction_id=?";
		
		PreparedStatement ps = con.prepareStatement(sql);
		
		ps.setInt(1, user.getTransaction_id());
		return 0;
	}

}

package com.system.inventory.backend.model;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class Database {
	private static String url ="jdbc:mysql://localhost:3306/inventory_system";
	private static String user ="root";
	private static String pass ="root";
	
	private Database() {
		
	}
	 
	public static Connection getConnection() throws SQLException{
		Connection con = null;
		con = DriverManager.getConnection(url, user, pass);
		return con;
	}
}

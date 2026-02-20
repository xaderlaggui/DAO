package com.system.inventory.backend.model.dao;
import java.sql.SQLException;
import java.util.List;

public interface DAO<T> {
	
	T get(int id) throws SQLException;
	
	List<T> getALL() throws SQLException;
	
	int save (T user) throws SQLException;
	
	int insert (T user) throws SQLException;
	
	int update (T user) throws SQLException;
	
	int delete (T user) throws SQLException;
	

}

package com.system.inventory.backend.model.dao;
import com.system.inventory.backend.model.*;

import java.sql.SQLException;
import java.util.List;

public interface DAO<User> {
	
	User get(int id) throws SQLException;
	List<User> getALL() throws SQLException;
	int save (User user) throws SQLException;
	int insert (User user) throws SQLException;
	int update (User user) throws SQLException;
	int delete (User user) throws SQLException;
	

}

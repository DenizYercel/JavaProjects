package dao;

import java.sql.ResultSet;
import java.sql.SQLException;

public interface AllDAO<TYPE> {

	ResultSet getData() throws SQLException;
	int add(TYPE t) throws SQLException;
	int update(TYPE t,int id) throws SQLException;
	int update(TYPE t,String id) throws SQLException;
	int delete(int id) throws SQLException;
	int delete(String id)throws SQLException;
}

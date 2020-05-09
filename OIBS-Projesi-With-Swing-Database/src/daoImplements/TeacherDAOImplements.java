package daoImplements;

import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.Date;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.sql.Types;
import java.util.HashMap;

import javax.swing.DefaultComboBoxModel;
import javax.swing.DefaultListModel;

import connection.DbConnection;
import data.Teacher;
import screens.TeacherFrame;

public class TeacherDAOImplements implements dao.AllDAO<Teacher> {

	DbConnection dbConn = new DbConnection();

	@Override
	public ResultSet getData() throws SQLException {
		Statement myStatement = (Statement) dbConn.getMyConn().createStatement();
		ResultSet myResultSet = myStatement
				.executeQuery("Select id,ad,soyad,bolum_id,sicil_no,baslama_tarihi,unvan from OGRETMEN");
		return myResultSet;
		// to_char(baslama_tarihi,'dd/mm/yyyy')
	}

	@Override
	public int add(Teacher e) throws SQLException {
		int bolum_id = e.getBolum_id();
		int sicil_No = e.getSicil_no();

		CallableStatement csInsert = dbConn.getMyConn().prepareCall("{call ADD_OGRETMEN(?,?,?,?,?,?,?)}");
		csInsert.setInt(1, 0);
		csInsert.setString(2, e.getAd());
		csInsert.setString(3, e.getSoyad());
		csInsert.setString(7, e.getUnvan());
		csInsert.setInt(6, e.getBaslamaTarihi());
		csInsert.setInt(5, e.getSicil_no());

		System.out.println(e.getBolum_id());

		csInsert.setInt(4, e.getBolum_id());

		csInsert.registerOutParameter(6, Types.INTEGER);
		csInsert.executeUpdate();

		return csInsert.getInt(6);
	}

	@Override
	public int update(Teacher e, int id) throws SQLException {
		int bolum_id = e.getBolum_id();

		int sicil_No = e.getSicil_no();

		CallableStatement csUpdate = dbConn.getMyConn().prepareCall("{call UPDATE_OGRETMEN(?,?,?,?,?,?,?)}");
		csUpdate.setInt(1, id);
		csUpdate.setString(2, e.getAd());
		csUpdate.setString(3, e.getSoyad());
		csUpdate.setString(7, e.getUnvan());
		csUpdate.setInt(6, e.getBaslamaTarihi());
		csUpdate.setInt(5, e.getSicil_no());

		System.out.println(e.getBolum_id());

		csUpdate.setInt(4, e.getBolum_id());
        
		csUpdate.registerOutParameter(5, Types.INTEGER);
		csUpdate.executeUpdate();
		System.out.println(csUpdate.getInt(5));
		return csUpdate.getInt(5);

	}

	@Override
	public int delete(int id) throws SQLException {
		CallableStatement csDelete = dbConn.getMyConn().prepareCall("{call DELETE_OGRETMEN(?)}");
		csDelete.setInt(1, id);
		// csDelete.registerOutParameter(2, Types.INTEGER);
		csDelete.executeUpdate();

		return csDelete.getInt(2);
	}

	@Override
	public int update(Teacher t, String id) throws SQLException {
		return 0;
	}

	@Override
	public int delete(String id) throws SQLException {
		// TODO Auto-generated method stub
		return 0;
	}

}

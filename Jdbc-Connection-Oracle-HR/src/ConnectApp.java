import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class ConnectApp {

	public static void main(String[] args) throws InterruptedException {
		
		String dbUrl="jdbc:oracle:thin:@localhost:1521:xe";
		
		try {
			Connection myConn=DriverManager.getConnection(dbUrl,"hr","hr");
			System.out.println("Baglantı olustu");
			Statement stmt=myConn.createStatement();
			ResultSet rs=stmt.executeQuery("Select department_id,department_name  from departments where department_id<100");
			while(rs.next()) {
				System.out.println(rs.getInt(1)+" - "+rs.getString(2));
			}
			myConn.close();
			
		} catch (SQLException e) {
			System.out.println("Baglantı olusmadı.");
			e.printStackTrace();
		}

	}

}

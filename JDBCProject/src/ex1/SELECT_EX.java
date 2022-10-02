package ex1;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class SELECT_EX {
	public static void main(String[] args) throws SQLException {
		
		
		String host = "jdbc:mysql://127.0.01:3306/java2_db";
		String user = "root";
		String pass = "dnjswjd@1523";
		
		
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			Connection conn = DriverManager.getConnection(host, user, pass);
			Statement stmt = conn.createStatement();
			
			String sql = "SELECT * from `NOTICE`;";
			
			ResultSet rs = stmt.executeQuery(sql);
			
			rs.next();
			String title = rs.getString("title");
			System.out.println(title);
			
			rs.close();
			stmt.close();
			conn.close();
			
			
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		}
		
	}
}

package ex1;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class INSERT_EX {
	public static void main(String[] args) throws SQLException {
		
		String host = "jdbc:mysql://127.0.01:3306/java2db";
		String user = "root";
		String pass = "dnjswjd@1523";
		
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			Connection conn = DriverManager.getConnection(host, user, pass);
			Statement stmt = conn.createStatement();
		
			String sql3 = "INSERT INTO `User1` VALUES('j104','홍길동','010-1234-1004',33);";
			
			stmt.executeUpdate(sql3);
			
			stmt.close();
			conn.close();
			

			
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		}
		
		
		System.out.println("INSERT 종료...");
	}
}

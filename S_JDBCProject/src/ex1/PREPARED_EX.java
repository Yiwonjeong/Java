package ex1;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;

public class PREPARED_EX {
	public static void main(String[] args) {
		
		String host = "jdbc:mysql://127.0.01:3306/java2db";
		String user = "root";
		String pass = "dnjswjd@1523";
		
		try {
			
			Class.forName("com.mysql.cj.jdbc.Driver");
			Connection conn = DriverManager.getConnection(host, user, pass);
			
			
			String sql = "INSERT INTO `User1` VALUES (?,?,?,?);";
			PreparedStatement psmt = conn.prepareStatement(sql);
			
			psmt.setString(1, "j102");
			psmt.setString(2, "라마바");
			psmt.setString(3, "010-1552-1001");
			psmt.setInt(4, 57);
			
			psmt.executeUpdate();
			
			psmt.close();
			conn.close();
			
		} catch (Exception e) {
			e.printStackTrace();
		}
		System.out.println("PREPARED 종료...");
	}
}

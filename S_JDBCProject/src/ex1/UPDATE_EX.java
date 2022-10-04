package ex1;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;

public class UPDATE_EX {
	public static void main(String[] args) {
		
		String host = "jdbc:mysql://127.0.01:3306/java2db";
		String user = "root";
		String pass = "dnjswjd@1523";
		
		try {
			
			Class.forName("com.mysql.cj.jdbc.Driver");
			Connection conn = DriverManager.getConnection(host, user, pass);
			Statement stmt = conn.createStatement();
			
			String sql = "UPDATE `User1` SET `name`='가나다', `hp`='010-1234-1005' ";
				   sql += "WHERE `uid`='j104';";
			
			stmt.executeUpdate(sql);
			
			stmt.close();
			conn.close();
			
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		System.out.println("Update 완료...");
		
	}
}

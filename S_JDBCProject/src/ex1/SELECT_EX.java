package ex1;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class SELECT_EX {
	public static void main(String[] args) throws SQLException {
		
		
		String host = "jdbc:mysql://127.0.01:3306/java2db";
		String user = "root";
		String pass = "dnjswjd@1523";
		
		
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			Connection conn = DriverManager.getConnection(host, user, pass);
			Statement stmt = conn.createStatement();
			
			String sql = "SELECT * from `User1`;";
			ResultSet rs = stmt.executeQuery(sql);
			
			while(rs.next()) {
				String uid = rs.getString(1);
				String name = rs.getString(2);
				String hp = rs.getString(3);
				int age = rs.getInt(4);
				
				System.out.printf("%s,%s,%s,%d\n", uid, name, hp, age);
			
			}

			rs.close();
			stmt.close();
			conn.close();
			
			
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		}
		
	}
}

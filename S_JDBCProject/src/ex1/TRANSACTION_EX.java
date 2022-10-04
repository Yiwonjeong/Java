package ex1;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Savepoint;
import java.sql.Statement;
import java.util.Scanner;

public class TRANSACTION_EX {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("에러를 발생하시겠습니까?");
		int answer = sc.nextInt();
		
		String host = "jdbc:mysql://127.0.01:3306/java2_Bank";
		String user = "root";
		String pass = "dnjswjd@1523";
		
		String sql1 = "UPDATE `bank_account` set `a_balance`=`a_balance`-10000 where `a_no`=?;";
		String sql2 = "UPDATE `bank_account` set `a_balance`=`a_balance`+10000 where `a_no`=?;";
		
		try {
			
			Class.forName("com.mysql.cj.jdbc.Driver");
			Connection conn = DriverManager.getConnection(host, user, pass);
			conn.setAutoCommit(false);
			Statement stmt = conn.createStatement();
			
			// SELECT
			String sql = "SELECT * from `bank_account`;";
			ResultSet rs = stmt.executeQuery(sql);
			while(rs.next()) {
				String a_no = rs.getString(1);
				String a_item_dist = rs.getString(2);
				String a_item_name = rs.getString(3);
				String a_c_no = rs.getString(4);
				Integer a_balance = rs.getInt(5);
				String a_open_date = rs.getString(6);
				
				System.out.printf("%s %s %s %s %d %s\n",a_no,a_item_dist,a_item_name,a_c_no,a_balance,a_open_date);
			}
			
			// 세이브 포인트1 설정
			Savepoint savepoint1 = conn.setSavepoint("ROWS_DELETED_1");
			
			
			// DELETE
			String SQL = "DELETE FROM `bank_account` WHERE `a_no`='101-11-1001';";
			stmt.executeUpdate(SQL);
			
			// 지우기 실수! 되돌리자!! rollback
			conn.rollback(savepoint1);
			
			// 트랜잭션 
			PreparedStatement psmt1 = conn.prepareStatement(sql1);
			psmt1.setString(1, "101-11-1001");
			
			PreparedStatement psmt2 = conn.prepareStatement(sql2);
			psmt2.setString(1, "101-22-1006");
			
			psmt1.executeUpdate();
			
			if(answer == 1) {
				throw new Exception("의도치 않은 에러 발생!!!");
			}
			
			psmt2.executeUpdate();
			
			conn.commit();
			psmt2.close();
			psmt1.close();
			conn.close();
			
			
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		System.out.println("Transaction 완료...");
		
	}
}



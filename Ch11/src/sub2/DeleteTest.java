package sub2;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;

/* 
 * 작성자: 이원정
 * 작성일: 2022.09.15
 * 내용: JDBC Delete 실습하기
 */
public class DeleteTest {
	public static void main(String[] args) {

		//DB 정보
		String host = "jdbc:mysql://127.0.01:3306/java2db";
		String user = "root";
		String pass = "dnjswjd@1523";
		
		
		try {
			//1단계
			Class.forName("com.mysql.cj.jdbc.Driver");

			//2단계: 데이터베이스 접속
			Connection conn = DriverManager.getConnection(host, user, pass);
			
			//3단계: Statement 생성 (SQL 실행 객체)
			Statement stmt = conn.createStatement();
			
			//4단계
			String sql = "DELETE FROM `User1` WHERE `uid` = 'j102';";
			stmt.executeUpdate(sql);
			
			//5단계
			
			
			//6단계
			stmt.close();
			conn.close();
			
		} catch (Exception e) {
			e.printStackTrace();
		}
		System.out.println("Delete Test 완료...");
	}

}

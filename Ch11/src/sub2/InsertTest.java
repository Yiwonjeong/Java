package sub2;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;

/* 
 * 작성자: 이원정
 * 작성일: 2022.09.15
 * 내용: JDBC Insert 실습하기
 */
public class InsertTest {
	public static void main(String[] args) {

		//DB 정보
		String host = "jdbc:mysql://127.0.01:3306/java2db";
		String user = "root";
		String pass = "dnjswjd@1523";
		
		try {
			//1단계: JDBC 드라이버 로드
			Class.forName("com.mysql.cj.jdbc.Driver");

			//2단계: 데이터베이스 접속
			Connection conn = DriverManager.getConnection(host, user, pass);
			
			//3단계: Statement 생성 (SQL 실행 객체)
			Statement stmt = conn.createStatement();
			
			//4단계: SQL 실행
		
			String sql2 = "INSERT INTO `User1` VALUES('j102','강감찬','010-1234-1002',28);";
			
			stmt.executeUpdate(sql2);
			
			//5단계: SELECT 결과처리
			//6단계: 데이터베이스 종료
			stmt.close();
			conn.close();
			
		} catch (Exception e) {
			e.printStackTrace();
		}
		System.out.println("Insert 완료...");
	}
}

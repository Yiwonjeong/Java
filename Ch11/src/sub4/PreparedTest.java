package sub4;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.Statement;

/* 
 * 작성자: 이원정
 * 작성일: 2022.09.15
 * 내용: JDBC Prepared 실습하기
 */
public class PreparedTest {
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
			String sql = "INSERT INTO `User1` VALUES (?,?,?,?);";
			PreparedStatement psmt = conn.prepareStatement(sql);
			psmt.setString(1, "j101");
			psmt.setString(2, "김유신");
			psmt.setString(3, "010-1022-1001");
			psmt.setInt(4, 27);
			
			//4단계:
			psmt.executeUpdate();
			
			//5단계:
			//6단계:
			psmt.close();
			conn.close();
			
			
		} catch (Exception e) {
			e.printStackTrace();
		}
		System.out.println("Prepared 실행 완료...");
		
		
	}
}

package sub1;

import java.sql.Connection;
import java.sql.DriverManager;

/* 
 * 작성자: 이원정
 * 작성일: 2022.09.14
 * 내용: JDBC 접속 테스트
 * 
 * JDBC (Java Database Connectivity)
 * - 자바에서 데이터베이스 연결을 위한 기술 표준
 * - Java는 기본적으로 JDBC 라이브러리를 포함하고 해당 DBMS에 맞는 드라이버만 다운로드 및 설정
 */

public class JDBCTest {
	public static void main(String[] args) {
		
		// DB 정보
		String host = "jdbc:mysql://127.0.01:3306/java2db";
		String user = "root";
		String pass = "dnjswjd@1523";
		
		try {
		// 1단계: JDBC 드라이버 로드
		Class.forName("com.mysql.cj.jdbc.Driver");
		
		// 2단계: 데이터베이스 접속(연결)
		Connection conn = DriverManager.getConnection(host, user, pass);
		
		if (conn != null) {
			System.out.println("데이터 베이스 접속 성공!");
		}else {
			System.out.println("데이터 베이스 접속 실패!");
		}
		
		// 3단계:
		// 4단계:
		// 5단계:
		// 6단계:
		}catch (Exception e) {
			e.printStackTrace();
		}
		
		System.out.println("데이터베이스 접속 테스트 완료...");
		
		
		
		
	}
}

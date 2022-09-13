package sub1;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

/* 
 * 작성자: 이원정
 * 작성일: 2022.09.13
 * 내용: 파일 입출력 스트림 실습하기
 */
public class FileIOTest {

	public static void main(String[] args) {

		String path = "/Users/iilhwan/Desktop/Workspace/Java/SimpleTest1.rtf";
		
		try {
			FileInputStream fis = new FileInputStream(path);
			
			while(true) {
				
				int data = fis.read();
				
				if (data == -1) {
					break; // 파일을 모두 읽었을 경우
				}
				
				//데이터 출력
				char c = (char) data;
				System.out.print(c);
			}
			
			// 연결 후 연결 끊기
			fis.close();
			
			
			
			
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
		
		System.out.println("프로그램 종료...");
	}

}

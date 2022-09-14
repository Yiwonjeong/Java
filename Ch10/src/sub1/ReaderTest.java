package sub1;

import java.io.FileNotFoundException;
import java.io.FileReader;

/* 
 * 작성자: 이원정
 * 작성일: 2022.09.14
 * 내용: 문자 스트링 실습하기
 */
public class ReaderTest {
	public static void main(String[] args) {
		
		String path = "/Users/iilhwan/Desktop/Workspace/Java/SampleTest1.rtf";
		
		try {
			FileReader fr = new FileReader(path);
			
			while(true) {
				
				int data = fr.read();
				
				if( data == -1) {
					break;
				}
				
				char c = (char) data;
				System.out.print(c);
			}
			
			fr.close();
			
			
			
		} catch (Exception e) {
			e.printStackTrace();
		}
	
		System.out.println("문자 스트림 종료...");
		
		
		
	}
}

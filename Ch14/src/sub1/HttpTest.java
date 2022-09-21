package sub1;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.net.URL;

/*
 * 이름: 이원정
 * 날짜: 2022/09/21
 * 내용: HTTP 실습하기
 */
public class HttpTest {
	public static void main(String[] args) {
		
		try {
			
			URL url1 = new URL("http://www.goole.com");
			
			// 문자 전용 스트림 
			BufferedReader br = new BufferedReader(new InputStreamReader(url1.openStream()));
			
			String line = null;
			
			while ((line = br.readLine()) !=null) {
				System.out.println(line);
			}
			
			br.close();
			
		} catch (Exception e) {
			e.printStackTrace();
		}
		
	}
}

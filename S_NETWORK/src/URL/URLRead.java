package URL;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.MalformedURLException;
import java.net.URL;

// URL 주소에서 데이터 읽기 
public class URLRead {
	public static void main(String[] args) {
		
		try {
			
			//URL 객체 생성
			URL url = new URL("https://www.naver.com/");
			
			//URL 객체에서 입력 스트림 생성
			BufferedReader br = new BufferedReader(new InputStreamReader(url.openStream()));
			String inputLine = "";
			
			// inputLine이 null이 아닐 때 한 행씩 읽기
			while ( (inputLine = br.readLine()) !=null ) {
				System.out.println(inputLine);
			}
			br.close();
			
		} catch (MalformedURLException e) {
			e.printStackTrace();
			System.out.println("URL에서 데이터를 읽는 중 오류가 발생했습니다.");
		} catch (IOException e) {
			e.printStackTrace();
		}
		
	}
}

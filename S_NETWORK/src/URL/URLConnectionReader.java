package URL;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.URL;
import java.net.URLConnection;

public class URLConnectionReader {
	public static void main(String[] args) {
		
		try {
			
			// URL 객체 생성
			URL url = new URL("https://www.daum.net/");
			
			// URL 객체에서 URL Connection 객체 생성
			URLConnection uc = url.openConnection();
			BufferedReader br = new BufferedReader(new InputStreamReader(uc.getInputStream()));
			
			String line = null;
			
			while ( (line = br.readLine()) != null) {
				System.out.println(line);
		
			}
			br.close();
			
			
			
		} catch (IOException e) {
			System.out.println("URL에서 데이터를 읽는 중 오류가 발생했습니다.");
		}
		
	}
}

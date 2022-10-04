package URL;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.net.URL;
import java.net.URLConnection;

public class URLConnectionWriter {
	public static void main(String[] args) {
		
		
		try {
			
			// 1. URL 생성
			URL url = new URL("http://www.snee.com/xml/crud/posttest.cgi");
			
			// 2. URL Connection 객체 생성
			URLConnection uc = url.openConnection();
			
			// 3. 출력모드 설정: setDoOutput() -> doOutput 필드를 true로 설정
			uc.setDoOutput(true);
			
			// (4. concat() 메소드로 연결 설정)
			// 5. 출력 스트림 
			OutputStreamWriter out = new OutputStreamWriter(uc.getOutputStream());
			// 5-1. 서버에 데이터 보내기
			out.write("fname=Wonjeong&Iname=Yi");
			out.close();
			
			// 입력 스트림 생성
			BufferedReader br = new BufferedReader(new InputStreamReader(uc.getInputStream()));
			
			// 6. 데이터 출력
			String line = null;
			while ( (line=br.readLine()) != null) {
				System.out.println(line);
			}
			// 7. 스트림 닫기
			br.close();
			
		} catch (IOException e) {
			System.out.println("URL에서 데이터를 입출력 중 오류가 발생했습니다.");
		}
		
		
	}
}

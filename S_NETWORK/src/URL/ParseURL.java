package URL;

import java.net.MalformedURLException;
import java.net.URL;

/*
 * URL 파싱하기
 */

public class ParseURL {
	public static void main(String[] args) {
		
		URL opinion = null;
		URL homePage = null;
		
		try {
			homePage = new URL("http://news.hankooki.com:80");	// 절대 경로로 URL 객체 생성
			opinion = new URL(homePage,"opinion/editorial.htm");// 상대 경로로 URL 객체 생성
			
		} catch (MalformedURLException e) {
			System.out.println("잘못된 URL입니다.");
		}
		System.out.println("protocol = "+opinion.getProtocol());
		System.out.println("host = "+opinion.getHost());
		System.out.println("port = "+opinion.getPort());
		System.out.println("path = "+opinion.getPath());
		System.out.println("filename = "+opinion.getFile());
		
	}
}

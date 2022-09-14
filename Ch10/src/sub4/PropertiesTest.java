package sub4;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.util.Properties;

/* 
 * 작성자: 이원정
 * 작성일: 2022.09.14
 * 내용: 프로퍼티(속성) 실습하기
 * stream하고 연결되는 자료 구조 
 * 
 * 프로퍼티 (Properties)
 * - 문자열 데이터만 취급하는 Key-value 자료 구조
 * - 프로그램의 환경설정 값을 저장할 때 사용하는 자료 구조
 * - 입출력 스트림으로 데이터 입출력
 */
public class PropertiesTest {
	public static void main(String[] args) {

		// 프로퍼티 생성
		Properties prop = new Properties();
		
		prop.setProperty("A", "Apple");
		prop.setProperty("B", "Banana");
		prop.setProperty("C", "Cherry");
		
		System.out.println(prop);
		
		// 프로퍼티 파일 생성
		String path = "/Users/iilhwan/Desktop/Fruit.properties";
		try {
			FileOutputStream fos = new FileOutputStream(path);
			prop.store(fos, null); // 파일쓰기
			
			
			fos.close();
			
			
		} catch (Exception e) {
			e.printStackTrace();
		}

		System.out.println("프로퍼티 파일 생성 완료...");
		
		// 프로퍼티 객체 생성
		String target = "/Users/iilhwan/Desktop/Cities.properties";
		Properties propCities = new Properties();
		
		try {
			FileInputStream fis = new FileInputStream(target);
			propCities.load(fis); // 파일 읽기
			
			
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		System.out.println(propCities);
		System.out.println(propCities.getProperty("kor"));
		System.out.println("프로퍼티 객체 생성완료...");
		
		
		
		
	}
}

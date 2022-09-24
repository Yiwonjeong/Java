package ch11_1;

public class toCharArrayTest {
	public static void main(String[] args) {
		
		// 문자열
		String str = "ABC";
		
		// 문자열을 char[]로 변환
		char [] charArr = str.toCharArray();
		
		// char[] 출력
		for ( int i=0; i<charArr.length; i++ ) {
			System.out.println(charArr[i]);
		}
		
	}
}

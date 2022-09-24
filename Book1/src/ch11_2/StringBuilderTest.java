package ch11_2;

public class StringBuilderTest {
	public static void main(String[] args) {
		
		String str1 = new String("Java");
		System.out.println("str1의 문자열 주소: " + System.identityHashCode(str1));
		
		// String으로부터 StringBuilder 생성
		StringBuilder buffer = new StringBuilder(str1);
		System.out.println("연산 전 buffer 메모리 주소: " + System.identityHashCode(buffer));
		
		// 문자열 추가
		buffer.append(" and");
		buffer.append(" android");
		buffer.append(" programming is fun!");
		System.out.println("연산 후 buffer 메모리 주소: " + System.identityHashCode(buffer));
		
		// String 클래스로 변환
		str1 = buffer.toString();
		System.out.println(str1);
		System.out.println("연결된 str1의 문자열 주소: " + System.identityHashCode(str1));
	}
}

package ch11_2;

public class StringTest2 {
	public static void main(String[] args) {
		
		String str1 = new String("ABC");
		String str2 = new String("DEF");
		
		System.out.println("문자열1: " + str1);
		System.out.println("문자열2: " + str2);
		
		str1 = str1.concat(str2);
		
		System.out.println("문자열1 + 문자열2: " + str1);
		
	}
}

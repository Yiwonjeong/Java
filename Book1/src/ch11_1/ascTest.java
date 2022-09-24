package ch11_1;

public class ascTest {
	public static void main(String[] args) {
		
		String str = "ASC#2!";
		
		for (int i=0; i<str.length(); i++) {
			
			// 10진수
			System.out.println(str.charAt(i) + " = " + (int)str.charAt(i));
		}
		
	}
}

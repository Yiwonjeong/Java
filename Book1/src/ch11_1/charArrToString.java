package ch11_1;

public class charArrToString {
	public static void main(String[] args) {
		
		char [] charArr = {'A','B','C'};
		
		// (1) String 생성자
		String str1 = new String(charArr);
		System.out.println(str1);
		
		// (2) String.valueOf()
		String str2 = String.valueOf(charArr);
		System.out.println(str2);
		
		// (3) String.copyValueOf()
		String str3 = String.copyValueOf(charArr);
		System.out.println(str3);
		
	}
}

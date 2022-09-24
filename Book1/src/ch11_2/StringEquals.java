package ch11_2;

public class StringEquals {
	public static void main(String[] args) {
		
		String s1 = "Java";
		String s2 = "Java";
		String s3 = new String ("Java");
		String s4 = new String ("Java");

		System.out.println(s1.equals(s2));
		System.out.println(s3.equals(s4));
		
	}
}

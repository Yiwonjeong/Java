package ch08_p370;

import java.util.Scanner;

public class ProgrmmingTest1 {
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		
		System.out.print("문자열을 입력하시오: ");
		String str = sc.nextLine();

		String [] array = str.split(" ");

		for (String token : array) {
			System.out.println(token);
		}
		System.out.println(array.length);
		
	}
}


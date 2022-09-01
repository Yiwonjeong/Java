package sub02;

import java.util.Scanner;



/* 
 * 작성자: 이원정
 * 작성일: 2022.08.26
 * 내용: Java 메서드 연습문제
 */
public class Test06 {
	
	public static void intro() {
		System.out.println("******* START *******");
		System.out.println("두 개의 정수를 입력");
	}
	
	public static int input(Scanner sc, String name) {
		System.out.print("변수 "+name+"값 입력: ");
		int input = sc.nextInt();
		return input; 
	}
	public static void reslut(int val) {
		System.out.println("덧셈 결과: " +val);
		System.out.println("******* END *******");
	}
	
	public static int add (int x, int y) {
		return x + y;
	}

	
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		
		intro();
		
		int a = input(sc, "a");
		int b = input(sc, "b");
		
		int output = add(a,b);
		reslut(output);
		
		sc.close();
		
		
		
	}

}
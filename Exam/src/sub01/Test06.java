package sub01;

import java.util.Scanner;

/* 
 * 작성자: 이원정
 * 작성일: 2022.08.19
 * 내용: Java 삼항연산자 연습문
 */


public class Test06 {

	public static void main(String[] args) {

		Scanner sc=new Scanner(System.in);
		
		System.out.print("x값 입력: ");
		int x=sc.nextInt();
		
		System.out.println("y값 입력: ");
		int y=sc.nextInt();
		
		String result;
		result = (x>y) ? "x가 더 큽니다." : "y가 더 큽니다.";
		
		System.out.println(result);
		
	}

}

package step03;

import java.util.Scanner;

/* 
 * 작성자: 이원정
 * 작성일: 2022.08.28
 * 내용: 백준 3단계 11번 문제(10925) A+B-5
 */
public class _11 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		
		
		while (true) {
			
			int a = sc.nextInt();
			int b = sc.nextInt();
			
			if (a==0 && b==0) {
				break;
			}
			System.out.println( a+b );
		}
		
			
		
	}

}

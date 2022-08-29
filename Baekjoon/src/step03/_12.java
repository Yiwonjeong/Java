package step03;

import java.io.IOException;
import java.util.Scanner;

/* 
 * 작성자: 이원정
 * 작성일: 2022.08.28
 * 내용: 백준 3단계 12번 문제(10951) A+B-4
 */

public class _12 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		
		while (sc.hasNextInt()) {
			
			int a = sc.nextInt();
			int b = sc.nextInt();
			
			System.out.println( a+b);
			
		}
	}
}
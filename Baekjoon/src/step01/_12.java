package step01;

import java.util.Scanner;
/* 
 * 작성자: 이원정
 * 작성일: 2022.08.20
 * 내용: 백준 1단계 11번 문제(2588). 곱셈
 */

public class _12 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int A = sc.nextInt();
		int B = sc.nextInt();
		
		System.out.println( A * ( B % 10 ) );
		System.out.println(  A * (( B % 100 ) / 10 ));
		System.out.println( A *  (B / 100) );
		System.out.println( A * B );

	}

}


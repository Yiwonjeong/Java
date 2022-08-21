package step02;

/* 
 * 작성자: 이원정
 * 작성일: 2022.08.20
 * 내용: 백준 2단계 1번 문제(25083). 
 */

import java.util.Scanner;

public class _01 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		
		int A = sc.nextInt();
		int B = sc.nextInt();
		
		if (A>B) {
			System.out.println(">");
		}else if(A<B){
			System.out.println("<");
		}else if(A==B) {
			System.out.println();
		}
	}

}

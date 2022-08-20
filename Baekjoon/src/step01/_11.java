package step01;

import java.util.Scanner;
/* 
 * 작성자: 이원정
 * 작성일: 2022.08.20
 * 내용: 백준 1단계 11번 문제(10430). 나머지

 * 첫째 줄에 (A+B)%C
 * 둘째 줄에 ((A%C) + (B%C))%C
 * 셋째 줄에 (A×B)%C
 * 넷째 줄에 ((A%C) × (B%C))%C를 출력한다.
 */
public class _11 {

	public static void main(String[] args) {
		
	 Scanner sc = new Scanner(System.in);
	 
	 int A = sc.nextInt();
	 int B = sc.nextInt();
	 int C = sc.nextInt();
	 
	sc.close();
	
	System.out.println( (A+B) % C );
	System.out.println( (A%C + B%C) %C );
	System.out.println( (A * B) % C);
	System.out.println((A % C * B % C) % C);

	}

}

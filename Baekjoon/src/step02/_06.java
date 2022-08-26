package step02;

/* 
 * 작성자: 이원정
 * 작성일: 2022.08.22
 * 내용: 백준 2단계 6번 문제(2525)
 */

import java.util.Scanner;

public class _06 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		
		int A = sc.nextInt(); //HOUR 입력
		int B = sc.nextInt(); //MINUATE 입력
		int C = sc.nextInt(); //TIME 입력
	
		int min = (A*60)+B;
		min = min + C;
		
		int hour = (min/60)%24;
		min  = (min% 60);
		
		System.out.println(hour +" "+min);
			
	}

}

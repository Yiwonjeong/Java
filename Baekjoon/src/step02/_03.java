package step02;

/* 
 * 작성자: 이원정
 * 작성일: 2022.08.22
 * 내용: 백준 2단계 3번 문제(2753)
 */

import java.util.Scanner;

public class _03 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		
		int year = sc.nextInt();
		
		if(( year % 4 == 0 ) && (year % 100 != 0)) {
			System.out.println("1");
		}
		else if(year%400==0) {
			System.out.println("1");
		}
		else {
			System.out.println("0");
		}
		
	}

}

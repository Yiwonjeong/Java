package step03;
/* 
 * 작성자: 이원정
 * 작성일: 2022.08.22
 * 내용: 백준 3단계 1번 문제(2739), 구구단
 */

import java.util.Scanner;

public class _01 {

	public static void main(String[] args) {

	Scanner sc = new Scanner(System.in);
	
	int N = sc.nextInt();
	int i;
	
	for (i=1; i<=9; i++) {
		System.out.println(N+" * "+i+" = "+ N*i);
	}
	
	}

}

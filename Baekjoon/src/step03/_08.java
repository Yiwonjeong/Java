package step03;

import java.util.Scanner;

/* 
 * 작성자: 이원정
 * 작성일: 2022.08.27
 * 내용: 백준 3단계 7번 문제(2438) 별 찍기 -1
 */
public class _08 {

	public static void main(String[] args) {

	Scanner sc = new Scanner(System.in);
	
	int n = sc.nextInt();
	
	for (int i=0; i<n; i++) {
		
		for(int j=0; j<i*1+1; j++) {
			System.out.print("*");
		}
		System.out.print("\n");
	}
		
	}

}

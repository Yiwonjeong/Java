package step03;
/* 
 * 작성자: 이원정
 * 작성일: 2022.08.28
 * 내용: 백준 3단계 9번 문제(2439) 별 찍기 -2
 */

import java.util.Scanner;

public class _09 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		
		int n =sc.nextInt();
		
		for(int i=0; i<n; i++) {
			
			for(int j=n-1; j>=i*1+1; j--) {
				System.out.print(" ");
			}
			for (int k=1; k<=i*1+1; k++) {
				System.out.print("*");
			}
			System.out.print("\n");
			
		}	
			
			
	}
}

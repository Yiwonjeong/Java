package step03;

import java.util.Scanner;

/* 
 * 작성자: 이원정
 * 작성일: 2022.08.27
 * 내용: 백준 3단계 7번 문제(11022) A+B-8
 */

public class _07 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		
		int t = sc.nextInt();
		
		int arrA[] = new int[t];
		int arrB[] = new int[t];
		int sum[]= new int[t];
		
		for( int i=0; i<t; i++) {
			
			int a = sc.nextInt();
			int b = sc.nextInt();
			
			arrA[i]=a;
			arrB[i]=b;
			sum[i]=a+b;
		}
		
		for ( int j=1; j<=t; j++) {
			
			System.out.println("Case #"+j+": "+arrA[j-1]+" + "+arrB[j-1]+" = "+sum[j-1]);
		}
		
		
		
	}

}

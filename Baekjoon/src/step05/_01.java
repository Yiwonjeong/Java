package step05;

import java.util.Scanner;

/* 
 * 작성자: 이원정
 * 작성일: 2022.09.09
 * 내용: 백준 5단계 1번 문제(15596) 정수 N개의 합
*/

public class _01 {
	
	static long sum(int[] a) {
		long ans = 0;
		
		for(int i=0; i<a.length; i++) 
			ans += a[i];
		return ans;
	}
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int ar [] = new int[n];
		
		for(int i=0; i<ar.length; i++) 
			ar[i] = sc.nextInt();
			System.out.println(sum(ar));
		
	}
	
	
}

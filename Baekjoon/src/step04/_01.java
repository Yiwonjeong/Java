package step04;

import java.util.Arrays;
import java.util.Scanner;

/* 
 * 작성자: 이원정
 * 작성일: 2022.08.31
 * 내용: 백준 4단계 1번 문제(10818) 최소 최대 
 */
public class _01 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		int arr[] = new int[n];
		
		for (int i=0; i<n; i++) {
			
			arr[i]= sc.nextInt();
			
		}
		sc.close();
		Arrays.sort(arr);
		
		System.out.println(arr[0]+" "+arr[n-1]);
		
		
	}

}

package step03;

import java.util.Scanner;

/* 
 * 작성자: 이원정
 * 작성일: 2022.08.27
 * 내용: 백준 3단계 6번 문제(11021) A+B-7
 */
public class _06 {

	public static void main(String[] args) {

		
		Scanner sc = new Scanner(System.in);
		
		int t = sc.nextInt();
		
		int arr[]=new int[t];
		
		for (int i=0; i<t; i++) {
			
			int a = sc.nextInt();
			int b = sc.nextInt();
		
			arr[i]=a+b;    		
		}
		
		for (int j=1; j<=t; j++) {
			
			System.out.println("Case #" + j + ": " + arr[j-1]);
		}
			
		
	}

}

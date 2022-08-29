package step03;

import java.util.Scanner;

/* 
 * 작성자: 이원정
 * 작성일: 2022.08.28
 * 내용: 백준 3단계 10번 문제(10871) x보다 작은 수 
 */
public class _10 {

	public static void main(String[] args) {

		
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		int x = sc.nextInt();
		
		
		int [] arr = new int[n];
		
		for (int i=0; i<n; i++) {
			int j = sc.nextInt();
			arr[i]=j;
		}
		
		for (int k=0; k<n; k++) {
			if(arr[k]<x) {
				System.out.print(arr[k]+" ");
			}else { }
		}
		
		
	}

}

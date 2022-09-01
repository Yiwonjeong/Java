package step04;

import java.util.Scanner;

/* 
 * 작성자: 이원정
 * 작성일: 2022.08.31
 * 내용: 백준 4단계 2번 문제(2562) 최댓값 
 * - Max 함수 활용하여 최댓값 구하기
 * int max=0;
 */

public class _02 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int arr [] = new int [9];
		int max=0;
		int number=0;
		
		for ( int i=0; i<9; i++) {
			
			arr[i]=sc.nextInt();
			if(arr[i]>max) {
				max = arr[i];
				number = (i+1);
			}
		
		}
		System.out.println(max);
		System.out.println(number);

	}
}	

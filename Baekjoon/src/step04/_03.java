package step04;

import java.util.Scanner;

/* 
 * 작성자: 이원정
 * 작성일: 2022.08.31
 * 내용: 백준 4단계 3번 문제(3052) 나머지 
*/
public class _03 {
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
	
		int arr[] = new int [10];	
		int count = 0;
	
		for (int i=0; i<10; i++) {
			arr[i]=sc.nextInt();
			arr[i]=arr[i]%42;
		}
		
		for (int i=0; i<10; i++) {
			int cnt = 0;
			for (int j=i+1; j<10; j++) {
				if (arr[i]==arr[j]) {
					cnt++;
				}
			}
			if (cnt == 0) {
				count++;
			}
		}
		System.out.println(count);
		
	
	}
		
}

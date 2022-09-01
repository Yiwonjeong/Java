package step04;

import java.util.Arrays;
import java.util.Scanner;

/* 
 * 작성자: 이원정
 * 작성일: 2022.08.31
 * 내용: 백준 4단계 4번 문제(1546) 평균 
*/
public class _04 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		
		
		double arr[] = new double[sc.nextInt()];
		
		double max = 0;
		double sum=0;
		
		for (int i=0; i<arr.length; i++) {
			arr[i]=sc.nextInt();
			
			if (arr[i]>max) {
				max = arr[i];	
			}
		}
		for (int i=0; i<arr.length; i++) {
			sum += (arr[i]/max)*100;
			
		}
		
		double avg = 0;
		
		avg = sum/arr.length;
		System.out.println(avg);
		
	}

}

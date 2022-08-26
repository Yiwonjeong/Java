package step03;
/* 
 * 작성자: 이원정
 * 작성일: 2022.08.23
 * 내용: 백준 3단계 2번 문제(10950)
 */
import java.util.Scanner;

public class _02 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		
		int t = sc.nextInt();
		int [] arr = new int[t];
		
		for (int i=0; i<t; i++) {
			
			int a = sc.nextInt();
			int b = sc.nextInt();
			
			arr[i]=a+b;
		}
		sc.close();
		
		for( int k:arr ) {
			System.out.println(k);
		}
		
		
		
	}

}

package step03;
/* 
 * 작성자: 이원정
 * 작성일: 2022.08.25
 * 내용: 백준 3단계 3번 문제(8393)
 */
import java.util.Scanner;

public class _03 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		int sum = 0;
		
		for(int i=0; i<=n; i++) {
			
			
			sum += i;

		}
		
		System.out.println(sum);
	}

}

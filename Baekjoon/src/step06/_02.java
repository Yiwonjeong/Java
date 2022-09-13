package step06;
/* 
 * 작성자: 이원정
 * 작성일: 2022.09.09
 * 내용: 백준 6단계 2번 문제(11720) 숫자의 합
*/
import java.util.Scanner;

public class _02 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int N = sc.nextInt();
		String a = sc.next();
		
		int sum = 0;
		
		for (int i=0; i<N; i++) {
			int result = a.charAt(i);
			sum += result - 48;
			// 아스키코드: 0=48,-48을 하면 원래 정수 출력
		}
		System.out.println(sum);
		
		
		
	}

}

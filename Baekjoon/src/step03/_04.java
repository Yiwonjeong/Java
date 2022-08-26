package step03;
/* 
 * 작성자: 이원정
 * 작성일: 2022.08.25
 * 내용: 백준 3단계 4번 문제(25304) 영수증
 */
import java.util.Scanner;

public class _04 {

	public static void main(String[] args) {

	Scanner sc = new Scanner(System.in);

	int total = sc.nextInt();
	int count = sc.nextInt();
	
	for(int i=1; i<=count; i++) {
		
		int price = sc.nextInt();
		int num = sc.nextInt();
		
		total = total - (price * num);
		
	}
	if (total == 0) {
		System.out.println("Yes");
	}else {
		System.out.println("No");
	}
	
	
	}
}

package step05;
/* 
 * 작성자: 이원정
 * 작성일: 2022.09.09
 * 내용: 백준 5단계 3번 문제(1065) 등차수열, 한수
*/
import java.util.Scanner;

public class _03 {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);

		System.out.println(arithmetic_sequence(sc.nextInt()));
		sc.close();
	}
	
	public static int arithmetic_sequence (int num) {
		
		int count = 0;
		
		if (num<100) {  
			return num; 
		}
		
		else  {
			count = 99;
			if (num == 1000) {
				num = 999;
			}
			
			for (int i=100; i<=num; i++) {
				
				int hun = i/100;
				int ten = (i/10)%10;
				int one = (i%10);
				
				if ((hun-ten) == (ten-one)) {
					count ++;
				}
			}
		}
		return count;
		

			
			
			
	}

}

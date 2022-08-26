package step02;

/* 
 * 작성자: 이원정
 * 작성일: 2022.08.22
 * 내용: 백준 2단계 7번 문제(2480)
 */
import java.util.Scanner;

public class _07 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		
		int A = sc.nextInt();
		int B = sc.nextInt();
		int C = sc.nextInt();
		int Max=0;
		
		//숫자 3개가 모두 다를 경우
		if (A!=B && B!=C && A!=C) {
			if(A>B) {
				if(C>A) {Max=C;}
				else {Max=A;}
				System.out.println(Max*100);
			}
			else if(B>C) {
				Max=B;
			System.out.println(Max*100);
			}
			else {
				Max=C;
				System.out.println(Max*100);
			}
		}
	
		
		//숫자 2개가 같을 경우
		if (A==B && A!=C){
			System.out.println(1000+A*100);}
		else if (A==C && A!=B) {System.out.println(1000+A*100);}
		else if (B==C && A!=B) {System.out.println(1000+B*100);}
		
		//숫자가 모두 같을 경우
		if( A==B && A==C) {
			System.out.println(10000+A*1000);
		}
	
		
	}
		}
		

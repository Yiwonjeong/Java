package step02;
/* 
 * 작성자: 이원정
 * 작성일: 2022.08.21
 * 내용: 백준 2단계 4번 문제(14681)
 */

import java.util.Scanner;

public class _04 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		
		int x = sc.nextInt();
		int y = sc.nextInt();
		
		if(x>0 && y>0) {
			System.out.println("1");
		}
		else if(x<0 && y>0) {
			System.out.println("2");
		}
		else if(x<0 && y<0) {
			System.out.println("3");
		}
		else if(x>0 && y<0) {
			System.out.println("4");
		}
		
		
		
	}

}

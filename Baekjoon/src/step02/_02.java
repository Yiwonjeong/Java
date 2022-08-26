package step02;
/* 
 * 작성자: 이원정
 * 작성일: 2022.08.21
 * 내용: 백준 2단계 2번 문제(9498)
 */

import java.util.Scanner;

public class _02 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		
		int score = sc.nextInt();
		
		if(score>=90) {
			System.out.println("A");
		}
		else if(score>=80) {
			System.out.println("B");
			}
		else if (score>=70) {
			System.out.println("C");
			}
		else if (score>=60) {
			System.out.println("D");
		}else {
			System.out.println("F");
		}
	}

}

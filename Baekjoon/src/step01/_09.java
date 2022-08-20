package step01;
/* 
 * 작성자: 이원정
 * 작성일: 2022.08.19
 * 내용: 백준 1단계 9번 문제(18108). 1998년생인 내가 태국에서는 2541년생?! 
 */

import java.util.Scanner;

public class _09 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		
		int B = sc.nextInt(); //2541
		int S=B-543;
		
		System.out.println(S);
		
	}

}

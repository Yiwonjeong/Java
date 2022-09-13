package step06;

import java.util.Scanner;

/* 
 * 작성자: 이원정
 * 작성일: 2022.09.13
 * 내용: 백준 6단계 3번 문제(10809) 알파벳 찾기
*/
public class _03 {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int [] alpha = new int [26];
		
		String a = "abcdefghijklmnopqrstuvwxyz";
		String s = sc.next();
		
		for (int i=0; i<alpha.length; i++) {
			alpha[i] = -1;
		}
		
		for (int i=0; i<a.length(); i++) {
			int idx = s.indexOf(a.charAt(i));
			alpha[i] = idx;
		}
		
		for( int i=0; i<alpha.length; i++) {
			System.out.print(alpha[i]+" ");
		}
		
					 
				 
				 
	}
 }
		
	
		
		


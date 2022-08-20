package step01;

import java.util.Scanner;

/* 
 * 작성자: 이원정
 * 작성일: 2022.08.19
 * 내용: 백준 1단계 10번 문제(3003). 킹, 퀸, 룩, 비숍, 나이트, 폰
 */


public class _10 {

	public static void main(String[] args) {

		 Scanner sc = new Scanner(System.in);
		 
		 int tot[]= {1,1,2,2,2,8}; 
		 int in[]=new int[6];
		 
		
		 for (int i=0; i<in.length; i++) {
			
			 in[i]=sc.nextInt( );
			
		 }
		 for (int i=0; i<in.length; i++) {
			 System.out.print(tot[i]-in[i]+" ");
		 }
		 
		 
		 
		 
	}

}

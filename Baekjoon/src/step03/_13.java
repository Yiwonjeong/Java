package step03;

import java.util.Scanner;

/* 
 * 작성자: 이원정
 * 작성일: 2022.08.29
 * 내용: 백준 3단계 13번 문제(1110) 더하기 사이클
 */
public class _13 {

	public static void main(String[] args) {

	Scanner sc = new Scanner(System.in);
	
	int n = sc.nextInt();
	sc.close();
	
	int cnt = 0;
	int copy = n;
	
	while(true){
		
		n = ((n%10)*10) + (((n/10)+(n%10))%10);
		cnt ++;
		
		if ( copy == n ) {break;}
		
	}
		System.out.println(cnt);
	}

}

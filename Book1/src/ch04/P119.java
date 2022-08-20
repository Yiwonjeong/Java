package ch04;
/* 
 * 작성자: 이원정
 * 작성일: 2022.08.19
 * 내용: continue문을 이용하여 1부터 100까지의 홀수 더하기
 */

public class P119 {

	public static void main(String[] args) {

	int total=0;
	int num;
	
	for (num=1; num<=100; num++) {
		
		if(num%2==0) 
			continue;
			total += num;
		
	}
	System.out.println("1부터 100까지의 홀수의 합은: "+total);	
	}

}

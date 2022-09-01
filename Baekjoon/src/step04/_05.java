package step04;

import java.util.Scanner;

/* 
 * 작성자: 이원정
 * 작성일: 2022.09.02
 * 내용: 백준 4단계 5번 문제(8958)OX퀴즈 
*/
public class _05 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		
	
		
		String [] arr = new String[sc.nextInt()];
		String str;
		
		for (int i=0; i<arr.length; i++) {
			arr[i]=sc.next();
			str = arr[i];
			int count=0;
			int sum=0;
			
			for (int j=0; j<arr[i].length(); j++) {
				
				if (str.charAt(j)=='O') {
					count ++;
					sum += count;
				}else {count=0;}
			}
			
		System.out.println(sum);
		
		}
		
	
	}

}

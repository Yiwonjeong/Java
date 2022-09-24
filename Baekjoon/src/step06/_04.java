package step06;

import java.util.Scanner;

/* 
 * 작성자: 이원정
 * 작성일: 2022.09.13
 * 내용: 백준 6단계 4번 문제(2675) 문자열 반복 
*/
public class _04 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		int testcase = Integer.parseInt(sc.nextLine());
		
		String [] str = new String [2];
		
		for (int i=0; i<testcase; i++) {
			
			String result = "";
			str = sc.nextLine().split(" ");
			
			for (int j=0; j<str[1].length(); j++) {
				for (int k=0; k<Integer.parseInt(str[0]); k++){
					
					result = result.concat(Character.toString(str[1].charAt(j)));
					
				}
			}
			
			System.out.println(result);
		}
		
		sc.close();
		
		
	}

}

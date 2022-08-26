package step02;

/* 
 * 작성자: 이원정
 * 작성일: 2022.08.21
 * 내용: 백준 2단계 5번 문제(2884)
 */

import java.util.Scanner;

public class _05 {
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		
		int H = sc.nextInt();
		int M = sc.nextInt();
		
		if(M<45) {
			H--;
			M=60-(45-M);
			if(H<0) {
				H=23;
			}
		System.out.println(H + " " + M);
		}
		else {
			System.out.println(H + " " + (M-45));
		}

}
}


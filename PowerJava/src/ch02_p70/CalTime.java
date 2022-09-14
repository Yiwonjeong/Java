package ch02_p70;

/* 형 변환 실습하기
 * 초 단위의 시간을 받아서 몇 분과 몇 초인지 계산하여 출력하는 프로그램
 */

import java.util.Scanner;

public class CalTime {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("초를 입력하시오.");
		int time = sc.nextInt();
		int min = (time/60);
		int sec = (time%60);
		
		System.out.println(time + "초는 " + min + "분 "+ sec + "초입니다.");
		
	}
}

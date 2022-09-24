package step06;

import java.util.Scanner;

/* 
 * 작성자: 이원정
 * 작성일: 2022.09.24
 * 내용: 백준 6단계 5번 문제(1157) 
*/
public class _05 {
	public static void main(String[] args) {
		
		// 알파벳 A-Z, ?
		int arr [] = new int [27];
		// 최빈수
		int max = -1;
		int element = 0;
		
		// 예제 입력
		
		Scanner sc = new Scanner(System.in);
		String example = sc.next();
		sc.close();
		
		// 소문자를 대문자의 형태로 변환
		example = example.toUpperCase();
		
		// A(65) -> 0, B->1, C->2...
		for(int i=0; i<example.length(); i++) {
			arr[(example.charAt(i)-65)]++;
		}
		
		// max값과 arr의 index를 비교하여 max보다 클 경우, 값을 바꾸어 준다.
		for(int i=0; i<27; i++) {
			if (max < arr[i]) {
				max = arr[i];
				element = i;
			}
			else if(max == arr[i]) {
				element = -1;
			}
		}
		
		if(element == -1) {
			System.out.println("?");
			System.exit(0);
		}
		
		// 아스키 코드 변환하여 출력
		System.out.println((char)(element+65));
		
		
	}
}

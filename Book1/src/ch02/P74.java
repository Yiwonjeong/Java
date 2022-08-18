package ch02;

/* 
 * 작성자: 이원정
 * 작성일: 2022.08.18
 * 내용: 산술 연산자를 사용하여 총점과 평균 구하기
 */

public class P74 {

	public static void main(String[] args) {

		int mathScore=90;
		int engScore=70;
		
		int totalScore= (mathScore+engScore);
		System.out.println(totalScore);
		
		double avgScore = (totalScore/2.0);
		System.out.println(avgScore);
		
	}

}

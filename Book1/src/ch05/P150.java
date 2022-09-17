package ch05;
/* 
 * 작성자: 이원정
 * 작성일: 2022.09.16
 * 내용: 참조 값 출력하기
 */
public class P150 {
	public static void main(String[] args) {
		
		P144 student3 = new P144();
		student3.studentName ="김유신";
	
		P144 student4 = new P144();
		student4.studentName = "강감찬";
		
		System.out.println(student3);
		System.out.println(student4);
		
		
	}
}

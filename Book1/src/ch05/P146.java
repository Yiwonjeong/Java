package ch05;
/* 
 * 작성자: 이원정
 * 작성일: 2022.09.16
 * 내용: StudentTest 실행 클래스 만들기
 */
public class P146 {
	public static void main(String[] args) {

		P144 studentAhn = new P144();
		studentAhn.studentName = "안승연";
		
		System.out.println(studentAhn.studentName);
		System.out.println(studentAhn.getStudentName());
		
	}
}

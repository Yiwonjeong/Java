package ch05;
/* 
 * 작성자: 이원정
 * 작성일: 2022.08.19
 * 내용: 학생 이름과 주소 출력하는 메서드 만들기 (클래스 기능을 구현하는 메서드)
 */


public class P132 {

	public class Student{

	int studentID;
	String studentName;
	int grade;
	String address;
	
	public void showStudentInfo() {
		System.out.println(studentName+","+address);
	}
		
	}

}

package ch06_3;

public class StudentTest1 {
	public static void main(String[] args) {
		
		Student student1 = new Student();
		student1.setStudentName("Camila");
		
		// serialNum 변수의 초기값 출력
		System.out.println(student1.serialNum);
		// serialNum 변수 값 증가
		student1.serialNum++;
		
		
		Student student2 = new Student();
		student1.setStudentName("Aisha");
		
		// 증가된 값 출력
		System.out.println(student2.serialNum);
		System.out.println(student1.serialNum);
		
	}

}

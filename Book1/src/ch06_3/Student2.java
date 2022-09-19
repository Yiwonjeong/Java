package ch06_3;

public class Student2 {
	public static void main(String[] args) {
		
		Student1 s1 = new Student1();
		s1.setStudentName("Julissa");
		System.out.println(s1.serialNum);
		System.out.println(s1.studentName+ " 학번: "+s1.studentID);
		
		Student1 s2 = new Student1();
		s2.setStudentName("Damien");
		System.out.println(s2.serialNum);
		System.out.println(s2.studentName+ " 학번: "+s2.studentID);
		
	}
}
package ch11_1;

class Student {
	
	int studentId;
	String studentName;
	
	public Student(int studentId, String studentName) {
		this.studentId = studentId;
		this.studentName = studentName;
	}
	
	public String toString() {
		return studentId + ", " + studentName;
	}
	
	@Override
	public boolean equals(Object obj) {
		if (obj instanceof Student) {
			Student std = (Student)obj;
			if(this.studentId == std.studentId)
				return true;
			else return false;
		}
		return false;
	}
	
}

public class EqualsTest {
	public static void main(String[] args) {
		
		Student stu1 = new Student(100, "이자바");
		
		// 주소 복사
		Student stu2 = stu1;
		Student stu3 = new Student(100, "이자바");
		
		// (1) == 연산자로 비교 했을 때 
		if (stu1 == stu2) {
			System.out.println("stu1 과 stu2의 주소는 같습니다.");
		} 
		else { 
			System.out.println("stu1 과 stu2의 주소는 다릅니다.");
		}
		
		// (2) equals() 메서드로 비교했을 때
		if (stu1.equals(stu2)) {
			System.out.println("stu1과 stu2는 동일합니다.");
		}
		else {
			System.out.println("stu1과 stu2는 동일하지 않습니다.");
		}
		
		// (1) == 연산자로 비교 했을 때 
		if (stu2 == stu3) {
			System.out.println("stu2 과 stu3의 주소는 같습니다.");
		} 
		else { 
			System.out.println("stu2 과 stu3의 주소는 다릅니다.");
		}
				
		// (2) equals() 메서드로 비교했을 때
		if (stu2.equals(stu3)) {
			System.out.println("stu2과 stu3는 동일합니다.");
		}
		else {
			System.out.println("stu2과 stu3는 동일하지 않습니다.");
		}
		
	}
}

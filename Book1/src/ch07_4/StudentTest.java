package ch07_4;

public class StudentTest {
	public static void main(String[] args) {
		
		Student stuCarina = new Student(1001, "Carina");
		stuCarina.addSubject("국어", 100);
		stuCarina.addSubject("수학", 50);
		
		Student stuJustus = new Student(1001, "Carina");
		stuJustus.addSubject("국어", 100);
		stuJustus.addSubject("수학", 50);
		stuJustus.addSubject("영어", 100);
		
		stuCarina.show();
		System.out.println("---------------------------------");
		stuJustus.show();
	}
}

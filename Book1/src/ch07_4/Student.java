package ch07_4;

import java.util.ArrayList;

public class Student {
	
	int studentID;
	String studentName;
	
	// ArrayList 선언하기
	ArrayList<Subject> subjectList;
	
	public Student(int studentID, String studentName) {
		this.studentID = studentID;
		this.studentName = studentName;
		// ArrayList 생성하기
		subjectList = new ArrayList<Subject>();
	}
	
	// 학생이 수강하는 과목을 subjecList 배열에 하나씩 추가하는 메서드
	public void addSubject(String name, int score) {
		Subject subject = new Subject(); // Subject 생성하기
		subject.setName(name); // 과목 이름 추가하기
		subject.setScorePoint(score); // 점수 추가하기
		subjectList.add(subject); // 배열 저장하기
	}
	
	public void show() {
		int total = 0;
		
		// 배열 요소 값 출력
		for (Subject s : subjectList) {
			total += s.getScorePoint(); // 총점 더하기
			System.out.println("학생 " + studentName+ "의 "+s.getName()+" 과목 성적은 "+ s.getScorePoint()+" 입니다.");
		}
		
	}
	
}

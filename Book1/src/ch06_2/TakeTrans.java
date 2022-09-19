package ch06_2;

// P178 - 학생, 버스, 지하철 객체 협력하기

public class TakeTrans {
	public static void main(String[] args) {
		
		Student s1 = new Student("James", 5000);
		Student s2 = new Student("Jay", 10000);
		
		Bus bus100 = new Bus(100);		// 노선 번호가 100인 버스 생성
		s1.takeBus(bus100);				// James(s1)가 100번 버스를 탑승
		s1.show();						// James 정보 출력
		bus100.show();					// Bus 정보 출력
		
		Subway subwayGreen = new Subway("2호선");		// 노선 번호가 2호선인 지하철 생성
		s2.takeSubway(subwayGreen);					// Jay(s2)가 2호선을 탑승
		s2.show();									// Jay 정보 출력
		subwayGreen.show();							// Subway 정보 출력
		
	
	}
}

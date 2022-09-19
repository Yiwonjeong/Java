package ch06_2;

// P178 - 지하철 클래스 생성하기

public class Subway {
	
	String lineNumber;		// 지하철 노선
	int passengerCount;		// 승객 수
	int money;				// 수입 액
	
	// 지하철 노선 번호를 매개변수로 받는 생성자
	public Subway(String lineNumber) {
		this.lineNumber = lineNumber;
	}
	
	// 승객이 지하철에 탄 경우를 구현하는 메서드
	public void take (int money) {
		this.money += money;
		passengerCount++;
	}
	
	// 지하철 정보를 출력하는 메서드
	public void show() {
		System.out.println(lineNumber+"의 승객은 "+passengerCount+"명이며, 수입은 "+money+"원 입니다.");
	}
}

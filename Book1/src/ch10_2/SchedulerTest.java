package ch10_2;

import java.io.IOException;

public class SchedulerTest {
	public static void main(String[] args) throws IOException {
		// 문자를 입력받는 System.in.read()를 사용하려면 IOException에서 오류를 처리해야 한다.
		
		System.out.println("전화 상담 할당 방식을 선택하세요.");
		System.out.println("------------------------------------");
		System.out.println("R: 한 명씩 차례로 할당됩니다.");
		System.out.println("L: 대기가 가장 적은 상담원에게 할당됩니다.");
		System.out.println("P: 우선 순위가 높은 고객 먼저 할당됩니다.");
		System.out.println("------------------------------------");
		
		// 할당 방식을 입력받아 ch 변수에 대입
		int ch = System.in.read();
		Scheduler scheduler = null;
		
		// 입력받은 값이 R 또는 r이면 RoundRobin 클래스 생성
		if ( ch == 'R' || ch == 'r' ) {
			scheduler = new RoundRobin();
		}
		
		// 입력받은 값이 L 또는 l이면 LeastJob 클래스 생성
		else if ( ch == 'L' || ch == 'l' ) {
			scheduler = new LeastJob();
		}
		
		// 입력받은 값이 P 또는 p이면 PriorityAllocation 클래스 생성
		else if ( ch == 'P' || ch == 'p' ) {
			scheduler = new PriorityAllocation();
		}
		
		// 외의 값을 입력했을 때
		else {
			System.out.println("지원되지 않는 기능입니다.");
			return;
		}
		
		scheduler.getNextCall();
		scheduler.sendCallAgent();
		
	}
}

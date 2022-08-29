package sub1;
/* 
 * 작성자: 이원정
 * 작성일: 2022.08.25
 * 내용: Java 클래스 실습하기
 * 
 * 클래스와 객체
 * - 클래스는 객체를 생성하는 구조체이고 속성(필드)과 기능(메서드)으로 구성.
 * - 객체는 클래스의 실제 인스턴스(메모리 상의 생성되는 실제 클래스)이고 new 연산으로 생성
 */

//내용 입력
public class ClassTest {

	public static void main(String[] args) {
		
		
		//객체 생성
		Car sonata = new Car(); //사용자 정의 타입, 사용자가 정한 변수에 맞는 사용.
		
		//객체 속성 초기화
		sonata.name = "소나타";
		sonata.color = "흰색";
		sonata.speed = 10;
		
		//객체 기능
		sonata.speedUp(80);
		sonata.speedDown(30);
		sonata.show();
		
		
		
		System.out.println("\n-----Car2------");
		
		//객체 생성2
		Car avante = new Car();
		
		//객체 속성 초기화2
		avante.name = "아반떼";
		avante.color = "흰색";
		avante.speed = 10;
		
		// 객체 기능2
		avante.speedUp(70);
		avante.speedDown(40);
		avante.show();
		
		
		System.out.println("\n-----Account------\n");
		
		
		//객체 생성3
		Account kb = new Account();
		
		
		//객체 속성 초기화3
		kb.bank = "국민은행";
		kb.id = "101-12-1011";
		kb.name = "홍길동";
		kb.balance = 1000;
		
		//객체 기능3
		kb.deposit(50000);
		kb.withdraw(7000);
		kb.show();
			

	}

}

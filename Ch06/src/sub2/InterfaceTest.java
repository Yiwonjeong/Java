package sub2;
/* 
 * 작성자: 이원정
 * 작성일: 2022.09.01
 * 내용: 인터페이스 실습하기
 * 
 * 인터페이스 (Interface)
 * - 클래스 간 공통의 표준 규격을 통해 클래스 구조를 설계하는 문법
 * - 인터페이스를 활용해서 객체 간의 결합도를 완화(경감)하는 효과를 얻는다. (다형성을 낮춤)
 * 
 */
public class InterfaceTest {
	public static void main(String[] args) {

		// 인터페이스 구현 클래스 객체 생성
		Car sonata = new Sedan("소나타","흰색",0);
		sonata.speedUp(80);
		sonata.speedDown(20);
		sonata.speedshow();
		
		Car bongo = new Truck("봉고", "파란색", 0);
		bongo.speedUp(90);
		bongo.speedDown(30);
		bongo.speedshow();
		
		// 인터페이스 결합도 완화
		Bulb bulb = new Bulb();
		Socket socket = new Cable(bulb);
		
		socket.switchOn();
		socket.switchOff();
		
		// 인터페이스 다중 상속 효과 
	TV smartTV = new TV();
	
	smartTV.powerOn();
	smartTV.booting();
	smartTV.browser();
	smartTV.access();
	smartTV.powefOff();
	}
}
		
		
		
	class TV extends Computer implements Internet {

			@Override
			public void access() {
				System.out.println("인터넷 접속...");
			}
			
			public void powerOn() {
				System.out.println("전원 켬...");
			}
			public void powefOff() {
				System.out.println("전원 끔...");
			}
		
	}
	
	class Computer {
		public void booting() {
			System.out.println("시스템 부팅...");
		}
		public void browser() {
			System.out.println("브라우저 실행...");
		}
	}
	
	interface Internet {
		public void access();
	}
		
		
		
		
		
		
		

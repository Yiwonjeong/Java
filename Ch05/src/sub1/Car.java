package sub1;

public class Car {
// 클래스 선언
	

		// 필드 (자동차의 속성)
	
		String name;
		String color;
		int speed;
	
		
		// 메서드 (자동차의 기능)
		
		public void speedUp (int speed) {
			this.speed += speed;
		}
		public void speedDown(int speed) {
			this.speed -= speed;
		}
		public void show() {
			System.out.println("차량명: " +name);
			System.out.println("차량색: " +color);
			System.out.println("현재 속도: " +speed);
		}
		
		
	}



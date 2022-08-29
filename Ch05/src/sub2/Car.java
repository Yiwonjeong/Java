package sub2;

public class Car {

	//현실의 자동차를 추상화해서 클래스로 표현


		// 자동차의 속성
		private String name;
		private String color;
		private int speed;
		
		//생성자 (캡슐화에 클래스 이름으로 정의된 메서드)
		public Car(String name, String color, int speed) {
			this.name = name;
			this.color = color;
			this.speed = speed;
		}
		
		//Getter, Setter get입력 후 ctrl+spacebar
		
		public String getName() {
			return name;
		}
		public void setName(String name) {
			this.name = name;
		}
		
		
		public String getColor() {
			return color;
		}
		public void setColor(String color) {
			this.color = color;
		}
		
		
		public int getSpeed() {
			return speed;
		}
		public void setSpeed(int speed) {
			this.speed = speed;
		}
		
		
		
		// 자동차의 기능
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



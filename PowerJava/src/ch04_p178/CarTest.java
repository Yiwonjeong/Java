package ch04_p178;

class Car {
	
	String color;
	int speed;
	int gear;
	
	
	//source - generate toString
	
	@Override
	public String toString() {
		return "Car [color=" + color + ", speed=" + speed + ", gear=" + gear + "]";
	}
	
	void changeGear(int g) { gear = g; }
	void speedUp() { speed += 10; }
	void speedDown() { speed -= 10; }
}

public class CarTest {
	public static void main(String[] args) {
		
		Car myCar = new Car();
		
		myCar.color = "red";
		myCar.changeGear(1);
		myCar.speedUp();
		System.out.println(myCar);
		
	}

}

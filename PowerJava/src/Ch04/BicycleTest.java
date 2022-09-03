package Ch04;

class Bicycle {

	String color;
	int gear;
	int speed;
	
	@Override
	public String toString() {
		return "Bicycle [color=" + color + ", gear=" + gear + ", speed=" + speed + ", getClass()=" + getClass()
				+ ", hashCode()=" + hashCode() + ", toString()=" + super.toString() + "]";
	}
	
	void changeGear(int g) {
		gear = g;
	}
	void speedUp() {
		speed += 10;
	}
	void speedDown( ) {
		speed -= 10;
	}

}

public class BicycleTest{
	
	public static void main(String[] args) {
		
		Bicycle B = new Bicycle();
		B.changeGear(1);
		B.speedUp();
		System.out.println(B);
		
	}
	
}

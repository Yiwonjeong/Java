package ch06_p227;

public class Vehicle {

	int speed;
	int heading;
	public void setSpeed(int speed) {
		this.speed = speed;
	}
	public void turn(int angle) {
		this.heading = angle;
	}
}

class Cars extends Vehicle{
	
	int price;
}
class Truck extends Vehicle{
	
	int payload;
}
class Bus extends Vehicle{
	
	int seats;
}
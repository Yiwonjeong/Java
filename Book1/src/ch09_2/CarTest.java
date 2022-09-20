package ch09_2;

public class CarTest {
	public static void main(String[] args) {
		
		System.out.println("--- 자율 주행하는 자동차 ---");
		Car myAI = new AICar();
		myAI.run();
		
		System.out.println("--- 사람이 운전하는 자동차 ---");
		ManualCar myManu = new ManualCar();
		myManu.run();
		
	}
}

package ch04_p150;

public class DeskLampTest {

	public static void main(String[] args) {

		//1. 객체 생성 (참조 + 객체)
		DeskLamp myLamp = new DeskLamp();
		
		//2. 필드 접근
		
		//3. 메소드 접근
		myLamp.turnOn();
		System.out.println(myLamp);
		myLamp.turnOff();
		System.out.println(myLamp);
	}

}

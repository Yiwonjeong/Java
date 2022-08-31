package sub6;

// 부모 클래스를 상속받는 자식 클래스

// 변수, 생성자(+상속)

public class Sedan extends Car{
	
	private int cc;
	
	public Sedan(String name, String color, int speed, int cc) {
		super(name, color, speed);
		this.cc = cc;
	}

// method
	
	@Override
	public void speedUp(int speed) {
		this.speed += speed + 20;
	}
	
	public void speedTurbo() {
		this.speed += 20;
	}
	
	public void show() {
		System.out.println("차량명: " +name);
		System.out.println("차량색: " +color);
		System.out.println("차량속도: " +speed);
		System.out.println("배기량: " +cc);
	}
	
	
}

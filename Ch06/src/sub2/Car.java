package sub2;

public interface Car {
	
	//interface는 오직 추상 메서드 선언만 가능
	//interface 가 abstract보다 더 추상적.
	// 구현체에서 해당 speedUp,down,show를 구현하는 가이드 역할
	
	public void speedUp(int speed);
	public void speedDown(int speed);
	public void speedshow();
	

}

package Ch05;

class Single{
	
	//1. 정적 필드 
	private static Single instance = new Single();
	
	//2. 전용 생성자
	private Single() {}
	
	//3. 정적 메서드
	public static Single getInstance() {
		return instance;
	}
}


public class SingleTest {

	public static void main(String[] args) {
		
		Single obj1 = Single.getInstance();
		Single obj2 = Single.getInstance();
		
		System.out.println(obj1);
		System.out.println(obj2);
	}
	
}

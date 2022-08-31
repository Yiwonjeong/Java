package sub3;

public class Calc {//클래스(설계도)
	
	/* 클래스 안에서 객체 생성, 싱글톤
	 * Calc c = new Calc();
	 */
	
	//1) 정적필드: 자기 자신에 대한 객체 생성
	private static Calc instance = new Calc();
	
	//2) 생성자
	private Calc() {}
	
	//3) 정적메서드: 정적메서드로 클래스에 접근
	static Calc getInstance() {
		return instance;
	}	
	

	public int plus (int x, int y) {
		return x+y;
	}

	public int minus (int x, int y) {
		return x-y;
	}
	
	public int multi (int x, int y) {
		return x*y;
	}
	
	public int div (int x, int y) {
		return x/y;
	}
}

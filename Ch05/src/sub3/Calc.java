package sub3;

public class Calc {//클래스(설계도)
	
	/* 클래스 안에서 객체 생성, 싱글톤
	 * Calc c = new Calc();
	 */
	private static Calc instance = new Calc();
	//private 니까 getter, setter
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

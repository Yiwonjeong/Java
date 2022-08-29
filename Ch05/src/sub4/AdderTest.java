package sub4;
/* 
* 작성자: 이원정
* 작성일: 2022.08.29
* 내용: 싱글톤 객체와 인스턴스 객체 실습
*/

// Adder 클래스에서 싱글톤 객체 생성
class Adder {
	
	private static Adder instance = new Adder();
	public static Adder getInstance() {
		return instance; //getter: 외부로 보내기
	}
	private Adder() {} //생성자 
	private Adder (int value) {
		y += value;
	}
	
	private int x;
	private static int y; //static 선언
	
	public void add(int x, int y) {
		this.x += x;
		y++;
	}
	public void add(int [] arr) {
		x += arr[0];
		y += arr[1];
	}
	
	public static void add(Adder a2) {
		a2.x += 10;
	}
	
	public static Adder add(Adder a3, int value) {
		return new Adder (value);
	}
	
	public void show() {
		System.out.println("x: "+x);
		System.out.println("y: "+y);
	}
	
}

// Main 
public class AdderTest {

	public static void main(String[] args) {

		int[] arr = new int[2]; //배열 공간 생성
		arr[0]=10;
		arr[1]=20;
		
		Adder a1 = Adder.getInstance();
		
		a1.add(1,2);
		a1.show(); //1,0
		
		a1.add(arr);
		a1.show(); //11,20
		
		Adder.add(a1);
		a1.show(); //21,20
		
		a1 = Adder.add(a1, 3); //return이 있으니 개인 연산자 a1
		a1.show(); //0,23
		
		
	}

}
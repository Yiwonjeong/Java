package sub4;
/* 
 * 작성자: 이원정
 * 작성일: 2022.08.23
 * 내용: Java 메서드 오버로딩 실습하기
 * 
 * 메서드 오버로딩 (Overloading)
 * - 동일한 이름의 메서드를 매개변수로 구분한 메서드
 * - 메서드의 반환 타입은 오버로딩에 영향을 미치지 않는다.
 */
public class MethodOverloading {

	public static void main(String[] args) {

	//메서드 호출
		int     r1 = plus(2);
		int     r2 = plus(2, 3);
		double  r3 = plus(1.2, 2.3);
		String  r4 = plus("Hello", "World");
		
		System.out.println("r1: "+r1);
		System.out.println("r2: "+r2);
		System.out.println("r3: "+r3);
		System.out.println("r4: "+r4);
		
		
	}//main end
	
	
	//메서드 오버로딩 (변수로 구분)
	
	public static int plus (int a) {
		return a + a;
	}
	
	public static int plus (int a, int b) {
		return a + b;
	}
	
	public static double plus (double a, double b) {
		return a + b;
	}
	
	public static String plus (String a, String b) {
		return a + b;
	}

}

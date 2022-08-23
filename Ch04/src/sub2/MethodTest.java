package sub2;
/* 
 * 작성자: 이원정
 * 작성일: 2022.08.23
 * 내용: Java 메서드 실습하기 
 * 
 * 메서드 (Method)
 * - 자주 사용하는 코드 로직을 모듈화한 구조체 
 * - 메서드에서 선언한 변수는 지역변수이고 해당 메서드가 종료되면 메모리에서 소
 * 
 */

public class MethodTest {
	
	// 전역변수 (메서드 밖)
	
	int num = 1;
	
	

	public static void main(String[] args) {
		
		//1-1. main에서 메서드 호출 
		int r1 = f(1); 
		int r2 = f(2);
		int r3 = f(3);
		
		System.out.println("r1: "+r1);
		System.out.println("r2: "+r2);
		System.out.println("r3: "+r3);
		
		
		//1-2. 메서드 지역변수와 스택
		int t1 = sum(1,10); //1,10: argument
		int t2 = sum(1,100);
		
		System.out.println("t1: "+t1);
		System.out.println("t2: "+t2);
		
	} // main end
	
		
	
	
	//1-1. 메서드 정의: 매개변수 int x
	
	public static int f(int x) {
		int y = 2 * x + 3;
		return y;
	}
	
	//1-2 메서드 정의: 매개변수 int start, int end - 1부터 10까지의 합 
	
	public static int sum(int start, int end) { //start,end: parameter
		
		//지역변수 start, end, total
		// k는 for문의 지역 변수 
		
		int total = 0;
		
		for (int k=start; k<=end; k++) {
			total += k;
		}
		return total;
		
		
	}

}

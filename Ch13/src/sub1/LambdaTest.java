package sub1;
/*
 * 이름: 이원정
 * 날짜: 2022/09/20
 * 내용: 람다식 실습하기
 * 
 * 람다식 (Lambda)
 * - 함수형 프로그래밍을 지원하기 위한 구문형식
 * - 자바에서는 @functionalinterface 인터페이스를 이용해서 람다식 정의
 */
public class LambdaTest {
	public static void main(String[] args) {
		
		// 람다식 정의 (익명함수, 화살표 함수)
		Type1 t1 = () -> {System.out.println("Type1 람다식 실행...");};
		Type2 t2 = (x) -> {System.out.println("Type2 람다식 실행: " + x);};
		Type3 t3 = (x, y) -> x+y;
		
		// 람다식 호출
		t1.f();
		t2.f(3);
		int result = t3.f(2, 3);
		System.out.println("Type3 result: "+result);
	}
}

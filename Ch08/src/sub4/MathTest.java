package sub4;
/* 
* 작성자: 이원정
* 작성일: 2022.09.08
* 내용: Math 클래스 실습하기
*/
public class MathTest {
	public static void main(String[] args) {

		//수학 메서드
		// 객체 생성 X Math m = new Math();
		System.out.println("절대값: " + Math.abs(-5));
		System.out.println("제곱근: " + Math.sqrt(9));
		System.out.println("올림값: " + Math.ceil(1.2));
		System.out.println("올림값: " + Math.ceil(1.8));
		System.out.println("내림값: " + Math.floor(-5));
		System.out.println("내림값: " + Math.floor(-5));
		System.out.println("반올림: " + Math.round(1.2));
		System.out.println("반올림: " + Math.round(1.8));
		
		// random
		double num1 = Math.random();
		System.out.println("num1: "+num1); //0~1 실수 
		
		double num2 = num1 * 10;
		System.out.println("num2: "+num2); //0~10 실수
		
		double num3 = Math.ceil(num2);
		System.out.println("num3: "+num3); //1~10 실수
		
		int rand = (int) Math.ceil(Math.random()*10); //1~10 정수
		System.out.println("rand: "+rand);
		
		int lotto = (int) Math.ceil(Math.random()*45); //1~45 정수
		System.out.println("lotto number: "+lotto);
		
	}

}

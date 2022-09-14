package ch02_p70;
/*
 * 증감, 복합 대입 연산자 실습하기
 */
public class IncOperator {

	public static void main(String[] args) {

		int x=1, y=1;
		
		int a = x++;	// x의 값이 사용되기 전에 증가된다. a는 1이다.
		int b = ++y;	// y의 값이 사용된 후에 증가된다. b는 2이다.
		System.out.println("a= "+a+", b= "+b);
		
		int c=100, d=200;
		
		c += 10;	// c=c+10
		d /= 10;	// d=d/10
		System.out.println("c= "+c+", d= "+d);
		
		
		
		
		
	}

}

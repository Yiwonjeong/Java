package ch03;

/* 
 * 작성자: 이원정
 * 작성일: 2022.08.19
 * 내용: 비트 이동 연산자를 사용하여 연산하기 
 */	

public class P85 {

	public static void main(String[] args) {
		
		int num=0B00000101; //5를 8비트 2진수로 나타냄 
		
		System.out.println(num<<2); //왼쪽으로 2비트 이동 00010100 (20)
		System.out.println(num>>2); //오른쪽으로 2비트 이동 00000001 (1)
		System.out.println(num>>>2); //오른쪽으로 2비트 이동 00000001 (1)
		
		System.out.println(num);
		
		num = num << 2; //왼쪽으로 2비트 이동한 값을 다시 numdp eodlq
		System.out.println(num);
		

	}

}

package ch05_p209;

public class RectArrayTest {

	public static void main(String[] args) {
		
		//1. 참조 변수 선언 
		Rect [] list;
		
		//2. 배열 객체 생성
		list = new Rect[5];
		
		//3. 배열 요소 생성: 반복문을 이용해 배열의 크기만큼 객체 생성
		for (int i=0; i<list.length; i++) {
			
			list[i] = new Rect(i,i);
			
		}
		
		//4. 배열 요소 처리: 반복문을 사용하여 배열에 저장된 객체 처리
		for (int i=0; i<list.length; i++) {
			System.out.println(i+"번째 사각형의 먼적= "+list[i].getArea());
		}
		
	}
	
}

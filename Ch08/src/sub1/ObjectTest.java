package sub1;
/* 
* 작성자: 이원정
* 작성일: 2022.09.05
* 내용: Java API Object 클래스 실습하기
* 
* Object 클래스 
* - 자바의 최상위 클래스로 모든 클래스는 Object 클래스를 상속 받음
* - 주요 기능은 객체 비교를 위한 equals()와 객체 정보를 출력하기 위한 toString() 제공
*/ 

public class ObjectTest {
	public static void main(String[] args) {

		Object a1 = new Apple("한국", 3000);
		Object a2 = new Apple("일본", 2000);
		
		a1.toString();
		a2.toString();
		
		
		// 주소 비교
		if (a1==a2) {
			System.out.println("a1과 a2가 주소가 같다.");
		}else {
			System.out.println("a1 과 a2가 주소가 다르다.");
		}
		
		// 객체 비교
		if(a1.equals(a2)) {
			
			System.out.println("a1과 a2는 객체가 같다.");
		}else {
			
			System.out.println("a1과 a2는 객체가 다르다.");
		}
	}

}

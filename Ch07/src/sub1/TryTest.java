package sub1;
/* 
 * 작성자: 이원정
 * 작성일: 2022.09.05
 * 내용: Java 예외 처리 실습하기 
 */

public class TryTest {
	public static void main(String[] args) {

		//예외 상황 1. 어떤 수를 0으로 나눌 때 
		
		int num1 = 1;
		int num2 = 0;
		int rs1 = 0, rs2 = 0, rs3 = 0, rs4 = 0;
		
		try { 
			//예외가 발생할 가능성이 있는 코드 로직
			rs1 = num1 + num2;
			rs2 = num1 - num2;
			rs3 = num1 * num2;
			rs4 = num1 / num2;
			}
		catch (Exception e) { 
			//예외가 발생했을 때 처리할 코드 로직
			e.printStackTrace();
		}
		
		
		System.out.println("rs1: "+rs1);
		System.out.println("rs2: "+rs2);
		System.out.println("rs3: "+rs3);
		System.out.println("rs4: "+rs4);
		
		
		//예외 상황 2. 배열의 인덱스 범위를 벗어 났을 때
		
		int [] arr = {1,2,3,4,5};
		
		try {
			for (int i=0; i<=5; i++) {
				System.out.println(arr[i]+" ");
			}
		}catch (Exception e) {
			e.printStackTrace();
		}
		System.out.println();
		
		
		//예외 상황 3. Null 포인트 참조 에러
		
		Animal a = null;
		
		try {
			a.move();
			a.hunt();
		}catch (Exception e) {
			e.printStackTrace();
		}
		
		
		//예외 상황 4. 캐스팅 에러
		
		Animal a1 = new Tiger(); // 업캐스팅(다형성)
		Animal a2 = new Eagle(); // 업캐스팅 (다형성)
		
		try {
			Eagle eagle = (Eagle) a1; //다운캐스팅
			eagle.move();
			eagle.hunt();
			
		}catch (Exception e) {
			e.printStackTrace();
			
			Tiger tiger = (Tiger) a1;
			tiger.move();
			tiger.hunt();
			
		}finally {
			System.gc(); // 메모리 정리, garbage collector 
			System.out.println("캐스팅 완료");
		}
		

		
		System.out.println("프로그램 종료...");
		
		}

}

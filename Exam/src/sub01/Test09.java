package sub01;
/* 
 * 작성자: 이원정
 * 작성일: 2022.08.19
 * 내용: Java 반복문 연습문
 */


public class Test09 {

	public static void main(String[] args) {

		int count=0;
		
		for (int i=1; i<=9; i++) {
			
			if(i<=5) {
				count++;
				
			}else {
				count--;
				
			}
			
			for (int j=1; j<=5-count; j++) {
				System.out.print(" ");
			}
			for (int k=1; k<=2*count-1; k++) {
				System.out.print("*");
			}
			System.out.print("\n");
		}
	}

}

package sub01;

/* 
 * 작성자: 이원정
 * 작성일: 2022.08.19
 * 내용: Java 반복문 연습문
 */

public class Test08 {

	public static void main(String[] args) {

		int n=5;
		
		for(int i=0; i<n; i++) {
			
			for(int j=n-1; j>i; j--) {
				System.out.print(" ");
			}
			for (int j=0; j<i*2+1;j++) {
				System.out.print("*");
			}
			System.out.print("\n");
		}
		
	}

}

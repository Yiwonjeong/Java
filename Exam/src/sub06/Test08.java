package sub06;
/*
 * 날짜: 2022/09/26
 * 이름: 이원정
 * 내용: 자바 총정리 연습문제
 */
public class Test08 {
	public static void main(String[] args) {
		
		for (int y = 1; y <= 9; y++) {
			for (int x=2; x<=9; x++) {
				System.out.printf("%d x %d = %2d\t", x,y,x*y);
			}
			System.out.print("\n");
		}
		
	}
}

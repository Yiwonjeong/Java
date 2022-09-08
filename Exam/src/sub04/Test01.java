package sub04;
/*
 * 날짜: 2022/09/07
 * 이름: 이원정
 * 내용: Java 삼각형 모양 별 찍기 
 */
import java.util.Scanner;

public class Test01 {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		
		for(int i=1;i<=n;i++){
			for(int j=0;j<i;j++){
				System.out.print("*");
			}
			System.out.println("");
		}
		
	}
}



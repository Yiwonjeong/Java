package sub04;
/*
 * 날짜: 2022/09/07
 * 이름: 이원정
 * 내용: Java 역삼각형 모양 별 찍기 
 */
import java.util.Scanner;


public class Test02 {
	public static void main(String[] args) {

	
	Scanner sc = new Scanner(System.in);
	
	int n = sc.nextInt();
		
		
		for(int i=1;i<n+1;i++){
			for(int j=n;j>0;j--){
				if(i<j){
					System.out.print(" ");
				}else{
					System.out.print("*");
				}
			}
			System.out.println("");
		}
		
	}

}

package sub04;
/*
 * 날짜: 2022/09/07
 * 이름: 이원정
 * 내용: Java 별 모양 찍기 2
 */

public class Test04 {
	public static void main(String[] args) {
	
		for(int i=0;i<4;i++){
			for(int j=0;j<3-i;j++){
				System.out.print("☆"); 
			}
			for(int j=0;j<2*i+1;j++){
				System.out.print("★"); 
			}
			for(int k=0; k<3-i; k++) {
				System.out.print("☆"); 
			}
			System.out.println("");
		} 
	
	
	}
}


package sub04;
/*
 * 날짜: 2022/09/07
 * 이름: 이원정
 * 내용: Java 별 모양 찍기 1 
 */

public class Test03 {
	public static void main(String[] args) {

		for(int i=1;i<6;i++){
			for(int j=5;j>0;j--){
				if(i<j){
					System.out.print("☆");
				}else{
					System.out.print("★");
				}
			}
			System.out.println("");
		}
	}
}




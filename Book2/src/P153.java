
public class P153 {
	
	//중첩 for문 - 구구단 출력하기

	public static void main(String[] args) {

		for(int m=2; m<=9; m++) {
			System.out.println(m+"단");
		
		for(int n=1; n<=9; n++) {
			System.out.println(m+" x "+n+" = " + (m*n));
		}
		}
		
	}

}

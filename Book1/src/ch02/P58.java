package ch02;

	//부동 소수점 방식의 오류

public class P58 {

	public static void main(String[] args) {
		
		double dnum=1;
		
		for(int i=1; i<10000; i++) {
			dnum=dnum+0.1;
		}
		System.out.println(dnum);
	}

}

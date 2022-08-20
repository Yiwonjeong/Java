package ch04;

//for문을 이용하여 1부터 10까지 합 구하기 


public class P114 {

	public static void main(String[] args) {

		int i;
		int sum=0;
		
		for(i=1; i<=10; i++) {
			sum += i;
		}
		
		System.out.println("1부터 10까지의 합: "+sum);
	}

}

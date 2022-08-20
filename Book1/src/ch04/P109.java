package ch04;

//while문을 활용하여 1부터 10까지 더하기

public class P109 {

	public static void main(String[] args) {

		int num=1;
		int sum=0;
		
		while (num<=10) {
			
			sum += num;
			num++;
			
		}
		
		System.out.println("1부터 10까지의 합: "+sum);
		
	}

}

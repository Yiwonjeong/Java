package ch04;

/* 
 * 작성자: 이원정
 * 작성일: 2022.08.19
 * 내용: break문 예제 (1부터 몇까지 더해야 합이 100이 넘는지)
 *
 */


public class P121 {

	public static void main(String[] args) {

		int sum=0;
		int num=0;
		
		for (num=0; ;num++) {
			sum += num;
		if (sum>=100)
			break;
		
	}
		System.out.println("num: "+num);
		System.out.println("sum: "+sum);

}
}

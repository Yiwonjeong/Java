package sub06;
/*
 * 날짜: 2022/09/26
 * 이름: 이원정
 * 내용: 자바 총정리 연습문제
 */
public class Test05 {
	public static void main(String[] args) {
		
		int price = 187000;
		
		//150,000
		int won50000 = price / 50000;
		//187000-150000=37000
		int won10000 = (price-(won50000*50000))/10000;
		//int won10000 = price % 50000 / 10000;
		//187000-150000-30000=7000
		int won5000 = (price-(won50000*50000)-(won10000*10000))/5000;
		//187000-150000-30000-5000=2000
		int won1000 = (price-(won50000*50000)-(won10000*10000)-(won5000*5000))/1000;
		
		System.out.println("5만원권: "+won50000 + "장");
		System.out.println("1만원권: "+won10000 + "장");
		System.out.println("5천원권: "+won5000 + "장");
		System.out.println("1천원권: "+won1000 + "장");
		
	}
}

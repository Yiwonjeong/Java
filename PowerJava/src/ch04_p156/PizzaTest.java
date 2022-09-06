package ch04_p156;

class Pizza{
	
	//1. 필드
	int size;
	String type;
	
	
	//2-1. 매개 변수가 없는 생성자
	public Pizza() {
		size = 12;
		type = "슈퍼슈프림";
	}
	
	//2-2. 매개 변수가 있는 생성자
	public Pizza(int s, String t) {
		size = s;
		type = t;
	}
}

public class PizzaTest {

	public static void main(String[] args) {

		Pizza p1 = new Pizza();
		System.out.println(p1.type + p1.size);
		
		Pizza p2 = new Pizza(24, "포테이토");
		System.out.println(p2.type + p2.size);
		
	}

}

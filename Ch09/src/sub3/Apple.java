package sub3;

public class Apple {
	//묵시적으로 public class Apple extends object

	private String country;
	private int price;
	
	public Apple(String country, int price) {
		this.country = country;
		this.price = price;
	}
		

	public void show() {
		System.out.println("원산지: "+country);
		System.out.println("가격: "+price);
	}

}

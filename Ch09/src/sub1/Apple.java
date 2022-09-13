package sub1;

public class Apple {
	//묵시적으로 public class Apple extends object

	private String country;
	private int price;
	
	public Apple(String country, int price) {
		this.country = country;
		this.price = price;
	}
		

	@Override
	public String toString() { // 객체 정보 조
		
		System.out.println("객체번호: "+hashCode());
		//hashCode: object(부모)의 기능, 객체의 식별번호 (해시값)
		
		System.out.println("원산지: "+country);
		System.out.println("가격: "+price);
	
		return super.toString();
	}

}

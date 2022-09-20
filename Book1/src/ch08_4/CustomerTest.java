package ch08_4;

public class CustomerTest {
	public static void main(String[] args) {
		
		Customer cus1 = new Customer();
		cus1.setCustomerID(10010);
		cus1.setCustomerName("이순신");
		cus1.bonusPoint=1000;
		System.out.println(cus1.show());
	
		Customer cus2 = new VIPCustomer(10020, "김유신", 12345);
		cus2.bonusPoint = 1000;
		System.out.println(cus2.show());
		
		System.out.println("-------할인율과 보너스 포인트 계산-------");
		
		int price = 10000;
		int cus1Price = cus1.calcPrice(price);
		int cus2Price = cus2.calcPrice(price);
		
		System.out.println(cus1.getCustomerName()+" 님이 "+cus1Price+"원 지불하셨습니다.");
		System.out.println(cus1.show());
		
		System.out.println(cus2.getCustomerName()+" 님이 "+cus2Price+"원 지불하셨습니다.");
		System.out.println(cus2.show());
	}
}

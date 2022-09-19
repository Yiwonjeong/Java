package ch08_3;

public class OverridingTest1 {
	public static void main(String[] args) {
		
		// 일반 고객 
		Customer cus1 = new Customer();
		cus1.setCustomerID(10010);
		cus1.setCustomerName("이순신");
		cus1.bonusPoint=1000;
				
		// VIP 고객
		VIPCustomer cus2 = new VIPCustomer();
		cus2.setCustomerID(10020);
		cus2.setCustomerName("김유신");
		cus2.bonusPoint=10000;
		
		int price = 10000;
		System.out.println(cus1.getCustomerName()+ " 님이 지불해야 하는 금액은 "+cus1.calcPrice(price)+"입니다.");
		System.out.println(cus2.getCustomerName()+ " 님이 지불해야 하는 금액은 "+cus2.calcPrice(price)+"입니다.");
		
				
	}
}

package ch08_3;

public class CustomerTest1 {
	public static void main(String[] args) {
		
		// 일반 고객 
		Customer cus1 = new Customer();
		cus1.setCustomerID(10010);
		cus1.setCustomerName("이순신");
		cus1.bonusPoint=1000;
		System.out.println(cus1.show());
		
		// VIP 고객
		VIPCustomer cus2 = new VIPCustomer();
		cus2.setCustomerID(10020);
		cus2.setCustomerName("김유신");
		cus2.bonusPoint=10000;
		System.out.println(cus2.show());
		
		
	}
}

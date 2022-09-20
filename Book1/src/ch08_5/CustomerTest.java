package ch08_5;

import java.util.ArrayList;

public class CustomerTest {
	public static void main(String[] args) {
		
		ArrayList<Customer> customerList = new ArrayList<Customer>();
		
		// 고객 생성
		Customer cus1 = new Customer(10010, "이순신");
		Customer cus2 = new Customer(10020, "신사임당");
		Customer cus3 = new GoldCustomer(10030, "홍길동");
		Customer cus4 = new GoldCustomer(10040, "이율곡");
		Customer cus5 = new VIPCustomer(10050, "김유신",12345);
		
		// ArrayList의 add 속성을 사용해 객체 배열에 고객 추가
		customerList.add(cus1);
		customerList.add(cus2);
		customerList.add(cus3);
		customerList.add(cus4);
		customerList.add(cus5);
		
		// 고객 정보 출력
		System.out.println("------ 고객 정보 출력 -------");
		for (Customer customer : customerList) {
			System.out.println(customer.show());
		}
		
		System.out.println("------ 할인율과 보너스 포인트 계산 -------");
		int price = 10000;
		// 다형성 구현
		for (Customer customer : customerList) {
			int cost = customer.calcPrice(price);
			System.out.println(customer.getCustomerName()+" 님이 "+cost+"원 지불하셨습니다.");
			System.out.println(customer.getCustomerName()+" 님의 현재 보너스 포인트는 "+customer.bonusPoint+"점 입니다.");
		}
		
	}
}

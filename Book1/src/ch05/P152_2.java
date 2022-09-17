package ch05;

public class P152_2 {

	long orderNum = 0;
	String orderID ,orderDate, orderName, orderProdNum, addr;
	
	public void show() {
		System.out.println("주문 번호: "+orderNum);
		System.out.println("주문자 아이디: "+orderID);
		System.out.println("주문 날짜: "+orderDate);
		System.out.println("주문자 이름: "+orderName);
		System.out.println("주문 상품 번호: "+orderProdNum);
		System.out.println("배송 주소: "+addr);
	}
	
	
	public static void main(String[] args) {
		
		P152_2 or1 = new P152_2();
		or1.orderNum = 201803120001l;
		or1.orderID = "abc123";
		or1.orderDate = "2018년 3월 12일";
		or1.orderName = "홍길동";
		or1.orderProdNum = "PD0345-12";
		or1.addr = "서울시 영등포구 여의도동 20번";
		
		or1.show();
		
	}
	
}

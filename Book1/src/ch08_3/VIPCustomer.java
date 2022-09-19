package ch08_3;

public class VIPCustomer extends Customer{
	
	// 추가 속성
	private int agentID;	// VIP 고객 상담원 아이디
	double saleRatio;	// 할인율
	
	public VIPCustomer() {
		customerGrade = "VIP";
		bonusRatio = 0.05;
		saleRatio = 0.1;
	
	}
	
	public int getAgentID() {
		return agentID;
	}

	// 재정의한 메소드
		@Override
		public int calcPrice(int price) {
			bonusPoint += price * bonusRatio;
			
			// 할인된 가격을 계산하여 반환
			return price - (int)(price * saleRatio);
		}
	

	
	
}

package ch08_5;

public class VIPCustomer extends Customer {

	// 추가 속성
	private int agentID;	// VIP 고객 상담원 아이디
	double saleRatio;	// 할인율
	
	public VIPCustomer(int customerID, String customerName, int agentID) {
		super(customerID, customerName);
		customerGrade = "VIP";
		bonusRatio = 0.05;
		saleRatio = 0.1;
	
	}
	
	public int calcPrice(int price) {
		bonusPoint += price * bonusRatio;
		return price - (int)(price * saleRatio);
	}
	
	public int getAgentID() {
		return agentID;
	}

}

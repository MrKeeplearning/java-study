package ch04;

public class VIPCustomer extends Customer{
	
	double salesRatio;
	private String agentID;		// 담당 전문 상담원
	
	public VIPCustomer(int customerID, String customerName) {
		super(customerID, customerName);
		
		customerGrade = "VIP";
		bonusRatio = 0.05;
		salesRatio = 0.1;
	}
	
	@Override
	public int calcPrice(int price) {
		bonusPoint += price*bonusRatio;
		price -= (int)(price*salesRatio);
		return price;
	}	
	
	public String getAgentID() {
		return agentID;
	}
}

package ch08;

public class Order {
	
	public String orderNum;
	public String customerPhone;
	public String customerAddr;
	public String orderDate;
	public String orderTime;
	public String price;
	public String numOfMenu;
	
	public String showOrderSheet() {
		
		String sheet = "�ֹ� ���� ��ȣ : " + orderNum
						+ "\n�ֹ� �ڵ��� ��ȣ : " + customerPhone
						+ "\n�ֹ� �� �ּ� : " + customerAddr
						+ "\n�ֹ� ��¥ : " + orderDate
						+ "\n�ֹ� �ð� : " + orderTime
						+ "\n�ֹ� ���� : " + price
						+ "\n�޴� ��ȣ : " + numOfMenu;
		return sheet;
		
	}

}

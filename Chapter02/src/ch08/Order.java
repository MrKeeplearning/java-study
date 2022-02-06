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
		
		String sheet = "주문 접수 번호 : " + orderNum
						+ "\n주문 핸드폰 번호 : " + customerPhone
						+ "\n주문 집 주소 : " + customerAddr
						+ "\n주문 날짜 : " + orderDate
						+ "\n주문 시간 : " + orderTime
						+ "\n주문 가격 : " + price
						+ "\n메뉴 번호 : " + numOfMenu;
		return sheet;
		
	}

}

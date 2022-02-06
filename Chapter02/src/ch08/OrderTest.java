package ch08;

public class OrderTest {

	public static void main(String[] args) {
		
		Order order = new Order();
		order.orderNum = "202011020003";
		order.customerPhone = "01023450001";
		order.customerAddr = "서울시 강남구 역삼동 111-333";
		order.orderDate = "20201102";
		order.orderTime = "130258";
		order.price = "35000";
		order.numOfMenu = "003";
		
		String orderSheet = order.showOrderSheet();
		System.out.println(orderSheet);

	}

}

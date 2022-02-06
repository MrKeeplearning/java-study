package ch03;

public class CustomerTest {

	public static void main(String[] args) {
		
		Customer customerLee = new Customer(10010, "이순신");
		customerLee.bonusPoint = 1000;
		System.out.println(customerLee.showCustomerInfo());
		
		VIPCustomer customerKim = new VIPCustomer(10020, "김유신");
		customerKim.bonusPoint = 10000;
		System.out.println(customerKim.showCustomerInfo());
		
		// VIPCustomer로 생성을 했지만 Customer 타입으로 대입이 가능(업 캐스팅)
		Customer vc = new VIPCustomer(12345, "no-name");
		// vc가 VIPCustomer의 인스턴스라고 하더라도 Customer로 형변환을 했다면
		// 자신에게 해당되는 타입의 것만 사용가능하다.
		vc.showCustomerInfo();
	}

}

package ch03;

public class CustomerTest {

	public static void main(String[] args) {
		
		Customer customerLee = new Customer(10010, "�̼���");
		customerLee.bonusPoint = 1000;
		System.out.println(customerLee.showCustomerInfo());
		
		VIPCustomer customerKim = new VIPCustomer(10020, "������");
		customerKim.bonusPoint = 10000;
		System.out.println(customerKim.showCustomerInfo());
		
		// VIPCustomer�� ������ ������ Customer Ÿ������ ������ ����(�� ĳ����)
		Customer vc = new VIPCustomer(12345, "no-name");
		// vc�� VIPCustomer�� �ν��Ͻ���� �ϴ��� Customer�� ����ȯ�� �ߴٸ�
		// �ڽſ��� �ش�Ǵ� Ÿ���� �͸� ��밡���ϴ�.
		vc.showCustomerInfo();
	}

}

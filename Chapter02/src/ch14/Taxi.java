package ch14;

public class Taxi {
	
	StringBuffer buffer = new StringBuffer();
	
	String taxiCompany;
	int income;
	int kmFee = 2500;		// km �� ���
	
	public Taxi() {}
	
	public Taxi(String taxiCompany) {
		this.taxiCompany = taxiCompany;
	}
	
	// Student Ŭ������ �����Ϸ��� �ýÿ��
	public int totalFee(int distance) {
		return kmFee*distance;
	}

	public void take(int distance) {
		this.income += (kmFee * distance);
	}
	
	public void showTaxiInfo() {
		buffer.append(taxiCompany);
		buffer.append(" ������ ");
		buffer.append(income);
		buffer.append("�� �Դϴ�.");
		
		String info = buffer.toString();
		System.out.println(info);
	}

}

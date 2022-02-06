package ch14;

public class Taxi {
	
	StringBuffer buffer = new StringBuffer();
	
	String taxiCompany;
	int income;
	int kmFee = 2500;		// km 당 요금
	
	public Taxi() {}
	
	public Taxi(String taxiCompany) {
		this.taxiCompany = taxiCompany;
	}
	
	// Student 클래스에 전달하려는 택시요금
	public int totalFee(int distance) {
		return kmFee*distance;
	}

	public void take(int distance) {
		this.income += (kmFee * distance);
	}
	
	public void showTaxiInfo() {
		buffer.append(taxiCompany);
		buffer.append(" 수입은 ");
		buffer.append(income);
		buffer.append("원 입니다.");
		
		String info = buffer.toString();
		System.out.println(info);
	}

}

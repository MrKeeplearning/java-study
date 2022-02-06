package ch14;

public class Subway {

	StringBuffer buffer = new StringBuffer();
	
	int lineNumber;
	int passengerCount;
	int money;
	
	public Subway(int lineNumber) {
		this.lineNumber = lineNumber;
	}
	
	public void take(int money) {
		this.money += money;
		passengerCount++;
	}
	
	public void showSubwayInfo() {
		buffer.append(lineNumber);
		buffer.append("번 지하철의 승객은 ");
		buffer.append(passengerCount);
		buffer.append("명 이고, 수입은 ");
		buffer.append(money);
		buffer.append("원 입니다.");
		
		String info = buffer.toString();
		System.out.println(info);
	}
	
}

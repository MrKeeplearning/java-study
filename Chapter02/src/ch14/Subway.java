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
		buffer.append("�� ����ö�� �°��� ");
		buffer.append(passengerCount);
		buffer.append("�� �̰�, ������ ");
		buffer.append(money);
		buffer.append("�� �Դϴ�.");
		
		String info = buffer.toString();
		System.out.println(info);
	}
	
}

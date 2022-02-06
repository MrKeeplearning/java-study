package ch14;

public class Bus {

	StringBuffer buffer = new StringBuffer();
	
	int busNumber;
	int passengerCount;
	int money;
	
	public Bus(int busNumber) {
		this.busNumber = busNumber;
	}
	
	public void take(int money) {
		this.money += money;
		passengerCount++;
	}
	
	public void showBusInfo() {
		buffer.append(busNumber);
		buffer.append("�� ������ �°��� ");
		buffer.append(passengerCount);
		buffer.append("�� �̰�, ������ ");
		buffer.append(money);
		buffer.append("�� �Դϴ�.");
		
		String info = buffer.toString();
		System.out.println(info);
	}
	
}

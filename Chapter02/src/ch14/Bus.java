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
		buffer.append("번 버스의 승객은 ");
		buffer.append(passengerCount);
		buffer.append("명 이고, 수입은 ");
		buffer.append(money);
		buffer.append("원 입니다.");
		
		String info = buffer.toString();
		System.out.println(info);
	}
	
}

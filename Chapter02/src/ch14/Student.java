package ch14;

public class Student {
	
	StringBuffer buffer = new StringBuffer();
	Taxi taxi = new Taxi();

	String studentName;
	int money;
	
	public Student(String studentName, int money) {
		this.studentName = studentName;
		this.money = money;
	}
	
	public void takeBus(Bus bus) {
		bus.take(1000);
		this.money -= 1000;
	}
	
	public void takeSubway(Subway subway) {
		subway.take(1200);
		this.money -= 1200;
	}
	
	public void takeTaxi(Taxi taxi, int kmDistance) {
		taxi.take(kmDistance);
		this.money -= taxi.totalFee(kmDistance);
	}
	
	public void showInfo() {
		buffer.append(studentName);
		buffer.append("´ÔÀÇ ³²Àº µ·Àº ");
		buffer.append(money);
		buffer.append("¿ø ÀÔ´Ï´Ù.");
		
		String info = buffer.toString();
		System.out.println(info);
	}

}

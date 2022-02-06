package ch14;

public class TakeTransTest {

	public static void main(String[] args) {
		
		Student stuJames = new Student("James", 5000);
		Student stuThomas = new Student("Thomas", 10000);
		Student stuEdward = new Student("Edward", 20000);
		
		Bus bus100 = new Bus(100);
		Bus bus500 = new Bus(500);
		
		Subway greenSubway = new Subway(2);
		
		Taxi jalTaxi = new Taxi("잘 간다 운수택시");
		
		stuJames.takeBus(bus100);
		stuThomas.takeSubway(greenSubway);
		stuEdward.takeTaxi(jalTaxi, 4);
		
		stuJames.showInfo();
		stuThomas.showInfo();
		stuEdward.showInfo();
		
		System.out.println();
		
		bus100.showBusInfo();
		bus500.showBusInfo();
		greenSubway.showSubwayInfo();
		jalTaxi.showTaxiInfo();

	}

}

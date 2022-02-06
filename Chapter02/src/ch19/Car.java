package ch19;

public class Car {
	
	private static int initialNum = 10000;
	private int carNum;

	public Car() {
		initialNum++;
		carNum = initialNum;
	}

	public int getCarNum() {
		return carNum;
	}
	
}

package ch20;

public class ArrayLengthErrorTest2 {

	public static void main(String[] args) {
		
		double[] arr = new double[5];
		
		int count = 0;
		double mulTotal = 1;
		
		arr[0] = 1.1; count++;
		arr[1] = 2.1; count++;
		arr[2] = 3.1; count++;
		
		for(int i=0; i<count; i++) {
			mulTotal *= arr[i];
		}
		
		System.out.println(mulTotal);

	}

}

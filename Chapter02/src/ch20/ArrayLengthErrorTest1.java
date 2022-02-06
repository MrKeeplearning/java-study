package ch20;

/**
 * 배열을 선언하면 개수만큼 메모리가 할당되지만, 실제 요소(데이터)가 없는 경우도 있다.
 * 배열의 length 속성은 배열의 개수를 반환해주기 때문에 요소의 개수와는 다르다.
 * 실수형인 double은 선언과 동시에 0.0으로 초기화되고,
 * 따라서 arr[3]과 arr[4]는 모두 0.0이 되어 mulTotal은 0.0이 출력된다.
 */

public class ArrayLengthErrorTest1 {

	public static void main(String[] args) {

		double[] arr = new double[5];
		double mulTotal = 1;
		
		arr[0] = 1.1;
		arr[1] = 2.1;
		arr[2] = 3.1;
		
		for (int i=0; i<arr.length; i++) {
			mulTotal *= arr[i];
		}
		
		System.out.println(mulTotal);
		
	}

}

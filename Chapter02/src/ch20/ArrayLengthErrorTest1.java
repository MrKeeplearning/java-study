package ch20;

/**
 * �迭�� �����ϸ� ������ŭ �޸𸮰� �Ҵ������, ���� ���(������)�� ���� ��쵵 �ִ�.
 * �迭�� length �Ӽ��� �迭�� ������ ��ȯ���ֱ� ������ ����� �����ʹ� �ٸ���.
 * �Ǽ����� double�� ����� ���ÿ� 0.0���� �ʱ�ȭ�ǰ�,
 * ���� arr[3]�� arr[4]�� ��� 0.0�� �Ǿ� mulTotal�� 0.0�� ��µȴ�.
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

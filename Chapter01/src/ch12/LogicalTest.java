package ch12;

/*
 * 단락 회로 평가(short circuit evaluation)
 * 
 * 논리 곱은 앞의 항의 결과가 false이면 뒤 항의 결과를 평가하지 않음
 * 논리 합은 앞의 항의 결과가 true이면 뒤 항의 결과를 평가하지 않음
 */
public class LogicalTest {

	public static void main(String[] args) {

		int num1 = 10;
		int i = 2;
		boolean value = ((num1 += 10) < 10) && ((i += 2) < 10);
		
		System.out.println(value);
		System.out.println(num1);
		System.out.println(i);
		
		value = ((num1 = num1 + 10 ) < 10) || ( ( i = i + 2 ) < 10);
		
		System.out.println(value);
		System.out.println(num1);
		System.out.println(i);

		
	}

}

package ch21;

public class ContinueTest {

	public static void main(String[] args) {
		
		int num;
		for(num=1; num<=100; num++) {
			
			// 3의 배수 아니면 continue
			// if문의 조건에 false이면 if문 뒤로 이어지는 모든 문장을 실행
			if((num % 3) != 0) continue;
			System.out.println(num);
		}

	}

}

package ch21;

public class ContinueTest {

	public static void main(String[] args) {
		
		int num;
		for(num=1; num<=100; num++) {
			
			// 3�� ��� �ƴϸ� continue
			// if���� ���ǿ� false�̸� if�� �ڷ� �̾����� ��� ������ ����
			if((num % 3) != 0) continue;
			System.out.println(num);
		}

	}

}

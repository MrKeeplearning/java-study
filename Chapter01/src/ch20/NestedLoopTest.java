package ch20;

public class NestedLoopTest {

	public static void main(String[] args) {
		
		int dan = 2;
		int count = 1;
		
		// ÁßÃ¸ for¹®
		for (; dan<10; dan++) {
			
			for(count=1; count<10; count++) {
				System.out.println(dan + "X" + count + "=" + dan*count);
			}
			System.out.println();
		}
		
		// ÁßÃ¸ while¹®
		dan = 2;
		while(dan < 10) {
			count = 1;
			while(count < 10) {
				System.out.println(dan + "X" + count + "=" + dan*count);
				count++;
			}
			dan++;
			System.out.println();
		}
	}

}

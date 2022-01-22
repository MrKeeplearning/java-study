package ch18;

import java.util.Scanner;

public class DoWhileTest2 {

	public static void main(String[] args) {
		
		try(Scanner scanner = new Scanner(System.in)) {
			int input;
			int sum = 0;
			
			input = scanner.nextInt();
			do {
				sum += input;
				input = scanner.nextInt();
			}
			while(input != 0);
			
			System.out.println(sum);
		}
		
	}

}

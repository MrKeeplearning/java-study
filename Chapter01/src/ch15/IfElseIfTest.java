package ch15;

import java.util.Scanner;

public class IfElseIfTest {

	public static void main(String[] args) {
		
		try(Scanner scanner = new Scanner(System.in)) {
			System.out.print("나이를 입력하세요: ");
			int charge;
			int age = scanner.nextInt();
			if (age < 8) {
				charge = 1000;
				System.out.println("미취학아동");
			}
			else if (age < 14) {
				charge = 2000;
				System.out.println("초등학생");
			}
			else if (age < 20) {
				charge = 2500;
				System.out.println("중고등학생");
			}
			else {
				charge = 3000;
				System.out.println("일반인");
			}
			System.out.println("입장료는 " + charge + "원입니다.");
		}
	}

}

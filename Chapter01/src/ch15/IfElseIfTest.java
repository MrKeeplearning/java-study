package ch15;

import java.util.Scanner;

public class IfElseIfTest {

	public static void main(String[] args) {
		
		try(Scanner scanner = new Scanner(System.in)) {
			System.out.print("���̸� �Է��ϼ���: ");
			int charge;
			int age = scanner.nextInt();
			if (age < 8) {
				charge = 1000;
				System.out.println("�����оƵ�");
			}
			else if (age < 14) {
				charge = 2000;
				System.out.println("�ʵ��л�");
			}
			else if (age < 20) {
				charge = 2500;
				System.out.println("�߰���л�");
			}
			else {
				charge = 3000;
				System.out.println("�Ϲ���");
			}
			System.out.println("������ " + charge + "���Դϴ�.");
		}
	}

}

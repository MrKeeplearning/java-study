package ch04;

public class Student {
	
	int studentID;
	String studentName;
	String address;
	
	public void setStudentName(String name) {
		studentName = name;
	}
	
	public String getStudentName() {
		return studentName;
	}
	
	public void showStudentInfo() {
		System.out.println(studentID + " �й��� �̸��� " + studentName + "�̰�, �ּҴ� " + address + "�Դϴ�.");
	}
	
}

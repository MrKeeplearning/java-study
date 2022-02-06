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
		System.out.println(studentID + " 학번의 이름은 " + studentName + "이고, 주소는 " + address + "입니다.");
	}
	
}

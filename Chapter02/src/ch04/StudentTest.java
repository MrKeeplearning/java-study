package ch04;

public class StudentTest {

	public static void main(String[] args) {
		
		String name;

		Student studentKim = new Student();
		studentKim.studentID = 12345;
		studentKim.studentName = "Kim";
		studentKim.address = "����� ������";
		
		name = studentKim.getStudentName();
		System.out.println(name);
		
		studentKim.setStudentName("Kwang");
		name = studentKim.getStudentName();
		System.out.println(name);
		
		studentKim.showStudentInfo();
		System.out.println(studentKim);
		
	}

}

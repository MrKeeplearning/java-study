package ch02;

public class EqualsTest {

	public static void main(String[] args) throws CloneNotSupportedException {
		
		Student std1 = new Student(100, "Lee");
		Student std2 = new Student(100, "Lee");

		System.out.println(std1 == std2);
		System.out.println(std1.equals(std2));	//주소는 같지만 논리적으로 동일
		
		System.out.println(std1.hashCode());
		System.out.println(std2.hashCode());
		
		// std1과 std2의 실제 메모리 주소
		System.out.println(System.identityHashCode(std1));
		System.out.println(System.identityHashCode(std2));
		
		std1.setStudentName("Kim");
		Student copyStudent = (Student)std1.clone();
		System.out.println(copyStudent);
		
	}

}

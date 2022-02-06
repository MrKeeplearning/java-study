package ch24;

public class StudentTest {

	public static void main(String[] args) {
		
		Student studentLee = new Student(1001, "Lee");
		Student studentKim = new Student(1002, "Kim");
		
		studentLee.addSubject("국어", 100);
		studentLee.addSubject("수학", 50);
		
		studentKim.addSubject("국어", 70);
		studentKim.addSubject("수학", 45);
		studentKim.addSubject("영어", 100);
		
		studentLee.showScoreInfo();
		System.out.println("====================");
		studentKim.showScoreInfo();

	}

}

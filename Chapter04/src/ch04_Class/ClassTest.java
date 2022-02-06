package ch04_Class;

public class ClassTest {

	public static void main(String[] args) {
		
		Person person = new Person();
		Class class1 = person.getClass();
		
		System.out.println(class1.getName());
		System.out.println(class1.getSimpleName());
		System.out.println(class1.getPackage().getName());
		System.out.println();
		
		try {
			Class class2 = Class.forName("ch04_Class.Person");
			System.out.println(class2.getName());
			System.out.println(class2.getSimpleName());
			System.out.println(class2.getPackage().getName());
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		}

	}

}

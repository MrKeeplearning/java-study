package ch12;

public class Person {
	
	StringBuffer buffer = new StringBuffer();

	String name;
	int age;
	
	public Person() {
		this("no name", 1);
	}
	
	// 자신의 주소를 반환하는 this
	public Person getPerson() {
		return this;
	}
	
	public Person(String name, int age) {
		
		this.name = name;
		this.age = age;
	}
	
	public String showPerson() {
		
		buffer.append(name);
		buffer.append(", ");
		buffer.append(age);
		return buffer.toString();
		
	}
	
	public static void main(String[] args) {
		
		Person person = new Person();
		String info = person.showPerson();
		System.out.println(info);
		
		System.out.println(person);
		
		Person person2 = person.getPerson();
		System.out.println(person2);
		
	}
	
}

package ch08;

public class PersonalData {
	
	public int height;
	public int weight;
	public String sex;
	public String name;
	public int age;
	
	public String showPersonalData() {
		String msg = "Ű�� " + height + "�̰�, �����԰� " + weight + "kg�� " + sex + "�� �ֽ��ϴ�."
					+" �̸��� " + name + "�̰�, ���̴� " + age + "���Դϴ�."; 		
		return msg;
	}
	
	public PersonalData(int height, int weight, String sex, String name, int age) {
		this.height = height;
		this.weight = weight;
		this.sex = sex;
		this.name = name;
		this.age = age;
	}
}

package ch08;

public class PersonalDataTest {

	public static void main(String[] args) {

		PersonalData tomData = new PersonalData(180, 78, "³²¼º", "Thomas", 37);
		String msg = tomData.showPersonalData();
		System.out.println(msg);
		
	}

}

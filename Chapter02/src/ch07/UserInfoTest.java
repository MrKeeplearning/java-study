package ch07;

public class UserInfoTest {

	public static void main(String[] args) {

		UserInfo userShin = new UserInfo();
		userShin.userID = "abc123";
		userShin.userPW = "1q2w3e4r!";
		userShin.userName = "Shin";
		userShin.userAddr = "��⵵ ������";
		userShin.userCell = "01012345678";
		System.out.println(userShin.showUserInfo());
		
		System.out.println();
		
		UserInfo userKim = new UserInfo("kjy123", "kim", "����� ������");
		System.out.println(userKim.showUserInfo());
		
	}

}

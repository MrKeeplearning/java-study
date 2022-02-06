package ch07;

public class UserInfoTest {

	public static void main(String[] args) {

		UserInfo userShin = new UserInfo();
		userShin.userID = "abc123";
		userShin.userPW = "1q2w3e4r!";
		userShin.userName = "Shin";
		userShin.userAddr = "경기도 성남시";
		userShin.userCell = "01012345678";
		System.out.println(userShin.showUserInfo());
		
		System.out.println();
		
		UserInfo userKim = new UserInfo("kjy123", "kim", "서울시 마포구");
		System.out.println(userKim.showUserInfo());
		
	}

}

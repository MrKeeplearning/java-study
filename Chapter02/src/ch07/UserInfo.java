package ch07;

public class UserInfo {

	public String userID;
	public String userPW;
	public String userName;
	public String userAddr;
	public String userCell;
	
	public String showUserInfo() {
		String msg = userID + "���� ���� �������Դϴ�."
							+ "\nName: " + userName
							+ "\nAddress: " + userAddr;
		return msg;
	}
	
	public UserInfo() {}
	
	public UserInfo(String userID, String userName, String userAddr) {
		
		this.userID = userID;
		this.userName = userName;
		this.userAddr = userAddr;
		
	}
	
}

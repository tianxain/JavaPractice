package bank;

public class User {
	String cardld; // ���п���
	String cardPwd; // ���п�����
	String userName; // �˻���
	String call; // �绰����
	double account = 0; // �˻����

	public User(String cardld, String cardPwd, String UserName, String call) {
		this.cardld = cardld;
		this.cardPwd = cardPwd;
		this.userName = UserName;
		this.call = call;
	}

	String getCardld() {
		return cardld;
	}

	public void setCardld(String cardld) {
		this.cardld = cardld;
	}

	String getCardPwd() {
		return cardPwd;
	}

	public void setCardPwd(String cardPwd) {
		this.cardPwd = cardPwd;
	}

	String getUserName() {
		return userName;
	}

	public void setUserName(String userName) {
		this.userName = userName;
	}

	String getCall() {
		return call;
	}

	public void setCall(String call) {
		this.call = call;
	}

	double getAccount() {
		return account;
	}

	public void setAccount(double account) {
		this.account = account;
	}
}

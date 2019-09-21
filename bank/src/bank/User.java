package bank;

public class User {
	String cardld; // 银行卡号
	String cardPwd; // 银行卡密码
	String userName; // 账户名
	String call; // 电话号码
	double account = 0; // 账户余额

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

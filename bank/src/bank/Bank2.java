package bank;

public class Bank2 {
	public static void regist(String cardld, String cardPwd, String userName, String call) {
		User newUser = new User(cardld, cardPwd, userName, call);
		for (int i = 0; i < BankTool.user.length; i++) {
			if (BankTool.user[i] == null) {
				BankTool.user[i] = newUser;
				System.out.println("ע��ɹ�");
				break;
			}
		}
	}

	public static boolean logine(String cardld, String cardPwd) {
		for (int i = 0; i < BankTool.user.length; i++) {
			if (BankTool.user[i] != null) {
				if (cardld.equals(BankTool.user[i].getCardld()) && cardPwd.equals(BankTool.user[i].getCardPwd())) {
					BankTool.index = i;
					return true;
				}
			}
		}
		return false;
	}

	public static void save(double money) {
		BankTool.user[BankTool.index].setAccount(BankTool.user[BankTool.index].getAccount() + money);
		System.out.println("��Ǯ�ɹ�");
	}

	public static void take(double money) {
		BankTool.user[BankTool.index].setAccount(BankTool.user[BankTool.index].getAccount() - money);
		System.out.println("ȡǮ�ɹ�");
	}

	public static void check() {
		System.out.println("��ǰ�˻����Ϊ��" + BankTool.user[BankTool.index].getAccount());
	}
}

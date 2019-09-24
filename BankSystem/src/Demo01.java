
import java.util.Scanner;

public class Demo01 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		while (true) {
			System.out.println("------��ӭʹ��������ȡ��ϵͳ------");
			System.out.println("�������˻����루�״�ʹ���밴#ע�ᣩ��");
			String account = scanner.nextLine();
			if (account.equals("#")) {
				System.out.println("�������µ��˻���");
				String account1 = scanner.nextLine();
				System.out.println("���������룺");
				String passwd1 = scanner.nextLine();
				System.out.println("�������û�������");
				String name1 = scanner.nextLine();
				BankOperate.regist(account1, passwd1, name1);
				continue;
			}
			System.out.println("���������룺");
			String passwd2 = scanner.nextLine(); // BankOperate.logine(account, passwd2);
			boolean result = BankOperate.logine(account, passwd2);
			if (result) {
				System.out.println("��¼�ɹ�����ӭ" + BankTool.account[BankTool.index].getName() + "����");
				operate();
			} else {
				System.out.println("����������������롣");
			}
		}
	}

	public static void operate() {
		Scanner scanner1 = new Scanner(System.in);
		while (true) {
			System.out.println("��ѡ�������Ŀ��");
			System.out.println("1.���");
			System.out.println("2.ȡ��");
			System.out.println("3.��ѯ");
			System.out.println("4.�˳�");
			int n = scanner1.nextInt();
			switch (n) {
			case 1:
				System.out.println("���������");
				double money = scanner1.nextDouble();
				BankOperate.save(money);
				break;
			case 2:
				System.out.println("������ȡ���");
				double money1 = scanner1.nextDouble();
				BankOperate.take(money1);
				break;
			case 3:
				BankOperate.check();
				break;
			case 4:
				return;

			default:
				System.out.println("����������������롣");
				break;
			}
		}
	}
}

class Account {
	String account;
	String passwd;
	String name;
	double money;

	public Account(String account, String passwd, String name) {
		this.account = account;
		this.passwd = passwd;
		this.name = name;
	}

	public String getAccount() {
		return account;
	}

	public void setAccount(String account) {
		this.account = account;
	}

	public String getPasswd() {
		return passwd;
	}

	public void setPasswd(String passwd) {
		this.passwd = passwd;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public double getMoney() {
		return money;
	}

	public void setMoney(double money) {
		this.money = money;
	}
}

class BankOperate {
	public static void regist(String account, String passwd, String name) {
		Account account1 = new Account(account, passwd, name);
		for (int i = 0; i < BankTool.account.length; i++) {
			if (BankTool.account[i] == null) {
				BankTool.account[i] = account1;
				System.out.println("ע��ɹ�");
				break;
			}
		}
	}

	public static boolean logine(String account, String passwd) {
		for (int i = 0; i < BankTool.account.length; i++) {
			if (BankTool.account[i] != null) {
				if (account.equals(BankTool.account[i].getAccount())
						&& passwd.equals(BankTool.account[i].getPasswd())) {
					BankTool.index = i;
					return true;
				}
			}
		}
		return false;
	}

	public static void save(double money) {
		BankTool.account[BankTool.index].setMoney(BankTool.account[BankTool.index].getMoney() + money);
		System.out.println("��Ǯ�ɹ�");
	}

	public static void take(double money) {
		BankTool.account[BankTool.index].setMoney(BankTool.account[BankTool.index].getMoney() - money);
		System.out.println("ȡǮ�ɹ�");
	}

	public static void check() {
		System.out.println("��ǰ�˻����Ϊ��" + BankTool.account[BankTool.index].getMoney());
	}
}

class BankTool {
	public static Account[] account = new Account[100];
	public static int index = 0;
}

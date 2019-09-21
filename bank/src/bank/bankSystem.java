package bank;

import java.util.Scanner;

//import java.util.Set;
public class bankSystem {
	public static void main(String[] args) {
		while (true) {
			Scanner scanner = new Scanner(System.in);
			System.out.println("欢迎进入网上银行系统！");
			System.out.println("请输入银行卡号(首次使用请按0注册):");
			String account = scanner.nextLine();
			if (account.equals("0")) {
				System.out.println("请输入新的账户：");
				String carldld = scanner.nextLine();
				System.out.println("请输入密码：");
				String cardPwd = scanner.nextLine();
				System.out.println("请输入用户姓名：");
				String userName = scanner.nextLine();
				System.out.println("请输入用户电话号码：");
				String call = scanner.nextLine();
				Bank.regist(carldld, cardPwd, userName, call);
				continue;
			}
			System.out.println("请输入密码：");
			String passwd = scanner.nextLine();
			boolean result = Bank.logine(account, passwd);
			if (result) {
				System.out.println("登录成功，欢迎" + BankTool.user[BankTool.index].getUserName() + "光临");
				operate();
			} else {
				System.out.println("输入错误，请重新输入。");
			}
		}
	}

	public static void operate() {
		Scanner scanner1 = new Scanner(System.in);
		while (true) {
			System.out.println("请选择服务项目：");
			System.out.println("1.存款");
			System.out.println("2.取款");
			System.out.println("3.查询");
			System.out.println("4.退出");
			int n = scanner1.nextInt();
			switch (n) {
			case 1:
				System.out.println("请输入存款金额：");
				double money = scanner1.nextDouble();
				Bank.save(money);
				break;
			case 2:
				System.out.println("请输入取款金额：");
				double money1 = scanner1.nextDouble();
				Bank.take(money1);
				break;
			case 3:
				Bank.check();
				break;
			case 4:
				return;

			default:
				System.out.println("输入错误，请重新输入。");
				break;
			}
		}
	}
}

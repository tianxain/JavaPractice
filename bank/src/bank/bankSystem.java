package bank;

import java.util.Scanner;

//import java.util.Set;
public class bankSystem {
	public static void main(String[] args) {
		while (true) {
			Scanner scanner = new Scanner(System.in);
			System.out.println("��ӭ������������ϵͳ��");
			System.out.println("���������п���(�״�ʹ���밴0ע��):");
			String account = scanner.nextLine();
			if (account.equals("0")) {
				System.out.println("�������µ��˻���");
				String carldld = scanner.nextLine();
				System.out.println("���������룺");
				String cardPwd = scanner.nextLine();
				System.out.println("�������û�������");
				String userName = scanner.nextLine();
				System.out.println("�������û��绰���룺");
				String call = scanner.nextLine();
				Bank.regist(carldld, cardPwd, userName, call);
				continue;
			}
			System.out.println("���������룺");
			String passwd = scanner.nextLine();
			boolean result = Bank.logine(account, passwd);
			if (result) {
				System.out.println("��¼�ɹ�����ӭ" + BankTool.user[BankTool.index].getUserName() + "����");
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
				Bank.save(money);
				break;
			case 2:
				System.out.println("������ȡ���");
				double money1 = scanner1.nextDouble();
				Bank.take(money1);
				break;
			case 3:
				Bank.check();
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

package student;

import java.util.HashSet;
import java.util.Scanner;

 
public class Login {
	public static HashSet<Customer> set = new HashSet<>();;
 
	public Login() {
		super();
	}
 
	// �жϵ�¼�Ƿ�ɹ�
	public static void login(String username, String password) {
		if (set.size() == 0) {
			System.out.println("*��¼ʧ�ܣ�����û��ע�ᣬ�����ԣ�*");
			return;
		}
		for (Customer cust : set) {
			if (cust.getUsername().equals(username)) {
				if (cust.getPassword().equals(password)) {
					System.out.println("*��¼�ɹ���*");
					StudentMessages sm = new StudentMessages();
					sm.index();
				} else {
					System.out.println("*��¼ʧ�ܣ��������*");
					break;
				}
			} else {
				System.out.println("*��¼ʧ�ܣ��û��������ڣ�*");
				break;
			}
		}
	}
 
	// �ж�ע���Ƿ�ɹ�
	public static boolean register(String username, String password) {
		if (set.size() == 0) {
			System.out.println("*ע��ɹ�����*");
		}
		for (Customer cust : set) {
			if (cust.getUsername().equals(username)) {
				System.out.println("*�û����Ѵ��ڣ���*");
				return false;
			} else {
				System.out.println("*ע��ɹ�����*");
				return true;
			}
		}
		return true;
	}
 
	// ע��������
	public void loginindex() {
		while (true) {
			System.out.println("******������***********");
			System.out.println("*     1.��¼          *");
			System.out.println("*     2.ע��          *");
			System.out.println("*     0.�˳�          *");
			System.out.println("***********************");
			System.out.println("*��ѡ��");
			@SuppressWarnings("resource")
			int num = new Scanner(System.in).nextInt();
			while (true) {
				if (num == 1) {
					System.out.println("*�������û���:");
					@SuppressWarnings("resource")
					String name = new Scanner(System.in).nextLine();
					System.out.println("*����������:");
					@SuppressWarnings("resource")
					String password = new Scanner(System.in).nextLine();
					login(name, password);
					break;
				} else if (num == 2) {
					System.out.println("*�������û���:");
					@SuppressWarnings("resource")
					String name = new Scanner(System.in).nextLine();
					System.out.println("����������:");
					@SuppressWarnings("resource")
					String password = new Scanner(System.in).nextLine();
					if (register(name, password) == false) {
						break;
					}
					Customer cust = new Customer(name, password);
					set.add(cust);
					break;
				} else if (num == 0) {
					System.out.println("***ϵͳ���˳�***");
					System.exit(0);
					break;
				} else {
					System.out.println("����ĸ�ʽ����ȷ�������ԣ���");
				}
			}
		}
	}
}

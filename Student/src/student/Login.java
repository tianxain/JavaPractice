package student;

import java.util.HashSet;
import java.util.Scanner;

 
public class Login {
	public static HashSet<Customer> set = new HashSet<>();;
 
	public Login() {
		super();
	}
 
	// 判断登录是否成功
	public static void login(String username, String password) {
		if (set.size() == 0) {
			System.out.println("*登录失败，可能没有注册，请重试！*");
			return;
		}
		for (Customer cust : set) {
			if (cust.getUsername().equals(username)) {
				if (cust.getPassword().equals(password)) {
					System.out.println("*登录成功！*");
					StudentMessages sm = new StudentMessages();
					sm.index();
				} else {
					System.out.println("*登录失败！密码错误！*");
					break;
				}
			} else {
				System.out.println("*登录失败，用户名不存在！*");
				break;
			}
		}
	}
 
	// 判断注册是否成功
	public static boolean register(String username, String password) {
		if (set.size() == 0) {
			System.out.println("*注册成功！！*");
		}
		for (Customer cust : set) {
			if (cust.getUsername().equals(username)) {
				System.out.println("*用户名已存在！！*");
				return false;
			} else {
				System.out.println("*注册成功！！*");
				return true;
			}
		}
		return true;
	}
 
	// 注册主界面
	public void loginindex() {
		while (true) {
			System.out.println("******主界面***********");
			System.out.println("*     1.登录          *");
			System.out.println("*     2.注册          *");
			System.out.println("*     0.退出          *");
			System.out.println("***********************");
			System.out.println("*请选择：");
			@SuppressWarnings("resource")
			int num = new Scanner(System.in).nextInt();
			while (true) {
				if (num == 1) {
					System.out.println("*请输入用户名:");
					@SuppressWarnings("resource")
					String name = new Scanner(System.in).nextLine();
					System.out.println("*请输入密码:");
					@SuppressWarnings("resource")
					String password = new Scanner(System.in).nextLine();
					login(name, password);
					break;
				} else if (num == 2) {
					System.out.println("*请输入用户名:");
					@SuppressWarnings("resource")
					String name = new Scanner(System.in).nextLine();
					System.out.println("请输入密码:");
					@SuppressWarnings("resource")
					String password = new Scanner(System.in).nextLine();
					if (register(name, password) == false) {
						break;
					}
					Customer cust = new Customer(name, password);
					set.add(cust);
					break;
				} else if (num == 0) {
					System.out.println("***系统已退出***");
					System.exit(0);
					break;
				} else {
					System.out.println("输入的格式不正确，请重试！！");
				}
			}
		}
	}
}

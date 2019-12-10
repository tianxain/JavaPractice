package student;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.Scanner;
//import com.briup.login2.Student;
 
public class StudentMessages {
	public static ArrayList<Student> list = new ArrayList<>();
 
	public StudentMessages() {
		super();
	}
 
	// 查询所有学生信息
	public void findAll() {
		if (list.size() == 0) {
			System.out.println("*没有任何学生的信息！！*");
			return;
		} else {
			Iterator<Student> iter = list.iterator();
			while (iter.hasNext()) {
				System.out.println(iter.next());
			}
		}
	}
 
	// 添加学生，判断学号是否存在
	public boolean add(int id) {
		if (list.size() == 0) {
			return true;
		}
		for (Student stu : list) {
			if (stu.getId() == id) {
				System.out.println("*学号已存在*");
				return false;
			}
		}
		return true;
	}
 
	// 修改学生信息，判断学号是否存在
	public boolean update(int id, String name, int age,String sex,String addr) {
		if (list.size() == 0) {
			return false;
		}
		for (Student stu : list) {
			if (stu.getId() == id) {
				stu.setName(name);
				stu.setAge(age);
				stu.setSex(sex);
				stu.setAddr(addr);
				
				list.set(id - 1, stu);
				return true;
			}
		}
		if (true) {
			System.out.println("系统中没有该学生的信息！！");
		}
		return false;
	}
 
	// 删除指定id学生信息
	public boolean delete(int id) {
		if (list.size() == 0) {
			return false;
		}
		for (Student stu : list) {
			if (stu.getId() == id) {
				list.remove(id - 1);
				System.out.println("删除成功");
				return true;
			}
		}
		System.out.println("此学号的学生不存在！！");
		return true;
	}
 
	// 设计学生通讯录管理系统主界面
	public void index() {
 
		StudentMessages sm = new StudentMessages();
		s: while (true) {
			System.out.println("*********学生信息管理系统*********");
			System.out.println("*        1.查询学生信息                   *");
			System.out.println("*        2.增加学生信息                   *");
			System.out.println("*        3.修改学生信息                   *");
			System.out.println("*        4.删除学生信息                   *");
			System.out.println("*        0.退出管理系统                   *");
			System.out.println("*请输入：");
			Scanner scanner = new Scanner(System.in);
			int num = scanner.nextInt();
			s2: while (true) {
				if (num == 1) {
					sm.findAll();
					break;
				} else if (num == 2) {
					System.out.println("*请输入学生的id：");
					@SuppressWarnings("resource")
					int id = new Scanner(System.in).nextInt();
					if (sm.add(id) == false) {
						break s2;
					}
					System.out.println("*请输入学生的姓名：");
					@SuppressWarnings("resource")
					String name = new Scanner(System.in).nextLine();
					
					System.out.println("*请输入学生的年龄：");
					@SuppressWarnings("resource")
					int age = new Scanner(System.in).nextInt();
					
					System.out.println("*请输入学生的性别：");
					@SuppressWarnings("resource")
					String sex =new Scanner(System.in).nextLine();
					
					System.out.println("*请输入学生的地址：");
					@SuppressWarnings("resource")
					String addr =new Scanner(System.in).nextLine();
					
					Student stu = new Student(id, name, age,sex,addr);
					list.add(stu);
					System.out.println("添加成功！！");
					break;
				} else if (num == 3) {
					
					System.out.println("*请输入要修改学生的id：");
					@SuppressWarnings("resource")
					int id = new Scanner(System.in).nextInt();
					
					System.out.println("*请输入学生的姓名：");
					@SuppressWarnings("resource")
					String name = new Scanner(System.in).nextLine();
					
					System.out.println("*请输入学生的年龄：");
					@SuppressWarnings("resource")
					int age = new Scanner(System.in).nextInt();
					
					System.out.println("*请输入学生的性别：");
					@SuppressWarnings("resource")
					String sex =new Scanner(System.in).nextLine();
					
					System.out.println("*请输入学生的地址：");
					@SuppressWarnings("resource")
					String addr =new Scanner(System.in).nextLine();
					if (sm.update(id, name, age,sex,addr) == false) {
						break s2;
					}
					System.out.println("修改成功！！");
					break;
				} else if (num == 4) {
					System.out.println("*请输入学生的id：");
					@SuppressWarnings("resource")
					int id = new Scanner(System.in).nextInt();
					if (sm.delete(id) == false) {
						break s2;
					}
					break;
				} else if (num == 0) {
					System.out.println("****系统已退出！****");
					System.exit(0);
					break s;
				} else {
					System.out.println("输入错误，请重新输入！！");
				}
			}
		}
	}
}

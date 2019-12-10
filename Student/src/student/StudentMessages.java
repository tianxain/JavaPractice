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
 
	// ��ѯ����ѧ����Ϣ
	public void findAll() {
		if (list.size() == 0) {
			System.out.println("*û���κ�ѧ������Ϣ����*");
			return;
		} else {
			Iterator<Student> iter = list.iterator();
			while (iter.hasNext()) {
				System.out.println(iter.next());
			}
		}
	}
 
	// ���ѧ�����ж�ѧ���Ƿ����
	public boolean add(int id) {
		if (list.size() == 0) {
			return true;
		}
		for (Student stu : list) {
			if (stu.getId() == id) {
				System.out.println("*ѧ���Ѵ���*");
				return false;
			}
		}
		return true;
	}
 
	// �޸�ѧ����Ϣ���ж�ѧ���Ƿ����
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
			System.out.println("ϵͳ��û�и�ѧ������Ϣ����");
		}
		return false;
	}
 
	// ɾ��ָ��idѧ����Ϣ
	public boolean delete(int id) {
		if (list.size() == 0) {
			return false;
		}
		for (Student stu : list) {
			if (stu.getId() == id) {
				list.remove(id - 1);
				System.out.println("ɾ���ɹ�");
				return true;
			}
		}
		System.out.println("��ѧ�ŵ�ѧ�������ڣ���");
		return true;
	}
 
	// ���ѧ��ͨѶ¼����ϵͳ������
	public void index() {
 
		StudentMessages sm = new StudentMessages();
		s: while (true) {
			System.out.println("*********ѧ����Ϣ����ϵͳ*********");
			System.out.println("*        1.��ѯѧ����Ϣ                   *");
			System.out.println("*        2.����ѧ����Ϣ                   *");
			System.out.println("*        3.�޸�ѧ����Ϣ                   *");
			System.out.println("*        4.ɾ��ѧ����Ϣ                   *");
			System.out.println("*        0.�˳�����ϵͳ                   *");
			System.out.println("*�����룺");
			Scanner scanner = new Scanner(System.in);
			int num = scanner.nextInt();
			s2: while (true) {
				if (num == 1) {
					sm.findAll();
					break;
				} else if (num == 2) {
					System.out.println("*������ѧ����id��");
					@SuppressWarnings("resource")
					int id = new Scanner(System.in).nextInt();
					if (sm.add(id) == false) {
						break s2;
					}
					System.out.println("*������ѧ����������");
					@SuppressWarnings("resource")
					String name = new Scanner(System.in).nextLine();
					
					System.out.println("*������ѧ�������䣺");
					@SuppressWarnings("resource")
					int age = new Scanner(System.in).nextInt();
					
					System.out.println("*������ѧ�����Ա�");
					@SuppressWarnings("resource")
					String sex =new Scanner(System.in).nextLine();
					
					System.out.println("*������ѧ���ĵ�ַ��");
					@SuppressWarnings("resource")
					String addr =new Scanner(System.in).nextLine();
					
					Student stu = new Student(id, name, age,sex,addr);
					list.add(stu);
					System.out.println("��ӳɹ�����");
					break;
				} else if (num == 3) {
					
					System.out.println("*������Ҫ�޸�ѧ����id��");
					@SuppressWarnings("resource")
					int id = new Scanner(System.in).nextInt();
					
					System.out.println("*������ѧ����������");
					@SuppressWarnings("resource")
					String name = new Scanner(System.in).nextLine();
					
					System.out.println("*������ѧ�������䣺");
					@SuppressWarnings("resource")
					int age = new Scanner(System.in).nextInt();
					
					System.out.println("*������ѧ�����Ա�");
					@SuppressWarnings("resource")
					String sex =new Scanner(System.in).nextLine();
					
					System.out.println("*������ѧ���ĵ�ַ��");
					@SuppressWarnings("resource")
					String addr =new Scanner(System.in).nextLine();
					if (sm.update(id, name, age,sex,addr) == false) {
						break s2;
					}
					System.out.println("�޸ĳɹ�����");
					break;
				} else if (num == 4) {
					System.out.println("*������ѧ����id��");
					@SuppressWarnings("resource")
					int id = new Scanner(System.in).nextInt();
					if (sm.delete(id) == false) {
						break s2;
					}
					break;
				} else if (num == 0) {
					System.out.println("****ϵͳ���˳���****");
					System.exit(0);
					break s;
				} else {
					System.out.println("����������������룡��");
				}
			}
		}
	}
}

package com.itheima.example37;
class Person {
	// ���涨���finalize()����������������ǰ������
	public void finalize() {
		System.out.println("���󽫱���Ϊ��������...");
	}
}
public class Example37 {
	// 1����ʾһ����֪ͨǿ���������յķ���
	public static void recyclegWaste1(){
		Person p1 = new Person();
		p1 = null;
		int i = 1;
		while (i < 10) {
			System.out.println("����1ѭ����...........");
			i++;
		}
	}
	// 2����ʾһ��֪ͨǿ���������յķ���
	public static void recyclegWaste2(){
		Person p2 = new Person();
		p2 = null;
		// ֪ͨ��������������ǿ����������
		System.gc();
//		 Runtime.getRuntime().gc();
		int i = 1;
		while (i < 10) {
			System.out.println("����2ѭ����...........");
			i++;
		}
	}
	public static void main(String[] args) {
		// �ֱ��������ģ����ʾ�������յķ���
		recyclegWaste1();
		System.out.println("================");
		recyclegWaste2();
	}
}



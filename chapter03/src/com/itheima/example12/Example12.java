package com.itheima.example12;
class Student {
	static String schoolName;  // ������̬����schoolName
}
public class Example12 {
	public static void main(String[] args) {
		Student stu1 = new Student();	    // ������1��ѧ������
		Student stu2 = new Student();       // ������2��ѧ������
		Student.schoolName = "�廪��ѧ";		// Ϊ��̬������ֵ
		// �ֱ��������ѧ���������Ϣ
		System.out.println("����" + stu1.schoolName+"��ѧ��");	
		System.out.println("����" + stu2.schoolName+"��ѧ��"); 
	}
}



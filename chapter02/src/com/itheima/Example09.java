package com.itheima;
public class Example09 {
	public static void main(String[] args) {
		int grade = 75; // ����ѧ���ɼ�
		if (grade > 80) {
			// �������� grade > 80
			System.out.println("�óɼ��ĵȼ�Ϊ��");
		} else if (grade > 70) {
			// ���������� grade > 80 ������������ grade > 70 
			System.out.println("�óɼ��ĵȼ�Ϊ��");
		} else if (grade > 60) {
			// ���������� grade > 70 ������������ grade > 60 
			System.out.println("�óɼ��ĵȼ�Ϊ��");
		} else {
			// ���������� grade > 60 
			System.out.println("�óɼ��ĵȼ�Ϊ��");
		}
	}
}


package com.itheima;
import java.text.*;
import java.util.*;
public class Example24 {
	public static void main(String[] args) {
		// ����Date����
		Date date = new Date();
		// Full��ʽ�����ڸ�ʽ������
		DateFormat fullFormat = 
				DateFormat.getDateInstance(DateFormat.FULL);
		// Long��ʽ�����ڸ�ʽ������
		DateFormat longFormat = 
				DateFormat.getDateInstance(DateFormat.LONG);
		// MEDIUM��ʽ������/ʱ�� ��ʽ������
		DateFormat mediumFormat = DateFormat.getDateTimeInstance(
				DateFormat.MEDIUM, DateFormat.MEDIUM);
		// SHORT��ʽ������/ʱ���ʽ������
		DateFormat shortFormat = DateFormat.getDateTimeInstance(
				DateFormat.SHORT, DateFormat.SHORT);
		// �����ӡ��ʽ��������ڻ�������/ʱ��
		System.out.println("��ǰ���ڵ�������ʽΪ��" 
		                    + fullFormat.format(date));
		System.out.println("��ǰ���ڵĳ���ʽΪ��" 
		                    + longFormat.format(date));
		System.out.println("��ǰ���ڵ���ͨ��ʽΪ��" 
		                    + mediumFormat.format(date));
		System.out.println("��ǰ���ڵĶ̸�ʽΪ��" 
		                    + shortFormat.format(date));
	}
}



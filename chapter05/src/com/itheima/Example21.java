package com.itheima;
import java.util.*;
public class Example21 {
	public static void main(String[] args) {
		// ��ȡ��ʾ��ǰʱ���Calendar����
		Calendar calendar = Calendar.getInstance();
		// ����ָ������
		calendar.set(2018, 1, 1);
		// Ϊָ����������ʱ��
		calendar.add(Calendar.DATE, 100);
		// ����ָ�����ڵ���
		int year = calendar.get(Calendar.YEAR);
		// ����ָ�����ڵ���
		int month = calendar.get(Calendar.MONTH) + 1;
		// ����ָ�����ڵ���
		int date = calendar.get(Calendar.DATE);
		System.out.println("�ƻ���������Ϊ:" + year + "��" 
		                       + month + "��" + date + "��");
	}
}


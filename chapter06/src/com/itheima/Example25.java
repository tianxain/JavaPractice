package com.itheima;
import java.util.ArrayList;
import java.util.Collections;
public class Example25 {
	public static void main(String[] args) {
		ArrayList<String> list = new ArrayList<>();
		Collections.addAll(list, "C","Z","B","K");    // ���Ԫ��
		System.out.println("����ǰ: " + list);          // �������ǰ�ļ���
		Collections.reverse(list);                    // ��ת����
		System.out.println("��ת�� " + list); 
		Collections.sort(list);                       // ����Ȼ˳������
		System.out.println("����Ȼ˳�������: " + list);
		Collections.shuffle(list);                    // ������Ҽ���Ԫ��
		System.out.println("�����˳�������: " + list); 
		Collections.swap(list, 0, list.size()-1);     // ��������βԪ�ؽ���
		System.out.println("������βԪ�ؽ�����: " + list); 
	}
}


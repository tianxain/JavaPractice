package com.itheima.example20;
//�����ⲿ��Outer
class Outer {
	static int m = 0; // �����ⲿ�ྲ̬����m
	static class Inner {
		void show() {
			// ��̬�ڲ�������ⲿ�ྲ̬��Ա
			System.out.println("�ⲿ�ྲ̬����m="+m);
		}
	}
}
//���������
public class Example20 {
	public static void main(String[] args) {
		// ��̬�ڲ������ֱ��ͨ���ⲿ�ഴ��
		Outer.Inner inner = new Outer.Inner(); 
		inner.show();
	}
}

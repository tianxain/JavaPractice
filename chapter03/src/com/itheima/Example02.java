package com.itheima;
public class Example02 {
	public static void main(String[] args) {
		Person p1 = new Person(); // ������һ��Person�����
		Person p2 = new Person(); // �����ڶ���Person�����
		p1.age = 18;              // Ϊage���Ը�ֵ
		p1.speak();               // ���ö���ķ���
		p2.speak();
	}
}

package com.itheima.example09;
class Person {
	// ����int���͵ı���age
	int age;
	// �����вι��췽��
	public Person(int a) {
		age = a;                  //Ϊage���Ը�ֵ
	}
	// ���� speak() ����
	public void speak() {
		System.out.println("�ҽ���" + age + "����!");
	}
}
public class Example09 {
	public static void main(String[] args) {
		Person p = new Person(18); // ʵ����Person����
		p.speak();
	}
}



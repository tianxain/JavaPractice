package com.itheima.example13;
class Person {
	public static void say() { // ���徲̬����
		System.out.println("Hello!");
	}
}
public class Example13 {
	public static void main(String[] args) {
		// ������.�������ķ�ʽ���þ�̬����
		Person.say();
		// ʵ��������
		Person person = new Person();
		// ��ʵ��������.�������ķ�ʽ�����þ�̬����
		person.say();
	}
}



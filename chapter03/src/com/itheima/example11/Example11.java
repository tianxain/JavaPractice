package com.itheima.example11;
class Person {
	public Person() {
		System.out.println("�޲εĹ��췽����������...");
	}
	public Person(int age) {
		this();                    // �����޲εĹ��췽��
		System.out.println("�вεĹ��췽����������...");
	}
}
public class Example11 { 
	public static void main(String[] args) {
		Person p = new Person(18); // ʵ���� Person ����
	}
}



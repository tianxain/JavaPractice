package com.itheima.example10;
class Person {
	// ����String���͵ı���name
	String name;
	// ����int���͵ı���age
	int age;
	// �����вι��췽��
	public Person(int a) {
		age = a;                  // Ϊage���Ը�ֵ
	}
	public Person(String n,int a){
		name = n;                // Ϊname���Ը�ֵ
		age = a;                 // Ϊage���Ը�ֵ
	}
	// ���� speak() ����
	public void speak() {
		System.out.println("�ҽ���" + age + "����!");
	}
	// ����say()����
	public void say(){
		System.out.println("�ҽ�"+name+",����" + age + "����!");
	}
}
public class Example10 {
	public static void main(String[] args) {
		Person p1 = new Person(18); 
		Person p2 = new Person("����",32);
		p1.speak();
		p2.say();
	}
}



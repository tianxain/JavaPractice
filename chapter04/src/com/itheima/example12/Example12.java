package com.itheima.example12;
//���������Animal
abstract class Animal { 
	// ������󷽷�shout()
	public abstract void shout(); 
}
//����Dog��̳г�����Animal
class Dog extends Animal {
	// ʵ�ֳ��󷽷�shout()����д������
	public void shout() {
		System.out.println("��������");
	}
}
//���������
public class Example12 {
	public static void main(String[] args) {
		Dog dog = new Dog(); // ����Dog���ʵ������
		dog.shout();         // ����dog�����shout()����
	}
}

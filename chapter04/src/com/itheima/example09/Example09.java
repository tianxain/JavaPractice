package com.itheima.example09;
//����Animal��
class Animal {
	// ʹ��final�ؼ�������shout()����
	public final void shout() {
	}
}
//����Dog��̳�Animal��
class Dog extends Animal {
	// ��дAnimal���shout()����
	public void shout() {
	}
}
//���������
public class Example09 {
	public static void main(String[] args) {
		Dog dog=new Dog(); // ����Dog���ʵ������
	}
}


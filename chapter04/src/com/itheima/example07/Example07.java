package com.itheima.example07;
//����Animal��
class Animal {
	// ��дObject���toString()����
	public String toString() {     
		return "����һֻ����";
	}
}
//���������
public class Example07 {
	public static void main(String[] args) {
		Animal animal = new Animal();          // ����Animal����
		System.out.println(animal.toString()); // ��ӡanimal��toString()
	}
}



package com.itheima.example17;
//����ӿ�Animal
interface Animal {
	void shout(); // �������shout()����
}
//����Cat��ʵ��Animal�ӿ�
class Cat implements Animal {
	// ʵ�ֽӿ�shout()����
	public void shout() {
		System.out.println("��������");
	}
	// ����Cat�����е�ץ����catchMouse()����
	public void catchMouse() {
		System.out.println("Сèץ���󡭡�");
	}
}
//����Dog��ʵ��Animal�ӿ�
class Dog implements Animal {
	// ʵ�ֽӿ�shout()����
	public void shout() {
		System.out.println("��������");
	}
}
//���������
public class Example17 {
	public static void main(String[] args) {
//		Animal an1 = new Dog(); 
//		Cat cat = (Cat) an1;
//		cat.shout();
//		cat.catchMouse();
		Animal an1 = new Dog(); 
		if(an1 instanceof Cat){ // �ж�an1��������
			Cat cat = (Cat) an1;
			cat.shout();
			cat.catchMouse();
		}else{
			System.out.println("�����͵Ķ�����Cat���ͣ�");
		}
	}
}

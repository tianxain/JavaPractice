package com.itheima.example16;
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
//���������
public class Example16 {
	public static void main(String[] args) {
//		Animal an1 = new Cat(); 
//		an1.shout();
//		an1.catchMouse();
		Animal an1 = new Cat(); 
		Cat cat = (Cat) an1;
		cat.shout();
		cat.catchMouse();
	}
}



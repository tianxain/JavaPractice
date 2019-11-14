package com.itheima.example14;
//������Animal�ӿ�
interface Animal {
	int ID = 1;       // ����ȫ�ֳ���
	void breathe();  // ������󷽷�breathe()
	// ����һ��Ĭ�Ϸ���
	default void getType(String type){
		System.out.println("�ö������ڣ�"+type);
	}
	// ����һ����̬����
	static int getID(){
		return Animal.ID;
	}
}
//������LandAnimal�ӿ�,���̳���Animal�ӿ�
interface LandAnimal extends Animal { 
	void run();      // ������󷽷�run()
}
//Dog��ʵ����LandAnimal�ӿ�
class Dog implements LandAnimal {
	// ʵ��breathe()����
	public void breathe() {
		System.out.println("���ں���");
	}
	// ʵ��run()����
	public void run() {
		System.out.println("����½������");
	}
}
//���������
public class Example14 {
	public static void main(String args[]) {
		System.out.println(Animal.getID()); // ͨ���ӿ��������෽��
		Dog dog = new Dog();          // ����Dog���ʵ������
		System.out.println(dog.ID);   // ��ʵ�����л�ȡ�ӿ�ȫ�ֳ���
		dog.breathe();                // ����dog�����breathe()����
		dog.getType("Ȯ��");           // ͨ��dog���󣬵��ýӿ�Ĭ�Ϸ���
		dog.run();                    // ����dog�����run()����
	}
}

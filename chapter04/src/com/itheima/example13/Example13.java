package com.itheima.example13;
//������Animal�ӿ�
interface Animal {
	int ID = 1;       // ����ȫ�ֳ���
	void breathe();   // ������󷽷�breathe()
	// ����һ��Ĭ�Ϸ���
	default void getType(String type){
		System.out.println("�ö������ڣ�"+type);
	}
	// ����һ����̬����
	static int getID(){
		return Animal.ID;
	}
}
//Dog��ʵ����Animal�ӿ�
class Dog implements Animal {
	// ʵ��breathe()����
	public void breathe() {
		System.out.println("���ں���");
	}
}
//���������
public class Example13 {
	public static void main(String args[]) {
		System.out.println(Animal.getID()); // ͨ���ӿ��������෽��
		Dog dog = new Dog();          // ����Dog���ʵ������
		System.out.println(dog.ID);   // ��ʵ�����л�ȡ�ӿ�ȫ�ֳ���
		dog.breathe();                // ����dog�����breathe()����
		dog.getType("Ȯ��"); // ͨ���ӿ�ʵ����Dog��ʵ�������󣬵��ýӿ�Ĭ�Ϸ���
	}
}


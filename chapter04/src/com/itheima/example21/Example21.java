package com.itheima.example21;
//���嶯����ӿ�
interface Animal {
	void shout();
}
public class Example21 {
	public static void main(String[] args) {
		String name = "С��";
		// ���������ڲ�����Ϊ�������ݸ�animalShout()����
		animalShout(new Animal() {
			// ʵ��shout()����
			public void shout() {
				// JDK 8��ʼ���ֲ��ڲ��ࡢ�����ڲ�����Է��ʷ�final�ľֲ�����
				System.out.println(name + "����...");
			}
		});
	}
	// ���徲̬����animalShout()�����սӿ����Ͳ���
	public static void animalShout(Animal an) {
		an.shout(); // ���ô������an��shout()����
	}
}

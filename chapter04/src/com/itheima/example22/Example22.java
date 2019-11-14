package com.itheima.example22;
//���嶯����ӿ�
interface Animal {
	void shout(); // ���巽��shout()
}
public class Example22 {
	public static void main(String[] args) {
		String name = "С��";
		// 1�������ڲ�����Ϊ�������ݸ�animalShout()����
		animalShout(new Animal() {
			public void shout() {
				System.out.println("�����ڲ��������" + name + "����...");
			}
		});
		// 2��ʹ��Lambda���ʽ��Ϊ�������ݸ�animalShout()����
		animalShout(() -> System.out.println("Lambda���ʽ�����" + name + "����..."));
	}
	// ����һ��animalShout()��̬���������սӿ����͵Ĳ���
	public static void animalShout(Animal an) {
		an.shout();
	}
}

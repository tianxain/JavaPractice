package com.itheima.example06;
//����Animal��
class Animal {       
  // ���嶯��еķ���                  
	void shout() {		
		System.out.println("����У�");
	}
}
//���������
public class Example06 {
	public static void main(String[] args)  {
		Animal animal = new Animal();  	        // ����Animal�����
		System.out.println(animal.toString());	// ����toString()��������ӡ
	}
}

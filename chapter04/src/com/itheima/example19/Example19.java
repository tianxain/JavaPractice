package com.itheima.example19;
//�����ⲿ��Outer
class Outer {
	int m = 0;
	void test1(){
		System.out.println("�ⲿ���Ա����");
	}
	void test2() {
		// 1������ֲ��ڲ���Inner���ھֲ��ڲ����з����ⲿ������ͷ���
		class Inner {
			int n = 1;
			void show() {
				System.out.println("�ⲿ�����m="+m);
				test1();
			}
		}
		// 2���ڴ����ֲ��ڲ���ķ����У����þֲ��ڲ�������ͷ���
		Inner inner = new Inner();
		System.out.println("�ֲ��ڲ������n="+inner.n);
		inner.show();
	}
}
//���������
public class Example19 {
	public static void main(String[] args) {
		Outer outer= new Outer();
		outer.test2();    // ͨ���ⲿ�������ô����˾ֲ��ڲ���ķ���
	}
}


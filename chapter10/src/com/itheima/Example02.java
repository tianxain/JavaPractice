package com.itheima;
//1������һ��ʵ��Runnable�ӿڵ�ʵ����
class MyThread2 implements Runnable {
	// 1.1����дRunnable�ӿڵ�run()����
	public void run() {
		int i=0;
		while (i++ <5) { 
			System.out.println(Thread.currentThread().getName()
					             +"��run()����������");
		}
	}
}
public class Example02 {
	public static void main(String[] args) {
		// 2������Runnable�ӿ�ʵ�����ʵ������
		MyThread2 myThread2 = new MyThread2();
		// 3��ʹ��Thread(Runnable target, String name)���췽�������̶߳���
		Thread thread1 = new Thread(myThread2,"thread1");
		// 4�������̶߳����start()���������߳�
		thread1.start();
		// ������������һ���߳�thread2
		Thread thread2 = new Thread(myThread2,"thread2");
		thread2.start();
	}
}




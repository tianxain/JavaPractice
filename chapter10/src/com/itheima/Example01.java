package com.itheima;
//1������һ���̳�Thread�߳��������
class MyThread1 extends Thread {
	// �������߳����вι��췽��
	public MyThread1(String name) {
		super(name);
	}
	// 1.1����дThread���run()����
	public void run() {
		int i=0;
		while (i++ <5) { 
			System.out.println(Thread.currentThread().getName()
					             +"��run()����������");
		}
	}
}
public class Example01 {
	public static void main(String[] args) {
		// 2������MyThread1ʵ������
		MyThread1 thread1=new MyThread1("thread1");
		// 2.1������start()���������߳�
		thread1.start();
		// ������������һ���߳�myThread2
		MyThread1 thread2=new MyThread1("thread2"); 
		thread2.start();
	}
}



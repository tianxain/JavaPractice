package com.itheima;
//1、定义一个继承Thread线程类的子类
class MyThread1 extends Thread {
	// 创建子线程类有参构造方法
	public MyThread1(String name) {
		super(name);
	}
	// 1.1、重写Thread类的run()方法
	public void run() {
		int i=0;
		while (i++ <5) { 
			System.out.println(Thread.currentThread().getName()
					             +"的run()方法在运行");
		}
	}
}
public class Example01 {
	public static void main(String[] args) {
		// 2、创建MyThread1实例对象
		MyThread1 thread1=new MyThread1("thread1");
		// 2.1、调用start()方法启动线程
		thread1.start();
		// 创建并启动另一个线程myThread2
		MyThread1 thread2=new MyThread1("thread2"); 
		thread2.start();
	}
}



package com.itheima;
import java.util.concurrent.*;
//1������һ��ʵ��Callable�ӿڵ�ʵ����
class MyThread3 implements Callable<Object> {
	// 1.1����дCallable�ӿڵ�call()����
	public Object call() throws Exception {
		int i = 0;
		while (i++ < 5) {
			System.out.println(Thread.currentThread().getName() 
								+ "��call()����������");
		}
		return i;
	}
}
public class Example03 {
	public static void main(String[] args) throws InterruptedException,
												    ExecutionException {
		// 2������Callable�ӿڵ�ʵ�������
		MyThread3 myThread3 = new MyThread3();
		// 3��ʹ��FutureTask��װCallable�ӿ�
		FutureTask<Object> ft1 = new FutureTask<>(myThread3);
		// 4��ʹ��Thread(Runnable target ,String name)���췽�������̶߳���
		Thread thread1 = new Thread(ft1, "thread1");
		// 5�������̶߳����start()���������߳�
		thread1.start();
		// ������������һ���߳�thread2
		FutureTask<Object> ft2 = new FutureTask<>(myThread3);
		Thread thread2 = new Thread(ft2, "thread2");
		thread2.start();
		// ����ͨ��FutureTask����ķ���������ֵ
		System.out.println("thread1���ؽ��:" + ft1.get());
		System.out.println("thread2���ؽ��:" + ft2.get());
	}
}


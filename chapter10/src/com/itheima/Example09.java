package com.itheima;
//����YieldThread��̳�Thread��
class YieldThread extends Thread {
	// ����һ���вεĹ��췽��
	public YieldThread(String name) {
		super(name); // ���ø���Ĺ��췽��
	}
	public void run() {
		for (int i = 0; i < 5; i++) {
			System.out.println(Thread.currentThread().getName() + "---" + i);
			if (i == 2) {
				System.out.print("�߳��ò�:");
				Thread.yield(); // �߳����е��ˣ������ò�
			}
		}
	}
}
public class Example09 {
	public static void main(String[] args) {
		// ���������߳�
		Thread thread1 = new YieldThread("thread1");
		Thread thread2 = new YieldThread("thread2");
		// ���������߳�
		thread1.start();
		thread2.start();
	}
}

package com.itheima;
class EmergencyThread implements Runnable {
	public void run() {
		for (int i = 1; i < 6; i++) {
			System.out.println(Thread.currentThread().getName()
					+"���룺"+i);
		}
	}
}
public class Example10 {
	public static void main(String[] args) throws InterruptedException {
		// �����߳�
		Thread thread1 = new Thread(new EmergencyThread(),"thread1");
		thread1.start(); // �����߳�
		for (int i = 1; i < 6; i++) {
			System.out.println(Thread.currentThread().getName()
					             +"���룺"+i);
			if (i == 2) {
				thread1.join(); // ����join()����
			}
		}
	}
}





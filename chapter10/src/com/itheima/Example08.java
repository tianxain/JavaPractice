package com.itheima;
public class Example08 {
	public static void main(String[] args) {
		// �ֱ𴴽�����Thread�̶߳���
		Thread thread1 = new Thread(() -> {
			for (int i = 0; i < 10; i++) {
				System.out.println(Thread.currentThread().getName()
						             + "�������i��" + i);
				if(i ==2){
					try {
						// �ڸ��߳�ִ�й����н���˯��״̬���������߳���ִ��
						Thread.sleep(500);
					} catch (InterruptedException e) {
						e.printStackTrace();
					}
				}
			}
		});
		Thread thread2 = new Thread(() -> {
			for (int j = 0; j < 10; j++) {
				System.out.println(Thread.currentThread().getName()
						             + "�������j��" + j);
			}
		});
		// ���������߳� 
		thread1.start();
		thread2.start();
	}
}



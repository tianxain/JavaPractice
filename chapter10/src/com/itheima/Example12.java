package com.itheima;
//����SaleThread2��ʵ��Runnable�ӿ�
class SaleThread2 implements Runnable {
	private int tickets = 10;    // 10��Ʊ
	Object lock = new Object();  // ��������һ����������ͬ����������
	public void run() {
		while (true) {
			synchronized (lock) { // ����ͬ�������
				if (tickets > 0) {
					try {
						Thread.sleep(100); // ģ����Ʊ��ʱ����
					} catch (InterruptedException e) {
						e.printStackTrace();
					}
					System.out.println(Thread.currentThread().getName() 
							+ " ���ڷ��۵� " + tickets-- + " ��Ʊ ");
				}
			}
		}
	}
}
public class Example12 {
	public static void main(String[] args) {
		SaleThread2 saleThread = new SaleThread2();
		// �����������ĸ��̣߳�ģ��4����Ʊ����
		new Thread(saleThread, "����1").start();
		new Thread(saleThread, "����2").start();
		new Thread(saleThread, "����3").start();
		new Thread(saleThread, "����4").start();
	}
}



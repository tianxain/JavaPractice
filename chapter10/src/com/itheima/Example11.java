package com.itheima;
//����SaleThread��ʵ��Runnable�ӿ�
class SaleThread implements Runnable {
	private int tickets = 10; // 10��Ʊ
	public void run() {
		while (true) {
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
public class Example11 {
	public static void main(String[] args) {
		SaleThread saleThread = new SaleThread();
		// �����������ĸ��̣߳�ģ��4����Ʊ����
		new Thread(saleThread, "����1").start();
		new Thread(saleThread, "����2").start();
		new Thread(saleThread, "����3").start();
		new Thread(saleThread, "����4").start();
	}
}



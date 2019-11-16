package com.itheima;
//����SaleThread3��ʵ��Runnable�ӿ�
class SaleThread3 implements Runnable {
	private int tickets = 10;
	public void run() {
		while (true) {
			saleTicket(); // ������Ʊ����
		}
	}
	// ����һ��ͬ������saleTicket()
	private synchronized void saleTicket() {
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
public class Example13 {
	public static void main(String[] args) {
		SaleThread3 saleThread = new SaleThread3(); 
		// �����������ĸ��̣߳�ģ��4����Ʊ����
		new Thread(saleThread, "����1").start();
		new Thread(saleThread, "����2").start();
		new Thread(saleThread, "����3").start();
		new Thread(saleThread, "����4").start();
	}
}



package com.itheima;
// ����һ��ʵ��Runnable�ӿڵ�ʵ����
class TicketWindow2 implements Runnable {
	private int tickets = 100;
	public void run() {
		while (true) {
			if (tickets > 0) {
				System.out.println(Thread.currentThread().getName()
						+ " ���ڷ��۵� " + tickets-- + " ��Ʊ ");
			}
		}
	}
}
public class Example05 {
	public static void main(String[] args) {
		// ����TicketWindowʵ������tw
		TicketWindow2 tw = new TicketWindow2(); 
		// �ֱ𴴽�4���̶߳���ͬʱ�����������������߳�
		new Thread(tw, "����1").start();      
		new Thread(tw, "����2").start();      
		new Thread(tw, "����3").start();     
		new Thread(tw, "����4").start();      
	}
}


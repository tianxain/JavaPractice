package com.itheima;
//1������һ���̳�Thread�߳��������
class TicketWindow extends Thread {
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
public class Example04 {
	public static void main(String[] args) {
		// �ֱ𴴽�4���̶߳���TicketWindow����������ģ��4����Ʊ����
		new TicketWindow().start(); 
		new TicketWindow().start(); 
		new TicketWindow().start(); 
		new TicketWindow().start(); 
	}
}



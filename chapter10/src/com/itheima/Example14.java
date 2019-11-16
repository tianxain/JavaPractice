package com.itheima;
import java.util.concurrent.locks.*;
//����LockThread��ʵ��Runnable�ӿ�
class LockThread implements Runnable {
	private int tickets = 10; // 10��Ʊ
	// ����һ��Lock������
	private final Lock lock = new ReentrantLock();
	public void run() {
		while (true) {
			lock.lock();  // �Դ������м���
			if (tickets > 0) {
				try {
					Thread.sleep(100); // ģ����Ʊ��ʱ����
					System.out.println(Thread.currentThread().getName()
							      + " ���ڷ��۵� " + tickets-- + " ��Ʊ ");
				} catch (InterruptedException e) {
					e.printStackTrace();
				}finally{
					lock.unlock();   // ִ����������ͷ���
				}
			}
		}
	}
}
public class Example14 {
	public static void main(String[] args) {
		LockThread lockThread = new LockThread();
		// �����������ĸ��̣߳�ģ��4����Ʊ����
		new Thread(lockThread, "����1").start();
		new Thread(lockThread, "����2").start();
		new Thread(lockThread, "����3").start();
		new Thread(lockThread, "����4").start();
	}
}



package com.itheima;
class DamonThread implements Runnable {
	public void run() {
		while (true) {
			System.out.println(Thread.currentThread().getName()
					             + "---������");
		}
	}
}
public class Example06 {
	public static void main(String[] args) {
		// �ж��Ƿ�Ϊ��̨�߳�
		System.out.println("main�߳��Ǻ�̨�߳���?"
						   + Thread.currentThread().isDaemon());
		DamonThread dt = new DamonThread(); 
		Thread thread = new Thread(dt, "��̨�߳�"); 
		System.out.println("thread�߳�Ĭ���Ǻ�̨�߳���?" 
                                + thread.isDaemon()); 
		// ���߳�thread�̶߳�������Ϊ��̨�߳�
		thread.setDaemon(true); 
		thread.start(); 
		// ģ�����߳�main��ִ������
		for (int i = 0; i < 5; i++) {
			System.out.println(i);
		}
	}
}



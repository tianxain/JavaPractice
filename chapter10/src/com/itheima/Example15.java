package com.itheima;
class DeadLockThread implements Runnable {
	// ����������ͬ��������
	static Object chopsticks = new Object();
	static Object knifeAndFork = new Object();
	private boolean flag;
	DeadLockThread(boolean flag) {
		this.flag = flag;
	}
	public void run() {
		if (flag) {
			while (true) {
				// chopsticks�������ϵ�ͬ�������
				synchronized (chopsticks) { 
					System.out.println(Thread.currentThread().getName()
							             + "---if---chopsticks");
					// knifeAndFork�������ϵ�ͬ�������
					synchronized (knifeAndFork) { 
					System.out.println(Thread.currentThread().getName()
								        + "---if---knifeAndFork");
					}
				}
			}
		} else {
			while (true) {
				// knifeAndFork�������ϵ�ͬ�������
				synchronized (knifeAndFork) { 
					System.out.println(Thread.currentThread().getName()
							             + "---else---knifeAndFork");
					// chopsticks�������ϵ�ͬ�������
					synchronized (chopsticks) { 
					System.out.println(Thread.currentThread().getName() 
								        + "---else---chopsticks");
					}
				}
			}
		}
	}
}
public class Example15 {
	public static void main(String[] args) {
		// ��������DeadLockThread����
		DeadLockThread thread1 = new DeadLockThread(true);
		DeadLockThread thread2 = new DeadLockThread(false);
		// ���������������߳�
		new Thread(thread1, "Chinese").start();
		new Thread(thread2, "American").start();
	}
}


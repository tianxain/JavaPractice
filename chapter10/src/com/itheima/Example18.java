package com.itheima;
import java.util.concurrent.*;
//1������һ��ʵ��Callable�ӿڵ�ʵ����
class MyThread4 implements Callable<Object> {
	// 1.1����дCallable�ӿڵ�call()����
	public Object call() throws Exception {
		int i = 0;
		while (i++ < 5) {
			System.out.println(Thread.currentThread().getName() 
							    + "��call()����������");
		}
		return i;
	}
}
public class Example18 {
	public static void main(String[] args) throws InterruptedException,
												    ExecutionException {
		// 2������Callable�ӿڵ�ʵ�������
		MyThread4 myThread4 = new MyThread4();
		// 3��ʹ��Executors�߳�ִ�����ഴ������չ���̳߳�
		ExecutorService executor = Executors.newCachedThreadPool();
		// 4����Callable�ӿ�ʵ��������ύ���̳߳ؽ��й���
		Future<Object> result1 = executor.submit(myThread4);
		Future<Object> result2 = executor.submit(myThread4);
		// 5���ر��̳߳�
		executor.shutdown();
		// �����з���ֵ���߳����񣬻�ȡִ�н��
		System.out.println("thread-1���ؽ��:" + result1.get());
		System.out.println("thread-2���ؽ��:" + result2.get());
	}
}


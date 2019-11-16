package com.itheima;
import java.util.concurrent.*;
public class Example19 {
	public static void main(String[] args) throws InterruptedException,
												  ExecutionException {
		// 1��������һ���̣߳�ִ��1��5�������
		CompletableFuture<Integer> completableFuture1 = 
								CompletableFuture.supplyAsync(() -> {
			int sum = 0, i = 0;
			while (i++ < 5) {
				sum += i;
				// ��ʾ�߳�����ִ�й���
				System.out.println(Thread.currentThread().getName() 
						             + "�߳���������ִ��...i:" + i);
			}
			return sum;
		});
		// �����ڶ����̣߳�ִ��6��10�������
		CompletableFuture<Integer> completableFuture2 = 
								CompletableFuture.supplyAsync(() -> {
			int sum = 0, j = 5;
			while (j++ < 10) {
				sum += j;
				System.out.println(Thread.currentThread().getName() 
						             + "�߳���������ִ��...j:" + j);
			}
			return sum;
		});
		// 2���������߳�ִ�н�����л�ȡ����
		CompletableFuture<Integer> completableFuture3 = 
					completableFuture1.thenCombine(completableFuture2,
				(result1, result2) -> result1 + result2);
	     System.out.println("1��10��ӵĽ��Ϊ��"
 							+ completableFuture3.get());
	}
}



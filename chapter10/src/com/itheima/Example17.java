package com.itheima;
import java.util.*;
public class Example17 {
	public static void main(String[] args) {
		// ����һ�������࣬ģ��洢��������Ʒ
		List<Object> goods = new ArrayList<>();
		// ��¼�߳�ִ��ǰͳһ����ʼʱ��start
		long start = System.currentTimeMillis();
		// ����һ���������̣߳�����������Ʒ��������Ʒ����
		Thread thread1 = new Thread(() -> {
			int num = 0;
			while (System.currentTimeMillis()-start<=100) {
				// ʹ��synchronized�ؼ���ͬ����Ʒ����������
				synchronized (goods) {
					// ����Ʒ���������߽���ȴ�״̬
					if(goods.size() >0){
						try {
							goods.wait();
						} catch (InterruptedException e) {
							e.printStackTrace();
						}
					}else{
						// �����߼���������Ʒ
						goods.add("��Ʒ" + ++num);
						System.out.println("������Ʒ" + num);
					}
				}
			}
		}, "������");
		// ����һ�������̣߳�����������Ʒ������Ʒ�Ӽ���ɾ��
		Thread thread2 = new Thread(() -> {
			int num = 0;
			while (System.currentTimeMillis()-start<=100) {
				// ʹ��synchronized�ؼ���ͬ����Ʒ���Ѻ�����
				synchronized (goods) {
					// ��Ʒ����ͻ��������߽�������
					if(goods.size()<= 0){
						goods.notify();
					}else{
						// ����������Ʒ
						goods.remove("��Ʒ" + ++num);
						System.out.println("������Ʒ" + num);
					}
				}
			}
		}, "������");
		// ͬʱ���������ߺ������������̣߳���ͳһִ��100�����ʱ��
		thread1.start();
		thread2.start();
	}
}

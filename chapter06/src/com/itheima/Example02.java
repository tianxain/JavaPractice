package com.itheima;
import java.util.LinkedList;
public class Example02 {
	public static void main(String[] args) {
		LinkedList link = new LinkedList();  // ����LinkedList����
		// 1�����Ԫ��
		link.add("stu1");
		link.add("stu2");
         System.out.println(link); // ��������е�Ԫ��
		link.offer("offer");       // �򼯺�β��׷��Ԫ��
		link.push("push");         // �򼯺�ͷ�����Ԫ��
		System.out.println(link);  // ��������е�Ԫ��
		// 2����ȡԪ��
        Object object = link.peek();//��ȡ���ϵ�һ��Ԫ��
		System.out.println(object); // ��������е�Ԫ��
		// 3��ɾ��Ԫ��
		link.removeFirst();        // ɾ�����ϵ�һ��Ԫ��
		link.pollLast();           // ɾ���������һ��Ԫ��
		System.out.println(link);
	}
}


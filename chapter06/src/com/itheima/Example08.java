package com.itheima;
import java.util.ArrayList;
import java.util.Iterator;
public class Example08 {
	public static void main(String[] args) {
		ArrayList list = new ArrayList();
		list.add("data_1");
		list.add("data_2");
		list.add("data_3");
		System.out.println(list);
		// ������ת��ΪIterator����������
		Iterator it = list.iterator();
		// ʹ��JDK 8������forEachRemaining(Consumer action)����������������
	    it.forEachRemaining(obj -> System.out.println("��������Ԫ�أ�"+obj));
	}
}

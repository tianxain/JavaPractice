package com.itheima;
import java.util.ArrayList;
public class Example07 {
	public static void main(String[] args) {
		ArrayList list = new ArrayList();
		list.add("data_1");
		list.add("data_2");
		list.add("data_3");
		System.out.println(list);
		// ʹ��JDK 8������forEach(Consumer action)������������
		list.forEach(obj -> System.out.println("��������Ԫ�أ�"+obj));
	}
}

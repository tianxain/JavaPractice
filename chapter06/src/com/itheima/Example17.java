package com.itheima;
import java.util.*;
public class Example17 {
	public static void main(String[] args) {
		Map map = new HashMap(); // ����Map����
		map.put("1", "Jack");    // �洢Ԫ��
		map.put("2", "Rose");
		map.put("3", "Lucy");
		System.out.println(map);
		Collection values = map.values(); // ��ȡMap������valueֵ���϶���
		// ����Map��������ֵ����V
		values.forEach(v -> System.out.println(v));
	}
}


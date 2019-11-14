package com.itheima;
import java.util.*;
class CustomComparator implements Comparator { // �Զ���Ƚ���
	public int compare(Object obj1, Object obj2) {
		String key1 = (String) obj1;   // ��Object���͵Ĳ���ǿתΪString����
		String key2 = (String) obj2;
		return key2.compareTo(key1);   // ���Ƚ�֮���ֵ����
	}
}
public class Example20 {
	public static void main(String[] args) {
		Map map = new TreeMap(new CustomComparator()); // ����TreeMap����
		map.put("2", "Rose");
		map.put("1", "Jack");
		map.put("3", "Lucy");
		System.out.println(map);
	}
}

package com.itheima;
import java.util.Comparator;
import java.util.TreeSet;
// ����Ƚ���ʵ��Comparator�ӿ�
class MyComparator implements Comparator {  
	public int compare(Object obj1, Object obj2) {  // ��������ʽ
		String s1 = (String) obj1;
		String s2 = (String) obj2;
		int temp = s1.length() - s2.length();
		return temp;
	}
}
public class Example13 {
	public static void main(String[] args) {
		// 1����������ʱ������Comparator�ӿ�ʵ�ֶ����������
		TreeSet ts = new TreeSet(new MyComparator());
		ts.add("Jack");
		ts.add("Helena");
		ts.add("Eve");
		System.out.println(ts);
		// 2����������ʱ��ʹ��Lambda���ʽ�����������
		TreeSet ts2 = new TreeSet((obj1, obj2) -> {
			String s1 = (String) obj1;
			String s2 = (String) obj2;
			return s1.length() - s2.length();
		});
		ts2.add("Jack");
		ts2.add("Helena");
		ts2.add("Eve");
		System.out.println(ts2);
	}
}



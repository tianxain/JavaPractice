package com.itheima;
import java.util.HashSet;
public class Example09 {
	public static void main(String[] args) {
		HashSet set = new HashSet();     // ����HashSet����
		set.add("Jack");                 // ���Set���������Ԫ��
		set.add("Eve");
		set.add("Rose");
		set.add("Rose");                // ���Set����������ظ�Ԫ�� 
		// �������Set�����е�Ԫ��
		set.forEach(o -> System.out.println(o));
	}
}

package com.itheima;
import java.util.HashMap;
import java.util.Map;
public class Example14 {
	public static void main(String[] args) {
		// ����HashMap����
        Map map = new HashMap();  
		// 1����Map�洢��ֵ��Ԫ��
		map.put("1", "Jack");        
		map.put("2", "Rose");
		map.put("3", "Lucy");
		map.put("4", "Lucy");
		map.put("1", "Tom");
		System.out.println(map);
		// 2���鿴�������Ƿ����
		System.out.println(map.containsKey("1"));
		// 3����ȡָ��������ӳ���ֵ
		System.out.println(map.get("1")); 
		// 4����ȡ�����еļ������ֵ���󼯺�
		System.out.println(map.keySet()); 
		System.out.println(map.values());
		// 5���滻ָ��������ӳ���ֵ
		map.replace("1", "Tom2");
		System.out.println(map);
		// 6��ɾ��ָ��������ӳ��ļ�ֵ��Ԫ��
		map.remove("1");
		System.out.println(map);
	}
}


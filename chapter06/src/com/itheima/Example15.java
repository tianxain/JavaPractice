package com.itheima;
import java.util.*;
public class Example15 {
	public static void main(String[] args) {
		Map map = new HashMap();            // ����Map����
		map.put("1", "Jack");               // �洢Ԫ��
		map.put("2", "Rose");
		map.put("3", "Lucy");
		System.out.println(map);
		// 1��ʹ��keySet()����
//		Set keySet = map.keySet();         // ��ȡ���ļ���
//		Iterator it = keySet.iterator();   // �������ļ���
//		while (it.hasNext()) {
//			Object key = it.next();
//			Object value = map.get(key);   // ��ȡÿ��������Ӧ��ֵ
//			System.out.println(key + ":" + value);
//		}
		// 2��ʹ��entrySet()����
		Set entrySet = map.entrySet();
		Iterator it = entrySet.iterator();            // ��ȡIterator����
		while (it.hasNext()) {
              // ��ȡ�����м�ֵ��ӳ���ϵ
			Map.Entry entry = (Map.Entry) (it.next());
			Object key = entry.getKey();              // ��ȡEntry�еļ�
			Object value = entry.getValue();          // ��ȡEntry�е�ֵ
			System.out.println(key + ":" + value);
		}

	}
}

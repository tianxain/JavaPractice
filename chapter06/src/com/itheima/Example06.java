package com.itheima;
import java.util.ArrayList;
import java.util.Iterator;
public class Example06 {
	public static void main(String[] args) {
	ArrayList list = new ArrayList();   //����ArrayList����
		list.add("Jack");
		list.add("Annie");
		list.add("Rose");
		list.add("Tom");
		Iterator it = list.iterator();  // ���Iterator����
		while (it.hasNext()) {          // �жϸü����Ƿ�����һ��Ԫ��
			Object obj = it.next();     // ��ȡ�ü����е�Ԫ��
			if ("Annie".equals(obj)) {  // �жϸü����е�Ԫ���Ƿ�ΪAnnie
				list.remove(obj);       // ɾ���ü����е�Ԫ��
//				it.remove();
			}
		}
         System.out.println(list);
	}
}

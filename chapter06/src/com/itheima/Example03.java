package com.itheima;
import java.util.ArrayList;
import java.util.Iterator;
public class Example03 {
	public static void main(String[] args) {
        // ����ArrayList����
		ArrayList list = new ArrayList();   
        // ��ü���������ַ���
		list.add("data_1");                    
		list.add("data_2");
		list.add("data_3");
     	// ��ȡIterator����
		Iterator iterator = list.iterator(); 
    	// �жϼ������Ƿ������һ��Ԫ��
		while (iterator.hasNext()) {         
			Object obj = iterator.next();   // ȡ��ArrayList�����е�Ԫ��
			System.out.println(obj);
		}
	}
}



package com.itheima;
import java.util.ArrayList;
public class Example04 {
	public static void main(String[] args) {
		ArrayList list = new ArrayList(); // ����ArrayList����
		list.add("data_1");				  // ��ArrayList����������ַ���Ԫ��
		list.add("data_2");
		list.add("data_3");		
		for (Object obj : list) {		  // ʹ��foreachѭ������ArrayList����
			System.out.println(obj);	  // ȡ������ӡArrayList�����е�Ԫ��
		}
	}
}

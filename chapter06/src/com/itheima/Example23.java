package com.itheima;
import java.util.ArrayList;
public class Example23 {
	public static void main(String[] args) {
//		ArrayList list = new ArrayList();	 // ����ArrayList����
		ArrayList<String> list = new ArrayList<String>();// �������϶���ָ������ΪString
		list.add("String");					// ����ַ�������
		list.add("Collection");				
		list.add(1);						// ���Integer����
		for (Object obj : list) {			// ��������
			String str = (String) obj;		// ǿ��ת����String����
			System.out.println(str);
		}
	}
}


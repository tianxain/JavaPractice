package com.itheima;
import java.util.ArrayList;
import java.util.Collections;
public class Example26 {
	public static void main(String[] args) {
		ArrayList<Integer> list = new ArrayList<>();
		Collections.addAll(list, -3,2,9,5,8);  // �򼯺����������ָ��Ԫ��
		System.out.println("�����е�Ԫ��: " + list);
		System.out.println("�����е����Ԫ��: " + Collections.max(list));
		System.out.println("�����е���СԪ��: " + Collections.min(list));
		Collections.replaceAll(list, 8, 0);   // �������е�8��0�滻��
		System.out.println("�滻��ļ���: " + list);
		Collections.sort(list);               //ʹ�ö��ֲ���ǰ�����뱣֤Ԫ������
		System.out.println("���������Ϊ�� "+list);
		int index = Collections.binarySearch(list, 9);
		System.out.println("����ͨ�����ֲ��ҷ�������Ԫ��9���ڽǱ�Ϊ��"+index);
	}
}


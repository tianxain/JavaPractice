package com.itheima;
import java.util.*;
public class Example22 {
	public static void main(String[] args) {
		// ��ȡ��ʾ��ǰʱ���Calendar����
		Calendar calendar = Calendar.getInstance();
		// ����ָ������,��MONTH��Ϊ13
		calendar.set(Calendar.MONTH, 13);
		System.out.println(calendar.getTime());
		// ����non-lenientģʽ
		calendar.setLenient(false);
		calendar.set(Calendar.MONTH, 13);
		System.out.println(calendar.getTime());
	}
}


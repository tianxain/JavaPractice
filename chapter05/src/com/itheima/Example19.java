package com.itheima;
import java.util.*;
public class Example19 {
	public static void main(String[] args) {
		// ������ʾ��ǰʱ���Date����
		Date date1 = new Date();
		// ��ȡ��ǰʱ���1���ʱ��
		Date date2 = new Date(System.currentTimeMillis() + 1000);
		System.out.println(date1);
		System.out.println(date2);
	}
}


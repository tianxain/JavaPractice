package com.itheima;
import java.text.*;
import java.util.*;
public class Example26 {
	public static void main(String[] args) throws Exception {
		// ����һ��SimpleDateFormat����
		SimpleDateFormat sdf = new SimpleDateFormat(
							"Gyyyy��MM��dd�գ�������yyyy��ĵ�D�죬E"); 
		// ��SimpleDateFormat���������ģ���ʽ��Date����
		System.out.println(sdf.format(new Date()));
	}
}



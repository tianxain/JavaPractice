package com.itheima;
import java.util.*;
public class Example09 {
    public static void main(String[] args) {
		// ��ȡ��ǰϵͳ����
		Properties properties = System.getProperties();
		System.out.println(properties);
		// ��ȡ����ϵͳ���Ե�key����������������Set����
		Set<String> propertyNames = properties.stringPropertyNames();
		for (String key : propertyNames ) {
			//��ȡ��ǰ��key��������������Ӧ��ֵ������ֵ��
			String value = System.getProperty(key);
			System.out.println(key +"--->"+ value);
		}
	}
}



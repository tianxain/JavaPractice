package com.itheima;
public class Example03 {
	public static void main(String[] args) {
		String str = "java"; 
		char[] charArray = str.toCharArray(); // �ַ���ת��Ϊ�ַ�����
         System.out.print("���ַ���תΪ�ַ������ı������:");
		for (int i = 0; i < charArray.length; i++) {
			if (i != charArray.length - 1) {
				// ���������������һ��Ԫ��,��Ԫ�غ���Ӷ���
				System.out.print(charArray[i] + ",");
			} else {
				// ��������һ��Ԫ�غ��治�Ӷ���
				System.out.println(charArray[i]);
			}
		}
		System.out.println("��intֵת��ΪString����֮��Ľ��:"  
                                + String.valueOf(12));
		System.out.println("���ַ���ת���ɴ�д֮��Ľ��:"  
                                + str.toUpperCase());
	}
}



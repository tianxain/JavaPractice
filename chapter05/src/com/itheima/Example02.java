package com.itheima;
public class Example02 {
	public static void main(String[] args) {
		String s = "abcabcbacdba"; // ��ʼ���ַ���
		System.out.println("�ַ����ĳ���Ϊ��" + s.length());
		System.out.println("�ַ����е�һ���ַ�:" + s.charAt(0));
		System.out.println("�ַ�c��һ�γ��ֵ�λ��:" + s.indexOf('c'));
		System.out.println("�ַ�c���һ�γ��ֵ�λ��:" + s.lastIndexOf('c'));
		System.out.println("���ַ�����һ�γ��ֵ�λ�ã�" + s.indexOf("ab"));
		System.out.println("���ַ������һ�γ��ֵ�λ�ã�" 
                                                    + s.lastIndexOf("ab"));
 	}
}


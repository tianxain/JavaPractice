package com.itheima;
public class Example04 {
	public static void main(String[] args) {
		String s = "     http :// localhost : 8080     ";
		// �ַ���ȥ���ո����
		System.out.println("ȥ���ַ������˿ո��Ľ��:" + s.trim());
		// �ַ����滻����
		System.out.println("ȥ���ַ��������пո��Ľ��:" 
		                      + s.replace(" ", ""));
	}
}



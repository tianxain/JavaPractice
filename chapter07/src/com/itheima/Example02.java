package com.itheima;
import java.io.*;
public class Example02 {
	public static void main(String[] args) throws Exception {
		// �����ļ���������󣬲�ָ������ļ�����
		FileOutputStream out = new FileOutputStream("out.txt");
		// ����һ���ַ���
		String str = "hello";
		// ���ַ���ת��Ϊ�ֽ��������д�����
		out.write(str.getBytes());
		// �ر���
	    out.close();
	}
}


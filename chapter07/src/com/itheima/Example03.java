package com.itheima;
import java.io.*;
public class Example03 {
	public static void main(String[] args) throws Exception {
		// �����ļ���������󣬲�ָ������ļ�����
		FileOutputStream out = new FileOutputStream("out.txt",true);
		// ����һ���ַ���
		String str = " world";
		// ���ַ���ת��Ϊ�ֽ��������д�����
		out.write(str.getBytes());
		// �ر���
	    out.close();
	}
}

package com.itheima;
import java.io.*;
public class Example07 {
	public static void main(String[] args) throws Exception {
         // ����FileReader���󣬲�ָ����Ҫ��ȡ���ļ�
		FileReader fileReader = new FileReader("reader.txt");
		// ����һ��int���͵ı���len�����ʼ��ֵΪ0
		int len = 0;
		// ͨ��ѭ�����ж��Ƿ��ȡ�����ļ�ĩβ
		while ((len = fileReader.read()) != -1) {
			// �����ȡ�����ַ�
			System.out.print((char)len);
		}
		// �ر���
		fileReader.close();
	}
}

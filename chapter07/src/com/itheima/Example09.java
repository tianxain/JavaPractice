package com.itheima;
import java.io.*;
public class Example09 {
	public static void main(String[] args) throws Exception {
        // ����FileReader���󣬲�ָ����Ҫ��ȡ���ļ�
		FileReader fileReader = new FileReader("reader.txt");
		// ����FileWriter���󣬲�ָ��д�����ݵ�Ŀ���ļ�
		FileWriter fileWriter = new FileWriter("writer.txt");
		// ����һ��int���͵ı���len�����ʼ��ֵΪ0
		int len = 0;
		// ����һ������Ϊ1024���ַ�����
		char[] buff = new char[1024];
		// ͨ��ѭ�����ж��Ƿ��ȡ�����ļ�ĩβ
		while ((len = fileReader.read(buff)) != -1) {
			// �����ȡ�����ַ�
			fileWriter.write(buff, 0, len);
		}
		// �ر���
		fileReader.close();
		fileWriter.close();
	}
}



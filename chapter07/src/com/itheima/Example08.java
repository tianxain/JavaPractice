package com.itheima;
import java.io.*;
public class Example08 {
	public static void main(String[] args) throws Exception {
		// �����ַ���������󣬲�ָ������ļ�
		FileWriter fileWriter = new FileWriter("writer.txt");
		// ��������ַ�д���ļ�
		fileWriter.write("����������ˣ�\r\n");
		fileWriter.write("���������������\r\n");
		fileWriter.write("����������֣�\r\n");
		fileWriter.write("����������Ʋʡ�\r\n");
		// �ر���
		fileWriter.close();
	}
}

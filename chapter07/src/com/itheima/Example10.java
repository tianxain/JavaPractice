package com.itheima;
import java.io.*;
public class Example10 {
	public static void main(String[] args) throws Exception {
		// ����һ���ַ����뻺��������
		BufferedReader br = new BufferedReader(
							new FileReader("reader.txt "));
		// ����һ���ַ��������������
		BufferedWriter bw = new BufferedWriter(
							new FileWriter("writer.txt"));
		// ����һ���ַ�������str
		String str =null;
		// ѭ��ʱÿ�ζ�ȡһ���ı��������Ϊnull���������ļ�ĩβ���������ѭ��
		while ((str = br.readLine()) != null) {
			// ͨ������������д���ļ�
			bw.write(str);
			// д��һ�����з����÷�������ݲ�ͬ�Ĳ���ϵͳ������Ӧ�Ļ��з�
			bw.newLine();
		}
		// �ر���
		br.close();
		bw.close();
	}
}

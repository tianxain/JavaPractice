package com.itheima;
import java.io.*;
public class Example01 {
	public static void main(String[] args) throws Exception {
		// ����һ���ļ��ֽ�����������ȡ�ļ�
		FileInputStream in = new FileInputStream("test.txt");
		// ����һ��int���͵ı���b
		int b = 0;
		// ͨ��ѭ������ȡ�ļ���������ֵΪ-1����ѭ��
		while((b=in.read()) != -1){
			System.out.println(b); 
		}
		// �ر���
		in.close();
	}
}


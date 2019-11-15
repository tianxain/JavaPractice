package com.itheima;
import java.io.*;
public class Example04 {
	public static void main(String[] args) throws Exception {
		// �����ļ������������ȡָ��Ŀ¼�µ��ļ�
		FileInputStream in = new FileInputStream("source/src.jpg");
		// �����ļ���������󽫶�ȡ�����ļ�����д�뵽ָ��Ŀ¼���ļ���
		FileOutputStream out = new FileOutputStream("target/dest.jpg");
		// ����һ��int���͵ı���len
		int len = 0;
		// ��ȡ�����ļ�ǰ��ϵͳʱ��
		long beginTime = System.currentTimeMillis();
		// ͨ��ѭ������ȡ�����ļ��ֽ���Ϣд�뵽���ļ�
		while ((len = in.read()) != -1) {			
			out.write(len);
		}
		// ��ȡ����֮���ϵͳʱ��
		long endTime = System.currentTimeMillis();
		// �����������ʱ��
		System.out.println("����ʱ��Ϊ��"+(endTime-beginTime) +"����");
		// �ر���
		in.close();
		out.close();
	}
}




package com.itheima;
import java.io.*;
public class Example05 {
	public static void main(String[] args) throws Exception {
		// �����ļ������������ȡָ��Ŀ¼�µ��ļ�
		FileInputStream in = new FileInputStream("source/src.jpg");
		// �����ļ���������󽫶�ȡ�����ļ�����д�뵽ָ��Ŀ¼���ļ���
		FileOutputStream out = new FileOutputStream("target/dest.jpg");
		// ����һ��int���͵ı���len
		int len = 0;
		// ����һ������Ϊ1024���ֽ�����
		byte[] buff = new byte[1024];
		// ��ȡ�����ļ�ǰ��ϵͳʱ��
		long beginTime = System.currentTimeMillis();
		// ͨ��ѭ������ȡ�����ļ��ֽ���Ϣд�뵽���ļ�
		while ((len = in.read(buff)) != -1) {
			// ÿѭ����ȡһ���ֽ����飬�ͽ�����ȡ��������д�뵽�ļ�
			out.write(buff,0,len);
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



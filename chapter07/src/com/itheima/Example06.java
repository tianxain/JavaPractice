package com.itheima;
import java.io.*;
public class Example06 {
	public static void main(String[] args) throws Exception {
		// �������������������ֽڻ���������
		BufferedInputStream bis = new BufferedInputStream(
				new FileInputStream("source/src.jpg"));
		BufferedOutputStream bos = new BufferedOutputStream(
				new FileOutputStream("target/dest.jpg"));
		// ����һ��int���͵ı���len
		int len = 0;
		// ��ȡ�����ļ�ǰ��ϵͳʱ��
		long beginTime = System.currentTimeMillis();
		// ͨ��ѭ����ȡ�����ֽڻ������е����ݣ���ͨ������ֽڻ�����д�뵽���ļ�
		while ((bis.read()) != -1) {
			bos.write(len);
		}
		// ��ȡ����֮���ϵͳʱ��
		long endTime = System.currentTimeMillis();
		// �����������ʱ��
		System.out.println("����ʱ��Ϊ��"+(endTime-beginTime) +"����");
		// �ر���
		bis.close();
		bos.close();
	}
}

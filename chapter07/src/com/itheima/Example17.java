package com.itheima;
import java.io.*;
public class Example17 {
	public static void main(String[] args) throws Exception{
        // ����RandomAccessFile���󣬲���ֻ��ģʽ��time.txt�ļ�
		RandomAccessFile raf = new RandomAccessFile("time.txt", "rw");
		// ��ȡ������ʹ�ô�������һ�ζ�ȡʱtimesΪ5
		int times = Integer.parseInt(raf.readLine())-1;
		// �ж�ʣ�����
		if(times > 0){
			// ÿִ��һ�δ���ʹ��һ�Σ������ͼ���һ��
			System.out.println("������������"+ times+"�Σ�");
			// ����¼ָ������ָ���ļ���ͷ
			raf.seek(0);
			// ��ʣ������ٴ�д���ļ�
			raf.write((times+"").getBytes());
		}else{
			System.out.println("���ô����Ѿ����꣡");
		}
		// �ر���������ȡ�ļ������ͷ��κ�ϵͳ
		raf.close();
	}
}

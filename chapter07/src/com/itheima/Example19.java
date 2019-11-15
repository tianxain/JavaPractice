package com.itheima;
import java.io.*;
import java.nio.channels.*;
public class Example19 {
	public static void main(String[] args) throws Exception {
		// ����RandomAccessFile����ָ��Դ�ļ�
		RandomAccessFile infile = 
						new RandomAccessFile("source/src.jpg","rw");
		// ��ȡ��ȡԴ�ļ�FileChannelͨ��
		FileChannel inChannel = infile.getChannel();
		// ����RandomAccessFile����ָ��Ŀ���ļ�
		RandomAccessFile outfile = 
						new RandomAccessFile("target/dest.jpg","rw");
		// ��ȡ����Ŀ���ļ�FileChannelͨ��
		FileChannel outChannel = outfile.getChannel();
		// ʹ��transferTo()�����������帴��
		long transferTo = inChannel.transferTo(0, inChannel.size(),
												outChannel);
		if(transferTo>0){
			System.out.println("���Ƴɹ�!");
		}
		// �ر���Դ
		infile.close();
		inChannel.close();
		outfile.close();
		outChannel.close();
	}
}


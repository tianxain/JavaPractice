package com.itheima;
import java.io.*;
public class Example15 {
	public static void main(String[] args){
		// ����File���󣬲�ָ���ļ�·��
		File file = new File("F:\\Java��������\\workspace\\chapter07");
		// ����fileDir()����,����Ŀ¼
		fileDir(file);
	}
    // ����Ŀ¼������Ŀ¼
	public static void fileDir(File file) {
		// ���Ŀ¼�������ļ�,����������
		File[] listFiles = file.listFiles();
		// ѭ����������
		for (File files : listFiles) {
			// �����������Ŀ¼����ݹ����fileDir()����
			if(files.isDirectory()){
				fileDir(files);
			}
			// ����ļ�·��
			System.out.println(files);
		}
	}
}

package com.itheima;
import java.io.*;
public class Example16 {
	public static void main(String[] args){
		// ����File���󣬲�ָ���ļ�·��
		File files = new File("D:\\test\\�½��ļ���");
         // ����ɾ������
		deleteDir(files);
	}
	//ɾ������
	public static void deleteDir(File files) {
		// ��ȡFile�����е������ļ������������������
		File[] listFiles = files.listFiles();
		// ѭ����������
		for (File file : listFiles) {
			// �����Ŀ¼�ļ�����ݹ����ɾ������
			if(file.isDirectory()){
				deleteDir(file);
			} 
			// ������ļ�����ֱ��ɾ��
			file.delete();
		}
        // ɾ���ļ����������ļ�����ɾ���ļ���
		files.delete();
	}
}


package com.itheima;
import java.io.*;
import java.util.Arrays;
public class Example14 {
	public static void main(String[] args){
		// ����File���󣬲�ָ���ļ�·��
		File file = new File("F:\\Java��������\\workspace\\chapter07");
		// �ж��Ƿ���Ŀ¼
		if (file.isDirectory()) {
			// ʹ��Lambda���ʽ����Ŀ¼��������.txt��β���ļ�������
			String[] fileNames = file.list(
								(dir,name) -> name.endsWith(".txt"));
			// ��ָ��·���µ��ļ���Ŀ¼���б���
			Arrays.stream(fileNames)
				  .forEach(f -> System.out.println(f));
		}
	}
}


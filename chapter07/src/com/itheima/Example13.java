package com.itheima;
import java.io.File;
import java.util.Arrays;
public class Example13 {
	public static void main(String[] args) {
		// ����File���󣬲�ָ���ļ�·��
		File file = new File("F:\\Java��������\\workspace\\chapter07");
		// �ж��Ƿ���Ŀ¼
		if (file.isDirectory()) {
			// ��ȡĿ¼�е������ļ�������
			String[] fileNames = file.list();
			// ��ָ��·���µ��ļ���Ŀ¼���б���
			Arrays.stream(fileNames)
				  .forEach(f -> System.out.println(f));
		}
	}
}

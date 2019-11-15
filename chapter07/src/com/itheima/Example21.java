package com.itheima;
import java.io.*;
import java.nio.file.*;
import java.util.*;
public class Example21 {
	public static void main(String[] args) throws IOException {
		// ����һ��Ŀ¼·����Path����
		Path directoryPath = Paths.get("D:/test/sample");  
		// ����Path���󴴽��༶Ŀ¼
		Files.createDirectories(directoryPath);  
		System.out.println("Ŀ¼�����ɹ�!");  
		// ����һ���ļ�·����Path����
		Path filePath = Paths.get("D:/test/sample/test.txt");
		// ����Path���󴴽�һ���ļ�
		Files.createFile(filePath);
		// ����һ��List���ϣ����򼯺����������
		List<String> list = new ArrayList<String>();
		list.add("����һ�������ļ�");
		// �������е�����׷��д�뵽ָ�����ļ���
		Files.write(filePath, list, StandardOpenOption.APPEND);
		List<String> lines = Files.readAllLines(filePath);
		System.out.println("�ļ��Ĵ�СΪ��" + Files.size(filePath));
		System.out.println("�ļ��е�����Ϊ��" + lines);
	}
}


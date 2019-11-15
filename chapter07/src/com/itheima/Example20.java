package com.itheima;
import java.nio.file.Path;
import java.nio.file.Paths;
public class Example20 {
	public static void main(String[] args) {
		// ʹ��Paths��get()��������Path����
		Path path = Paths.get("D:\\test\\�ļ���\\test.txt");
		// ���Path�����е���Ϣ
		System.out.println("path�ĸ�·����" + path.getRoot());
		System.out.println("path�ĸ�·����" + path.getParent());
		System.out.println("path�е�·����������" + path.getNameCount());
		// ѭ�����·������
		for (int i = 0; i < path.getNameCount(); i++) {
			// ��ȡָ����������·������
            Path name = path.getName(i);
            System.out.println("����Ϊ" + i + " ��·��������Ϊ�� " + name);
        }
		System.out.println("path��URI·��Ϊ��" + path.toUri());
		System.out.println("path�ľ���·����" + path.toAbsolutePath());
	}
}


package com.itheima;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.util.Properties;
public class Example22 {
   public static void main(String[] args) throws Exception {
	    // 1��ͨ��Properties���������ļ���ȡ����
		Properties pps = new Properties();
		// ����Ҫ��ȡ���ļ�test.properties
		pps.load(new FileInputStream("test.properties"));
		// ����test.properties��ֵ��Ԫ����Ϣ
		pps.forEach((k, v) -> System.out.println(k + "=" + v));
		// 2��ͨ��Properties���������ļ�д�����
		// ָ��Ҫд��������ļ����ƺ�λ��
		FileOutputStream out = new FileOutputStream("test.properties");
		// ��Properties���ļ�����д���ֵ����Ϣ
		pps.setProperty("charset", "UTF-8");
		// ���� Properties������������ֵ����Ϣд�������ļ�
		pps.store(out, "����charset����");
	}
}

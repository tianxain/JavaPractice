package com.itheima;
import java.io.*;
public class Example11 {
	public static void main(String[] args) throws Exception {
        // 1�������ֽ����������󣬻�ȡԴ�ļ�
		FileInputStream in = new FileInputStream("reader.txt");
		// ���ֽ�����������ת�����ַ�����������
		InputStreamReader isr = new InputStreamReader(in);
		// �����ַ����뻺��������
		BufferedReader br = new BufferedReader(isr); 
		// 2�������ֽ����������ָ��Ŀ���ļ�
		FileOutputStream out = new FileOutputStream("writer.txt");
		// ���ֽ����������ת�����ַ����������
		OutputStreamWriter osw = new OutputStreamWriter(out);
		// �����ַ��������������
		BufferedWriter bw = new BufferedWriter(osw); 
		// ����һ���ַ�������
		String line = null;
		// ͨ��ѭ���ж��Ƿ�����ļ�ĩβ
		while ((line = br.readLine()) != null) {
			// �����ȡ�����ļ�
			bw.write(line); 
			bw.newLine();
		}
		// �ر���
		br.close();
		bw.close();
	}
}

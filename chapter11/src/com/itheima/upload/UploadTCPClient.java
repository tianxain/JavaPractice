package com.itheima.upload;
import java.io.*;
import java.net.*;
// TCP����ͨ�ſͻ���
public class UploadTCPClient {
	public static void main(String[] args) throws Exception {
		// ����һ��Socket�����ӵ�ָ���ķ�������
		Socket client = new Socket(InetAddress.getLocalHost(),10001);
		// 1���ͻ�������������ϴ��ļ�
		OutputStream out = client.getOutputStream();
		FileInputStream fis = new FileInputStream("D:\\1.jpg");
		byte[] buf = new byte[1024]; 
		int len= 0; 
		System.out.println("���ӵ��������ˣ���ʼ�ļ��ϴ���");
		while ((len = fis.read(buf)) != -1) { 
			out.write(buf, 0, len);
		}
		// ����ͼƬ�ϴ���ɺ�Ҫ��ʱ�رտͻ��������
		client.shutdownOutput(); 
		// 2���ͻ��˽��շ������˵���Ӧ��Ϣ
		InputStream is = client.getInputStream();           
		byte[] bufMsg= new byte[1024];                      
		int len2 = is.read(bufMsg);
		while (len2 != -1){
			System.out.println(new String(bufMsg, 0, len2)); 
			len2 = is.read(bufMsg);
		}
		// �ر�����Socket����
		out.close();
		is.close();
		fis.close();                                             
		client.close();                                           
	}
}


package com.itheima;
import java.io.*;
import java.net.*;
// TCP�ͻ���
public class TCPClient {
	public static void main(String[] args) throws Exception {
		// ����һ��Socket�����ӵ�ָ���ķ�������
		Socket client = new Socket(InetAddress.getLocalHost(),7788);
		// ��ȡ����˷��ص����������ݲ���ӡ
		InputStream is = client.getInputStream(); 
		byte[] buf = new byte[1024]; 
		int len = is.read(buf);
		while (len != -1){
			System.out.println(new String(buf, 0, len)); 
			len = is.read(buf);
		}
		// �ر�����Socket����
		is.close();
		client.close(); // �ر�Socket����,�ͷ���Դ
	}
}

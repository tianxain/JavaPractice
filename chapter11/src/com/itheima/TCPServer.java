package com.itheima;
import java.io.*;
import java.net.*;
// TCP�����
public class TCPServer {
	public static void main(String[] args) throws Exception {
		// ����ָ���˿ں�Ϊ7788�ķ����ServerSocket����
		ServerSocket serverSocket = new ServerSocket(7788); 
		while (true){
			// ����ServerSocket��accept()������ʼ��������
			Socket client = serverSocket.accept(); 
			System.out.println("��ͻ������ӳɹ�����ʼ�������ݽ�����");
			// ��ȡ�ͻ��˵����������
			OutputStream os = client.getOutputStream();
			// ���ͻ������ӵ������ʱ����ͻ����������
			os.write(("����������ͻ���������Ӧ��").getBytes()); 
			// ģ����ͻ��˽�����ʱ
			Thread.sleep(5000);
			// �ر�����Socket����
			os.close();
			client.close();
		}
	}
}

package com.itheima;
import java.io.*;
import java.net.*;
// TCP�����
public class ThreadTCPServer {
	public static void main(String[] args) throws Exception {
		// ����һ��ָ���˿ں�Ϊ7788�ķ�������ServerSocket����
		ServerSocket serverSocket = new ServerSocket(7788);
		// ʹ��whileѭ����ͣ�Ľ��տͻ��˷��͵�����
		while (true) {
			// ����ServerSocket��accept()������ͻ��˽�������
			Socket client = serverSocket.accept();
			// ���ÿһ���ͻ������󴴽�һ���߳̽������ӹ���
			Thread thread = new Thread(() -> {
				try {
					// ��ȡ��ǰ���ӵĿͻ������ڶ˿ں�
					int port =client.getPort();
					System.out.println("��˿ں�Ϊ"+port+"�Ŀͻ������ӳɹ���");
					OutputStream os = client.getOutputStream();
					os.write(("����������ͻ���������Ӧ��").getBytes());
					Thread.sleep(5000); 
					System.out.println("������ͻ������ݽ���");
					// �ر�����Socket����
					os.close(); 
					client.close(); 
				} catch (Exception e) {
					e.printStackTrace();
				}
			});
			// ִ���߳��࣬��ͻ��˽������ݽ���
			thread.start();
		}
	}
}

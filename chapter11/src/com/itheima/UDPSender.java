package com.itheima;
import java.net.*;
//���Ͷ˳���
public class UDPSender {
	public static void main(String[] args) throws Exception {
		// ����һ��ָ���˿ں�Ϊ3000�ķ��Ͷ�DatagramSocket����
		DatagramSocket client = new DatagramSocket(3000);
		// ����Ҫ���͵�����
		String str = "hello world"; 
		// ����һ��DatagramPacket���ݱ����󣬷�װ���Ͷ���Ϣ�Լ����͵�ַ
		DatagramPacket packet = new DatagramPacket(str.getBytes(),
							    str.getBytes().length,
							    InetAddress.getByName("localhost"),8900);
		System.out.println("��ʼ������Ϣ...");
		client.send(packet); // ��������
		client.close();      // �ͷ���Դ
	}
}


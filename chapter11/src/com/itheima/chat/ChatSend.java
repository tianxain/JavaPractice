package com.itheima.chat;
import java.net.*;
import java.util.Scanner;
/**
 * �����������Ϣ�����
 */
public class ChatSend implements Runnable {
	// ���������Ϣ����ƽ̨DatagramSocket����
	private DatagramSocket client;
	// �������ĳ������ڷ���˿ں�
	private int targetPort; 
	public ChatSend(DatagramSocket client,int targetPort) {
		this.client = client;
		this.targetPort = targetPort;
	}
	public void run() {
		try {
			// ���벢��ȡ����Ҫ���͵�������Ϣ
			Scanner sc = new Scanner(System.in);
			while (true) {
				String data = sc.nextLine();
				// ��װ���ݵ� DatagramPacket���ݰ����Ͷ�����
				byte[] buf = data.getBytes();
				DatagramPacket packet = new DatagramPacket(buf, buf.length,
					   InetAddress.getByName("127.0.0.255"),targetPort);
				client.send(packet);
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}

package com.itheima.chat;
import java.net.*;
/**
 * ���������Ϣ���ն�
 */
public class ChatReceiver implements Runnable {
	// ��������շ�ƽ̨DatagramSocket����
	private DatagramSocket server;
	public ChatReceiver(DatagramSocket server) {
		this.server = server;
	}
	public void run() {
		try {
			// ����DatagramPacket���ݰ����ն���
			byte[] buf = new byte[1024];
			DatagramPacket packet = new DatagramPacket(buf, buf.length);
			while (true) {
				server.receive(packet);
				// ��ʾ����ӡ������Ϣ
				String str = new String(packet.getData(), 
								0, packet.getLength());
				System.out.println("�յ�" + packet.getAddress()
						+":"+packet.getPort()+ " ���͵�����:" + str);
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
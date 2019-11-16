package com.itheima;
import java.net.*;
//���ն˳���
public class UDPReceiver {
	public static void main(String[] args) throws Exception {
		// ����һ��ָ���˿ں�Ϊ8900�Ľ��ն�DatagramSocket����
		DatagramSocket server = new DatagramSocket(8900);
		// ����һ������Ϊ1024���ֽ����飬���ڽ�������
		byte[] buf = new byte[1024];
		// ����һ��DatagramPacket���ݱ��������ڷ�װ���յ�����
		DatagramPacket packet = new DatagramPacket(buf, buf.length);
		System.out.println("�ȴ���������...");
		while (true){
			// �ȴ��������ݱ����ݣ���û�н��յ�����֮ǰ�ᴦ������״̬
			server.receive(packet); 
			// ����DatagramPacket�ķ�����ý��յ�����Ϣ,��ת��Ϊ�ַ�����ʽ
			String str = new String(packet.getData(), 
                                       0, packet.getLength());
			System.out.println(packet.getAddress()+ ":" 
									+ packet.getPort()+"������Ϣ��"+str);
		}
	}
}


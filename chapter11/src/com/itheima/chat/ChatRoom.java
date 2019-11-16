package com.itheima.chat;
import java.net.*;
import java.util.Scanner;
// ����������
public class ChatRoom {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("�������������ǰ�����˿ںţ�");
		int serverPort = sc.nextInt();
		System.out.print("�����������������Ϣ�����Ŀ��˿ںţ�");
		int targetPort = sc.nextInt();
		System.out.println("����ϵͳ��ʼ����ɲ�����������");	
		try {
			// ������������շ�ƽ̨DatagramSocket����
			DatagramSocket socket = new DatagramSocket(serverPort);
			// �ֱ�������Ϣ���ն˺ͷ��Ͷ˳���
		    new Thread(new ChatReceiver(socket), "���շ���").start();
		    new Thread(new ChatSend(socket,targetPort),"���ͷ���").start();
		} catch (SocketException e) {
			e.printStackTrace();
		}
	}
}

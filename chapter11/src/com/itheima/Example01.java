package com.itheima;
import java.net.InetAddress;
public class Example01 {
	public static void main(String[] args) throws Exception {
         // ��ȡ��������InetAddress����
		InetAddress localAddress = InetAddress.getLocalHost();
         // ��ȡ������Ϊ��www.itcast.cn����InetAddress����
		InetAddress remoteAddress =
                                 InetAddress.getByName("www.itcast.cn");
		System.out.println("������IP��ַ��" 
                                + localAddress.getHostAddress());
		System.out.println("itcast��IP��ַ��" 
                                + remoteAddress.getHostAddress());
		System.out.println("3�����Ƿ���Է��ʣ�" 
                                + remoteAddress.isReachable(3000));
		System.out.println("itcast��������Ϊ��" 
                                + remoteAddress.getHostName());
	}
}



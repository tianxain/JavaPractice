package com.itheima;
import java.nio.CharBuffer;
public class Example18 {
	public static void main(String[] args){
         // ����CharBuffer���󣬲�ָ��������������СΪ6
		CharBuffer charBuffer = CharBuffer.allocate(6);
		System.out.println("������" + charBuffer.capacity());
		System.out.println("����ֵ��" + charBuffer.limit());
		System.out.println("��ʼλ�ã�" + charBuffer.position());
		// ��CharBuffer�����з���3��Ԫ��
		charBuffer.put('x');
		charBuffer.put('y');
		charBuffer.put('z');
         System.out.println("����Ԫ�غ�Ľ���ֵ��" + charBuffer.limit());
		System.out.println("����Ԫ�غ��λ�ã�" + charBuffer.position());
		// ִ��flip()����
		charBuffer.flip();
		System.out.println("ִ��flip()��Ľ���ֵ��" + charBuffer.limit());
		System.out.println("ִ��flip()���λ�ã�" + charBuffer.position());
		// ȡ����1��Ԫ��
		System.out.println("ȡ���ĵ�1��Ԫ��Ϊ��" + charBuffer.get());
		System.out.println("ȡ����Ľ���ֵ��" + charBuffer.limit());
		System.out.println("ȡ�����λ�ã�" + charBuffer.position());
		// ִ��clear()����
		charBuffer.clear();
		System.out.println("ִ��clear()��Ľ���ֵ��" + charBuffer.limit());
		System.out.println("ִ��clear()���λ�ã�" + charBuffer.position());
		// ȡ����1��Ԫ��
		System.out.println("ȡ���ĵ�1��Ԫ��Ϊ��" + charBuffer.get(0));
		System.out.println("ȡ����Ľ���ֵ��" + charBuffer.limit());
		System.out.println("ȡ�����λ�ã�" + charBuffer.position());	
	}
}



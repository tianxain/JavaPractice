package com.itheima;
public class Example03 {
	public static void main(String[] args) {
		byte b =3;
		short s =4;
		char c =5;  
		//��byte��short��char������ֵ��ӣ��ٸ�ֵ��byte����
//		byte b2 = b+s+c;  
		byte b2 = (byte) (b+s+c);
         System.out.println("b2=" + b2);
	}
}



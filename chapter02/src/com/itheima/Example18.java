package com.itheima;
public class Example18 {
	public static void main(String[] args) {
		// 1����һ�ַ�ʽ��������
		int[] ids = new int[100];	
		System.out.println("ids[0]="+ids[0]);   //���������һ��Ԫ��
		System.out.println("ids[99]="+ids[99]); //�����������һ��Ԫ��
		System.out.println("==============");
		// 2���ڶ��ַ�ʽ��������
		String[] names = new String[]{"����","tom","jack"};  
		System.out.println("names[0]="+names[0]);     //���������һ��Ԫ��
		System.out.println("names[2]="+names[2]);     //�����������һ��Ԫ��
		System.out.println("==============");
		// 3�������ַ�ʽ��������
		Object[] object = {"����","tom","jack"};  
		System.out.println("����ĳ���Ϊ��"+object.length);//��ȡ����ĳ���
		System.out.println("object[0]="+object[0]);   //���������һ��Ԫ��
		System.out.println("object[2]="+object[2]);   //�����������һ��Ԫ��
	}
}



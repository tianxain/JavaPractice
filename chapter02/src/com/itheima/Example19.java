package com.itheima;
public class Example19 {
	public static void main(String[] args) {
		// 1����һ�ַ�ʽ��������
		int[] ids = new int[100];	
		System.out.println("ids[0]="+ids[0]);  //���������һ��Ԫ��
		// Ϊ����ָ��Ԫ�ؽ��г�ʼ����ֵ
		ids[0] = 2500;
		System.out.println("ids[0]="+ids[0]);  //�ٴη��������һ��Ԫ��
		System.out.println("==============");
		// 2���ڶ��ַ�ʽ��������
		String[] names = new String[]{"����","tom","jack"};  
		System.out.println("names[0]="+names[0]);   //���������һ��Ԫ��
		// Ϊ���鶨��ʱָ���ĳ�ʼֵ�����޸�
		names[0] = "����";
		System.out.println("names[0]="+names[0]);   //�ٴη��������һ��Ԫ��
		System.out.println("==============");
		// 3�������ַ�ʽ��������
		Object[] object = {"����","tom","jack"};  
		System.out.println("object[0]="+object[0]); //���������һ��Ԫ��
		// Ϊ���鶨��ʱָ���ĳ�ʼֵ�����޸�
		object[0] = "����";
		System.out.println("object[0]="+object[0]); //�ٴη��������һ��Ԫ��
	}
}



package com.itheima;
public class Example06 {
	public static void main(String[] args) {
		String str = "2018-01-24";
		// �������ַ�����ȡ����
		System.out.println("�ӵ�6���ַ���ȡ��ĩβ�Ľ����" 
		                       + str.substring(5));
		System.out.println("�ӵ�6���ַ���ȡ����7���ַ��Ľ����" 
		                       +str.substring(5, 7));
		// �������ַ����ָ����
		System.out.print("�ָ����ַ��������е�Ԫ������Ϊ:");
		// ͨ���������ӷ����������ַ���ת��Ϊ�ַ�������
		String[] strArray = str.split("-");
		// ѭ����������е�Ԫ��
		for (int i = 0; i < strArray.length; i++) {
			if (i != strArray.length - 1) {
				// ���������������һ��Ԫ��,��Ԫ�غ���Ӷٺ�
				System.out.print(strArray[i] + "��");
			} else {
				// ��������һ��Ԫ�غ��治�Ӷٺ�
				System.out.println(strArray[i]);
			}
		}
	}
}



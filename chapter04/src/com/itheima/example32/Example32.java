package com.itheima.example32;
public class Example32 {
    // ����ķ���ʵ�������������������ʹ��throws�ؼ��������׳��쳣
	public static int divide(int x, int y) throws Exception {
		int result = x / y;      //����һ������result��¼����������Ľ��
		return result;           //���������
	}
	public static void main(String[] args) {
		try {
			int result = divide(4, 0);  //����divide()����
			System.out.println(result); 
		} catch (Exception e) {         //�Բ��񵽵��쳣���д���
			System.out.println("������쳣��ϢΪ��" + e.getMessage());
		}
	}
}



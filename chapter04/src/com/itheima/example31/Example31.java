package com.itheima.example31;
public class Example31 {
    // ����ķ���ʵ�������������������ʹ��throws�ؼ��������׳��쳣
	public static int divide(int x, int y) throws Exception {
		int result = x / y;            // �������result��¼����������Ľ��
		return result;                 // ���������
	}
	public static void main(String[] args) {
		int result = divide(4, 0);     // ����divide()����
		System.out.println(result);
	}
}



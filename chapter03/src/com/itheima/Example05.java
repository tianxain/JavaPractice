package com.itheima;
public class Example05 {
	// 1��ʵ�������������
	public static int add01(int x, int y) {
		return x + y;
	}
	// 2��ʵ�������������
	public static int add02(int x, int y, int z) {
		return x + y + z;
	}
	// 3��ʵ������С�����
	public static double add03(double x, double y) {
		return x + y;
	}
	public static void main(String[] args) {
		// �����ͷ����ĵ���
		int sum1 = add01(1, 2);
		int sum2 = add02(3, 4, 7);
		double sum3 = add03(0.2, 5.3);
		//��ӡ��͵Ľ��
		System.out.println("sum1=" + sum1);
		System.out.println("sum2=" + sum2);
		System.out.println("sum3=" + sum3);
	}
}



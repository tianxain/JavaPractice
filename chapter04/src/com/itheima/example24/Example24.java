package com.itheima.example24;
//����һ������ʽ�ӿ�
@FunctionalInterface
interface Calcable {
	int calc(int num);
}
//����һ���࣬�������ж���һ����̬����
class Math {
	// ����һ�������ֵ����
	public static int abs(int num) {
		if (num < 0) {
			return -num;
		} else {
			return num;
		}
	}
}
//���������
public class Example24 {
	private static void printAbs(int num, Calcable calcable) {
		System.out.println(calcable.calc(num));
	}
	public static void main(String[] args) {
		// ʹ��Lambda���ʽ��ʽ
		printAbs(-10, n -> Math.abs(n));
		// ʹ�÷������õķ�ʽ
		printAbs(-10, Math::abs);
	}
}

package com.itheima;
public class Example15 {
	public static void main(String[] args) {
		int x = 1;         // �������x����ʼֵΪ1
		while (x <= 4) {   // �ж�ѭ�������Ƿ����
			System.out.println("x = " + x); // ������������ӡx��ֵ
			if (x == 3) {
				break;     // ʹ��break��䣬��x==3ʱ����whileѭ��
			}
			x++;          // ���Ʊ���x����������
		}
	}
}



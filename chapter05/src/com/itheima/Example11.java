package com.itheima;
public class Example11 {
	public static void main(String[] args) {
		int[] srcArray = { 101, 102, 103, 104, 105, 106 }; // Դ����
		int[] destArray = { 201, 202, 203, 204, 205};      // Ŀ������
		System.arraycopy(srcArray, 2, destArray, 0, 4);    // ��������Ԫ��
		// ��ӡĿ�������е�Ԫ��
		for (int i = 0; i < destArray.length; i++) {
			System.out.println(i + ": " + destArray[i]);
		}
	}
}


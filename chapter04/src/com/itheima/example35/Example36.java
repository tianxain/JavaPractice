package com.itheima.example35;
public class Example36 {
	// ����ķ���ʵ�����������������
     public static int divide(int x,int y) throws DivideByMinusException {
		if (y == 0) {
			// ʹ��throw�ؼ��������쳣����
			throw new DivideByMinusException("������0");
		}
		int result = x / y; // ����һ������result��¼����������Ľ��
		return result;      // ���������
	}
	public static void main(String[] args) {
		try {
			int result = divide(4, 0);
			System.out.println(result);
		} catch (DivideByMinusException e) {
			System.out.println("������쳣��ϢΪ��" + e.getMessage());
		}
	}
}


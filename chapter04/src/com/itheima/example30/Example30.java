package com.itheima.example30;
public class Example30 {
    // ����ķ���ʵ���������������
	public static int divide(int x, int y) { 
		try {
			int result = x / y;      // ����һ������result��¼����������Ľ��
			return result;           // ���������
		} catch (Exception e) {      // ���쳣���в�����
			System.out.println("������쳣��ϢΪ��" + e.getMessage());
		} finally {
		   System.out.println("ִ��finally�����,���۳����Ƿ��쳣������ִ��");
		}
		// ���嵱�������쳣ֱ�ӷ���-1
		return -1;
	}
	public static void main(String[] args) {
        int result = divide(4, 0);  // ����divide()����
		if(result == -1){           // �Ե��÷������ؽ�������ж�
			System.out.println("�������쳣��"); 
		}else{
			System.out.println(result); 
		}
	}
}




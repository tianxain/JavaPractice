package com.itheima;
public class Example14 {
	public static void main(String[] args) {
		// ���ѭ��,����i�������1~9��
		for (int i = 1; i <= 9; i++) {  
			// �ڲ�ѭ��������j�������1~9��
			for (int j = 1; j <= i; j++) {  
				//ʹ���ַ���ƴ�ӵ���ʽ����ӡÿ���ڲ�ѭ����ִ�����
				System.out.print(j+"*"+i +"="+ j*i +"\t");  
			}
			// ʹ��println()�����������ѭ�����л���
			System.out.println("");    
		}
	}
}


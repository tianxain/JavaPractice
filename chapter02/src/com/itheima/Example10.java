package com.itheima;
public class Example10{
	public static void main(String[] args) {
		int month = 5; //���赱ǰΪ5�·�
		switch (month) {
		case 12:
		case 1:
		case 2:
			System.out.println("��ǰΪʱ��Ϊ����");
			break;
		case 3:
		case 4:
		case 5:
			System.out.println("��ǰʱ��Ϊ����");
			break;
		case 6:
		case 7:
		case 8:
			System.out.println("��ǰʱ��Ϊ�ļ�");
			break;
		case 9:
		case 10:
		case 11:
			System.out.println("��ǰʱ��Ϊ����");
			break;
		default:
			System.out.println("������·ݲ���ȷ������");
			break;
		}
	}
}



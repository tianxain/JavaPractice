package com.itheima.example25;
//����һ������ʽ�ӿ�
@FunctionalInterface
interface Printable{
	void print(String str);
}
class StringUtils {
	public void printUpperCase(String str) {
		System.out.println(str.toUpperCase());
	}
}
//���������
public class Example25 {
	private static void printUpper(String text, Printable pt) {
		pt.print(text); 
	}
	public static void main(String[] args) {
		StringUtils stu = new StringUtils();
		// ʹ��Lambda���ʽ��ʽ
		printUpper("Hello", t -> stu.printUpperCase(t));
		// ʹ�÷������õķ�ʽ
		printUpper("Hello", stu::printUpperCase);
	}
}


package com.itheima.example27;
//����һ������ʽ�ӿ�
@FunctionalInterface
interface Printable{
	void print(StringUtils su, String str);
}
class StringUtils {
	public void printUpperCase(String str) {
		System.out.println(str.toUpperCase());
	}
}
//���������
public class Example27 {
	private static void printUpper(StringUtils su, String text, 
								Printable pt) {
		pt.print(su, text); 
	}
	public static void main(String[] args) {
		// ʹ��Lambda���ʽ��ʽ
		printUpper(new StringUtils(), "Hello",
                                  (object, t) -> object.printUpperCase(t));
		// ʹ�÷������õķ�ʽ
	  printUpper(new StringUtils(), "Hello",
                                  StringUtils::printUpperCase);
	}
}



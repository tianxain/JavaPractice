package com.itheima;
import java.text.*;
public class Example27 {
	public static void main(String[] args) throws ParseException{
	    // ����һ��SimpleDateFormat���󣬲�ָ�����ڸ�ʽ
 		SimpleDateFormat sdf = new SimpleDateFormat("yyyy/MM/dd");
 		// ����һ�����ڸ�ʽ���ַ���
 		String str = "2018/01/27";
 		// ���ַ���������Date����
 		System.out.println(sdf.parse(str));
	}
}


package com.itheima;
import java.time.*;
import java.time.format.*;
public class Example28 {
	public static void main(String[] args) {
		LocalDateTime date = LocalDateTime.now();
		// 1��ʹ�ó�������DateTimeFormatter
	    System.out.print("ʹ�ó�������DateTimeFormatter: ");
	    DateTimeFormatter dtf1 = DateTimeFormatter.ISO_DATE_TIME;
	    System.out.println(dtf1.format(date));
		// 2��ʹ��Long���ͷ���DateTimeFormatter
		System.out.print("ʹ��MEDIUM���ͷ���DateTimeFormatter: ");
		DateTimeFormatter dtf2 = DateTimeFormatter
				                   .ofLocalizedDateTime(FormatStyle.MEDIUM);
		System.out.println(dtf2.format(date));
		// 3������ģʽ�ַ���������DateTimeFormatter��ʽ��
		System.out.print("����ģʽ�ַ���������DateTimeFormatter: ");
		DateTimeFormatter dtf3 = DateTimeFormatter
				                   .ofPattern("yyyy-MM-dd HH:mm:ss");
		System.out.println(date.format(dtf3));
	}
}

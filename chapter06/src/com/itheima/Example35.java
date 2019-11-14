package com.itheima;
import java.util.stream.Stream;
public class Example35 {
	public static void main(String[] args) {
		// ͨ���ַ���Դ���ݴ�����һ��Stream������
		Stream<String> stream = Stream.of("a1", "a2", "b1", "c2", "c1");
		stream.filter(s -> s.startsWith("c")) // ɸѡ�������ԡ�c����ͷ��Ԫ��
		      .map(String::toUpperCase)       // ����Ԫ�ؽ���ӳ�䣬��ȫ���ַ���Ϊ��д
		      .sorted()                       // ����Ԫ�ؽ�������
		      .forEach(System.out::println);  // ����Ԫ�ؽ��б������
	}
}

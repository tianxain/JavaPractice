package com.itheima;
import java.util.stream.Stream;
public class Example33 {
	public static void main(String[] args) {
		// ͨ���ַ���Դ���ݴ�����һ��Stream������
		Stream<String> stream = Stream.of("����","����","��С��","����");
		// ͨ��forEach��������Stream�������е�Ԫ��
		stream.forEach(i -> System.out.println(i));
	}
}


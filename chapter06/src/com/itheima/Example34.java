package com.itheima;
import java.util.stream.Stream;
public class Example34 {
	public static void main(String[] args) {
		// ͨ���ַ���Դ���ݴ�����һ��Stream������
		Stream<String> stream = Stream.of("����","����","��С��","����");
		stream.filter(i -> i.startsWith("��"))//ɸѡ�ԡ��š���ͷ��Ԫ��
			  .filter(i -> i.length()>2)       //ɸѡ���ȴ���2��Ԫ��
			  .forEach(System.out::println);  // ����Ԫ�ؽ��б������
	}
}


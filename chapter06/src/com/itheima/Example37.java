package com.itheima;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;
public class Example37 {
	public static void main(String[] args) {
		// ͨ���ַ���Դ���ݴ�����һ��Stream������
		Stream<String> stream = Stream.of("����","����","��С��","����");
		// ͨ��filter()����ɸѡ���ַ������ԡ��š���ͷ��Ԫ�أ�
		// ���ͨ��collect()���������ս����������Ԫ���ռ���һ��List������
		List<String> list = stream.filter(i -> i.startsWith("��"))
								   .collect(Collectors.toList());
		System.out.println(list);
		Stream<String> stream2 = Stream.of("����","����","��С��","����");
		// ͨ��filter()����ɸѡ���ַ������ԡ��š���ͷ��Ԫ�أ�
	    // ͨ��collect()���������ս����������Ԫ��ʹ��" and "�����ռ���һ���ַ�����
		String string = stream2.filter(i -> i.startsWith("��"))
				                  .collect(Collectors.joining(" and "));
		System.out.println(string);
	}
}


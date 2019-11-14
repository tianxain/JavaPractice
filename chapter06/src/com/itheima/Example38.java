package com.itheima;
import java.util.*;
import java.util.stream.Stream;
public class Example38 {
	public static void main(String[] args) {
		// ����һ��List��������Դ
		List<String> list = Arrays.asList("����","����","��С��","����");
		// 1��ֱ��ʹ��Collection�ӿڵ�parallelStream()����������
		Stream<String> parallelStream = list.parallelStream();
		System.out.println(parallelStream.isParallel());
		// ����һ��Stream������
		Stream<String> stream = Stream.of("����","����","��С��","����");
		// 2��ʹ��BaseStream�ӿڵ�parallel()������������ת��Ϊ������
		Stream<String> parallel = stream.parallel();
		System.out.println(parallel.isParallel());
	}
}


package com.itheima;
import java.util.*;
import java.util.stream.Stream;
public class Example32 {
	public static void main(String[] args) {
		Integer[] array = { 9, 8, 3, 5, 2 };       // ����һ������
		List<Integer> list = Arrays.asList(array); // ������ת��ΪList����
		// 1��ʹ�ü��϶����stream()��̬��������Stream������
		Stream<Integer> stream = list.stream();
		stream.forEach(i -> System.out.print(i+" "));
		System.out.println();
		// 2��ʹ��Stream�ӿڵ�of()��̬��������Stream������
		Stream<Integer> stream2 = Stream.of(array);
		stream2.forEach(i -> System.out.print(i+" "));
		System.out.println();
		// 3��ʹ��Arrays���鹤�����stream()��̬��������Stream������
		Stream<Integer> stream3 = Arrays.stream(array);
		stream3.forEach(i -> System.out.print(i+" "));
	}
}

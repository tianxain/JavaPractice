package com.itheima;
import java.util.*;
import java.util.stream.Stream;
public class Example31 {
	public static void main(String[] args) {
          // ����һ��List���϶���
		List<String> list = new ArrayList<>(); 
		list.add("����");
		list.add("����");
		list.add("��С��");
		list.add("����");
		// 1������һ��Stream������
		Stream<String> stream = list.stream();
		// 2����Stream���е�Ԫ�طֱ���й��ˡ���ȡ����
		Stream<String> stream2 = stream.filter(i -> i.startsWith("��"));
		Stream<String> stream3 = stream2.limit(2);
		// 3����Stream���е�Ԫ�ؽ����ս���������б������
		stream3.forEach(j -> System.out.println(j));
		System.out.println("=======");
         // ͨ����ʽ���ʽ����ʽ��ɾۺϲ���
		list.stream().filter(i -> i.startsWith("��"))
					 .limit(2)
					 .forEach(j -> System.out.println(j));
	}
}



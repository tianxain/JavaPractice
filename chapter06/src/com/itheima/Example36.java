package com.itheima;
import java.util.stream.Stream;
public class Example36 {
	public static void main(String[] args) {
		// ͨ���ַ���Դ���ݴ�����һ��Stream������
		Stream<String> stream = Stream.of("����","����","��С��","����");
		stream.skip(1)						 // �������е�ǰ1��Ԫ��
		      .limit(2)                      // ��ȡ���е�ǰ2��Ԫ��
		      .forEach(System.out::println); // ����Ԫ�ؽ��б������
	}
}

package com.itheima;
import java.util.HashMap;
import java.util.Map;
public class Example16 {
	public static void main(String[] args) {
		Map map = new HashMap();     
		map.put("1", "Jack");        
		map.put("2", "Rose");
		map.put("3", "Lucy");
		System.out.println(map);
		// ʹ��JDK 8������forEach(BiConsumer action)������������
		map.forEach((key,value) -> System.out.println(key + ":" + value));
	}
}
